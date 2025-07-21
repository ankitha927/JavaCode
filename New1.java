//reverse array
//Declare an integer array of size 5

//Take 5 inputs from the user

//Print the array in reverse order
import java.util.Scanner;
public class New1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Arrsy in reverse order");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        
    }}

