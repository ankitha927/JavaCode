
import java.util.Arrays;
import java.util.Scanner;

public class MissingNo1 {
    public static void miss(int[] num){
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){
            if(num[i+1]-num[i]>1){
                System.out.println("the missing no is "+(num[i]+1));
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size");
       int n=sc.nextInt();
       System.out.println("Enter the elemnts");
       int[] num=new int[n];
       for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
       }
       miss(num);
    }
}
