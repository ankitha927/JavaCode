public class MatrixDiagonalPrint {
    public static void main(String[] args) {
        int[][] matrix = {
            {11, 22, 33, 44, 55},
            {15, 16, 17, 18, 19},
            {21, 31, 41, 51, 61},
            {10, 20, 30, 40, 50}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            int r=i,c=0;
            while(r>=0&&c<cols){
                System.out.print(matrix[r][c] +" ");
                r--;
                c++;
            }
            System.out.println();
        }

        for(int j=1;j<cols;j++){
            int r=rows-1,c=j;
            while(r>=0&&c<cols){
                System.out.print(matrix[r][c]+" ");
                r--;
                c++;
            }
            System.out.println();
        }
    }
}
