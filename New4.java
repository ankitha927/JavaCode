public class New4 {
    public static int Summ(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println("sum is"+Summ(num));
    }}

