import java.util.Scanner;

public class MissingNo {
    public static int missingNo(int[] num){
        int n=num.length+1;
        int total=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        return total-sum;
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
        System.out.println("Missing number is: " + missingNo(num));
    }
}
