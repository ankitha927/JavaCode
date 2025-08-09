import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static int[] TwoSum(int[] numbers,int target){
        int left=0,right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{numbers[left],numbers[right]};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        //TwoSum obj=new TwoSum();
        int[] ans=TwoSum.TwoSum(numbers,target);
        System.out.println("Result is: "+Arrays.toString(ans));


    }
    
}
