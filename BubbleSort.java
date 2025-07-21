import java.util.Scanner;
public class BubbleSort {
    public static void sort(int[] num){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int m=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] num=new int[m];
        for(int i=0;i<m;i++){
            num[i]=sc.nextInt();
        }
        BubbleSort.sort(num);
        System.out.println("Sorted array is : ");
        for(int i=0;i<num.length;i++){
        System.out.print(num[i]+ " ");
        }

    }
    
}
