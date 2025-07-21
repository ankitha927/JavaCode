import java.util.Scanner;
public class Rotate{
    public void rotate(int [][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
       for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][n-1-j];
            matrix[i][n-1-j]=temp;

        }
       } 

    }
    public void printMatrix(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rotate obj=new Rotate();
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        obj.printMatrix(matrix);

        obj.rotate(matrix);

        System.out.println("\nRotated Matrix (90 degrees clockwise):");
        obj.printMatrix(matrix);
    }


    }


