public class Permuationn {
    public static void main(String[] args) {
        int []arr={0,1,2};
        int a=arr.length;
        int temp=0;
        for(int i=0;i<a;i++){
            System.out.print(arr[0]+" ");
            for(int j=1;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        
        System.out.print(arr[0]+" ");
        for(int j=a-1;j>0;j--){
            System.out.print(arr[j]+" ");
        }
        temp=arr[0];
        for(int j=1;j<a;j++){
            arr[j-1]=arr[j];
        }
        arr[a-1]=temp;
        System.out.println();
    }
}
}
