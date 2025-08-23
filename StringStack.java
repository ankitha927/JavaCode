import java.util.Stack;

public class StringStack {
    static int count=0;
    public static void main(String[] args) {
        String s="I am god";
        String arr[]=s.split("\\s");
        Stack<String> stack=new Stack<>();
        for(String i:arr)
        stack.push(i);
        for(int i=0;i<arr.length;i++){
            char ch[]=stack.pop().toCharArray();
            for(int j=0;j<ch.length;j++){
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