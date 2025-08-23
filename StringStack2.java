import java.util.Stack;

public class StringStack2 {
    static int count=0;
    public static void main(String[] args) {
        String s="I am bad";
        String arr[]=s.split("\\s");
        Stack<String> stack=new Stack<>();
        for(String i:arr)
        stack.push(i);
        for(int i=0;i<arr.length;i++){
            char ch[]=stack.pop().toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                if(s.charAt(count)==' '){
                    System.out.print(" ");
                    count++;
            }
            System.out.print(ch[j]);
            count++;
        }


    }
}
}