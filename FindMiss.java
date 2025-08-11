public class FindMiss{
    public static int miss(int []num){
      int n=num.length+1;
      int sum=n*(n+1)/2;
      int sum2=0;
      
      for(int i=0;i<num.length;i++){
        sum2=sum2+num[i];
      }
     return sum-sum2;
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,6};
        int ans= FindMiss.miss(num);
        System.out.println("the missing no is:"+ans);
    }
}