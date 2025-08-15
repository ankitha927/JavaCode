import java.util.Arrays;

public class Rotate {
    public static void rotate(int[]num , int k){
       int n=num.length;
       k=k%n;

        reverse(num,0,n-1);
        reverse(num,1,k-1);
        reverse(num,k,n-1);

    }
    public static int[] reverse(int []num,int start,int end){
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
        int[] num={1,2,3,4,5};
        rotate(num, 2);
        System.out.println("the new array is: "+Arrays.toString(num));
    }
}
