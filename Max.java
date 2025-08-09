public class Max {
    public int max(int[] num){
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num={3,7,2,9,4};
        Max obj=new Max();
        int ans=obj.max(num);
        System.out.println("MAx element is: "+ans);
    }
}
