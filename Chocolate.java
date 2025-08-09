import java.util.Scanner;
public class Chocolate {
    public  int chocolate(int n,int[] age){
     int count=0,i,j;
     for( i=0;i<n;i++){
        
        
        for(j=0;j<n;j++){
           if(age[i]<=age[j]){
           count++;
           }
           else{
            j++;
           }
        }
        i++;
        }
        return count;
     }
     
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] age= new int[n];
        System.out.println("Enter the age:");
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();

        }
        Chocolate ch=new Chocolate();
        int res=ch.chocolate(n, age);
        System.out.println("the total chocolates required are:"+res);
    }

}