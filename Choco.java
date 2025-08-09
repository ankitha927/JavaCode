import java.util.Scanner;
public class Choco {
    public  int chocolate(int n,int[] age){
     int i,sum1=0;
     int [] count=new int[100];
     for( i=0;i<n;i++){
        if(age[i]>0){
            count[i]=1;
        }
        
        for(i=0;i<n;i++){
           if(age[i]<age[i+1])
           count[i+1]=count[i]+1;
           
          
        }
        
        for( i=0;i<n;i++){
          sum1=sum1+count[i];
        }
        }
        return sum1;
     }
     
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] age= new int[n];
        System.out.println("Enter the age:");
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();

        }
        Choco ch=new Choco();
        int res=ch.chocolate(n, age);
        System.out.println("the total chocolates required are:"+res);
    }

}