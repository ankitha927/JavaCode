
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] num,int target){
        int sum=0;
        for(int i=0;i<num.length;i++){
            for(int j=1;j<num.length;j++){
                sum=num[i]+num[j];
                if(sum==target)
                    return new int[]{i,j};
                
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] num={2,7,11,15};
        int target=9;
        int[] res=TwoSum.twoSum(num, target);
        System.out.println("the index are "+Arrays.toString(res));

    }
}
