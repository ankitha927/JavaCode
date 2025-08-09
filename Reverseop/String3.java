
import java.util.Arrays;

public class String3 {
    public  int[] reverse(int[] num){
        int start=0,end=num.length-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
        return num;
    }
   public static void main(String[] args) {
       int []num={1,2,3};
       String3 obj=new String3();
       int[] ans=obj.reverse(num);
       System.out.println("reversed :"+Arrays.toString(ans));

   } 
}
