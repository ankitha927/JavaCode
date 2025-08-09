
import java.util.Arrays;

public class Square{
    public int[] square(int[] num){
        int n=num.length;
        int []res=new int[n];
        for(int i=0;i<num.length;i++){
            res[i]=num[i]*num[i];

        }
        return res;
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        Square obj=new Square();
        int[] ans=obj.square(num);
        System.out.println("The squared array is:"+ Arrays.toString(ans));
    }
}