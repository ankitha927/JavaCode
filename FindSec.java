public class FindSec {
    public static int findSecMax(int [] num){
          int max=num[0];
          int sec=num[0];
          for(int i=1;i<num.length;i++){
            if(num[i]>max){
                sec=max;
                max=num[i];
            }
            if(num[i]!=max&&num[i]>sec){
                sec=num[i];
            }

          }
          return sec;
    }
    public static void main(String[] args) {
        int [] num={10,30,20,77,50,56,100};
        int secmax=FindSec.findSecMax(num);
        System.out.println("the second max is : "+secmax);
    }
    
}
