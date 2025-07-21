import java.util.Scanner;
public class MaxContainer {
    public int MaxContainer(int[] height){
        int left=0,right=height.length-1,max=0;
        while(left<right){
             max=Math.max(max,Math.min(height[left],height[right])*(right-left));
             if(height[left]<height[right]) left++;
             else right--;

        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        System.out.println("Enter the elements");
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        MaxContainer obj=new MaxContainer();
        int ans=obj.MaxContainer(height);
        System.out.println("The result is: "+ans);

    }
}
