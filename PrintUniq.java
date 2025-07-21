import java.util.Arrays;
import java.util.Scanner;
public class PrintUniq {
    public int unique(int[] num){
        if(num.length==0) return 0;
        int i=0;
        for(int j=1;j<num.length;j++){
            if(num[j]!=num[i]){
                i++;
                num[i]=num[j];
            }
        }
        return i+1;

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
        System.out.println("Sorted array is: ");
       Arrays.sort(num);
       for(int i=0;i<num.length;i++){
         System.out.print(num[i] + " ");
       }
       System.out.println();
       PrintUniq obj=new PrintUniq();
       int ans=obj.unique(num);

       System.out.println("New array after removing duplicate: ");
       for(int i=0;i<ans;i++){
         System.out.print(num[i] + " ");
       }
       
    }
    
}
