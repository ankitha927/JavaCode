import java.util.Arrays;
import java.util.Scanner;

public class NotSelfPro {
    public int[] NotSelfPro(int[] num){
        int n=num.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        int left=1;
        for(int i=0;i<n;i++){
            res[i]=res[i]*left;
            left=left*num[i];

        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*right;
            right=right*num[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int m=sc.nextInt();
        System.out.println("ENter the elements: ");
        int[] num=new int[m];
        for(int i=0;i<m;i++){
            num[i]=sc.nextInt();

        }
        NotSelfPro obj=new NotSelfPro();
        int[] ans= obj.NotSelfPro(num);
        System.out.println("The result is: "+Arrays.toString(ans));

    }
}
