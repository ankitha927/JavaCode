public class String2 {
    public static void reverse(char[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverse(arr);
        System.out.println(arr);
    }
}
