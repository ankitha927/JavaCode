public class StringReverse {
    public static void main(String[] args) {
        String s1="I am god";
        String arr[]=s1.split("\\s");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
