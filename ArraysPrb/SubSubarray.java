import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SubSubarray {

    public static List<List<Integer>> subarray(int num[],int k){
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<num.length;i++){
            int sum=0;
            List <Integer> temp=new ArrayList<>();
            for(int j=i;j<num.length;j++){
                sum=sum+num[j];
                temp.add(num[j]);
                if(sum==k){
                    result.add(new ArrayList<>(temp));
                }


            }
        }
        return result;
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
       System.err.println("Enter value of k: ");
       int k=sc.nextInt();
       List<List<Integer>> subarray=subarray(num, k);
       System.out.println("The result  id:"+subarray);
       System.out.println("Count: " + subarray.size());
    }
}
