public class Same{
    public static int max(int[] num){
        int max1=num[0];
        int second=num[0];
        
        for(int i=0;i<num.length;i++){
            if(num[i]>max1){
                second=max1;
                max1=num[i];
            }
        for(int j=0;j<num.length;j++){
            if(num[j]!=max1&&num[j]>second){
                second=num[j];
            }
        }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] num={22,4,65,14,28,71,45,77};
        Same ob=new Same();
        int res=ob.max(num);
        System.out.println("The max number is "+res);
    }
}