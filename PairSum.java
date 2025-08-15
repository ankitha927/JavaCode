public class PairSum {
    public static int psu(int []num,int k){
        int count=0;
        for(int i=0;i<num.length-1;i++){
        for(int j=i+1;j<num.length;j++){
            if(num[i]+num[j]==k){
                count++;
                
            }
        }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] num={1,5,7,-1,5};
        int res=PairSum.psu(num, 6);
        System.out.println("the count of pairs are: "+res);
    }
}
