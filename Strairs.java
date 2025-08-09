import java.util.Scanner;

public class Strairs {
    public static int stair(int n){
        if(n<=2) return n;
        int first=1;
        int second=2;
        int current;
        for(int i=3;i<=n;i++){
        current=first+second;
          first=second;
          second=current;
        }
        return second;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the no of ways "+Strairs.stair(n));
    }
}
