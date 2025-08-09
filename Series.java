import java.util.Arrays;
import java.util.Scanner;
public class Series{
    public static int[] series(int[] num,int n){
        
        int [] result= new int[n];
        for(int i=0;i<result.length;i++){
            result[i]=num[i];

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int count=0;
        int [] num=new int[100];

        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                if(count>=input)
                break;
                else{
                    num[count]=i;
                    count++;
                }

            }
        }
        // int[]  num={1,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,8};
        Series ob=new Series();
        int[] res=ob.series(num,input);
        System.out.println("array is: "+Arrays.toString(res));

    }

}