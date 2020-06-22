package levelThreeTask;

import java.util.Random;


public class LifeLogic {
    private int[][] lifeMatrix;
    private int matrixWidth;
    private int matrixHeight;
    private int density;

    public LifeLogic(int width , int height , int density){
        if(width < 10){
            this.matrixWidth = 10;
        }else{
            this.matrixWidth = width;
        }


        if(height < 10){
            this.matrixHeight = 10;
        }else{
            this.matrixHeight = height;
        }


        this.density = density < 1 ? 1 : density;

        this.lifeMatrix = new int[width][height];


        final Random random = new Random();
        for(int i = 0 ; i < width ; i++){
            for(int j = 0; j < height ; j++){
                this.lifeMatrix[i][j] = random.nextInt(density) == 1 ? 1 : 0;
            }
        }
    }

    public int[][] getMatrix(){
        return this.lifeMatrix;
    }
    public int getWidth(){
        return this.matrixWidth;
    }
    public int getHeight(){
        return this.matrixHeight;
    }
    public int getDensity(){
        return this.density;
    }

    /*
    1)Любая живая ячейка с менее чем двумя живыми соседями умирает, как если бы она была вызвана недостаточным населением.

    2)Любая живая клетка с двумя или тремя живыми соседями доживает до следующего поколения.

    3)Любая живая клетка с более чем тремя живыми соседями умирает, как если бы она была перенаселена.

    4)Любая мертвая клетка с ровно тремя живыми соседями становится живой клеткой, как если бы она воспроизводилась.
     */

    public void calculateNextGeneration(){

        for(int i = 0; i< matrixWidth ;i++){
            for(int j = 0 ; j < matrixHeight;j++){
                int countOfNeighbours = countNeighbours(i,j);
                boolean hasLife = this.lifeMatrix[i][j] == 1;

                if (hasLife && countOfNeighbours < 2 ) {
                    this.lifeMatrix[i][j] = 0;
                }
                else if ((countOfNeighbours == 2 || countOfNeighbours == 3) && hasLife) {
                    continue;
                }
                else if (countOfNeighbours > 3 && this.lifeMatrix[i][j] == 1) {
                    this.lifeMatrix[i][j] = 0;
                }
                else if(countOfNeighbours == 3){
                    this.lifeMatrix[i][j] = 1;
                }

            }
        }
    }

    private int countNeighbours(int x , int y){
        int count = 0;
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                int col = (x + i);
                int row = (y + j);

                if(col >= 0 && row >= 0 && col < matrixWidth && row < matrixHeight) {
                    boolean isSelfChecking = col == x && row == y;
                    boolean hasLife = this.lifeMatrix[col][row] == 1;

                    if (hasLife && !isSelfChecking) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int[][] calculateAndGetNextGeneration(){
        this.calculateNextGeneration();
        return this.lifeMatrix;
    }

}
