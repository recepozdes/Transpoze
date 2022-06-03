public class Main {

    public static void main(String[] args) {

        int row=2;
        int col=3;
        int[][] matrix = new int[row][col];
        int[][] transpozeMatrix = new int[col][row];
        matrix= new int[][]{{2, 3, 4}, {5, 6, 4}};

        System.out.println("Matris : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            transpozeMatrix[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpoze Matrisi : ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpozeMatrix[i][j]+" ");
            }
            System.out.println();
        }
       }
}
