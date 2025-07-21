import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public List<List<Integer>> threeSum(int num[]){
        Arrays.sort(num);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<num.length-2;i++){
            int left=i+1,right=num.length-1;
            if(i>0&&num[i]==num[i-1]) continue;
            while(left<right){
                int sum=num[i]+num[left]+num[right];
                if(sum==0){
                    res.add(Arrays.asList(num[i],num[left],num[right]));
                    while(left<right&&num[left]==num[left+1]) left++;
                    while(left<right&&num[right]==num[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }

        }
    return res;
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
       ThreeSum obj=new ThreeSum();
       List<List<Integer>> ans=obj.threeSum(num);
       System.out.println("the result is:"+ans);


    }
    
    
}
