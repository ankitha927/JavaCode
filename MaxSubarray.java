public class MaxSubarray {
    public static int max(int[]num){
      int max=num[0];
      int cur=num[0];
      for(int i=0;i<num.length;i++){
        cur=Math.max(num[i],num[i]+cur);
        max=Math.max(cur,max);
      }
      return max;

    }
    public static void main(String[] args) {
        int[] num={-2,1,-3,4,-1,2,1,-5,4};
        int res=MaxSubarray.max(num);
        System.out.println("The result is: "+res);
    }
}
