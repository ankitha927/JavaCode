
import java.util.Arrays;

public class MoveZero {
    public static int[] zero(int[] num){
       int i=0;
        for(int j=0;j<num.length;j++){
            if(num[j]!=0){
             num[i]=num[j];
             i++;
            }
        }
        while(i<num.length){
            num[i]=0;
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        int [] num={0,1,0,3,12};
        int[] res=MoveZero.zero(num);
        System.out.println("new array: "+Arrays.toString(res));
    }
}
