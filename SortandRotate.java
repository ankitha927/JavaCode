public class SortandRotate {
    public static boolean sr(int[] num){
        int minIndex=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<num[minIndex]){
                minIndex=i;
            }
        }

        for(int i=minIndex;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                return false;
            }
        }

        for(int i=0;i<minIndex-1;i++){
            if(num[i]>num[i+1]){
                return false;
            }
        }

        int n=num.length;
            if(num[n-1]>num[0]){
                return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        int [] num1={3,4,5,1,2};
        int [] num2={1,3,2,4};
        boolean n1=SortandRotate.sr(num1);
        boolean n2=SortandRotate.sr(num2);
        System.out.println(n1);
        System.out.println(n2);
    }
    
}
