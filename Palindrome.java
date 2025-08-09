import java.util.Scanner;
public class Palindrome {
    public boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str= sc.nextLine();
    Palindrome ob=new Palindrome();
    boolean res= ob.isPalindrome(str);
    if(res){
        System.err.println("yes");;
    }
    else{
        System.err.println("No");
    }

}
}

