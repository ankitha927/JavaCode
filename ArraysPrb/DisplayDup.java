import java.util.Scanner;
public class DisplayDup {
    public int removeDup(int[] num){
        int slow=num[0];
        int fast=num[0];
        do { 
            slow=num[slow];
            fast=num[num[fast]];
        } while (slow!=fast);

        slow=num[0];
        while(slow!=fast){
            slow=num[slow];
            fast=num[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("ENter the elements: ");
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();

        }
        DisplayDup obj=new DisplayDup();
        int ans=obj.removeDup(num);
        System.out.println("The duplicate no is: "+ans);
        
    }
    
}
