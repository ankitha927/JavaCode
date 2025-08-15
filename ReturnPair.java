import java.util.*;

public class ReturnPair {
    public static List<int[]> psu(int [] num,int k){
      List<int[]> pairs=new ArrayList<>();
      for(int i=0;i<num.length-1;i++){
        for(int j=i+1;j<num.length;j++){
            if(num[i]+num[j]==k){
                pairs.add(new int[]{num[i],num[j]});
            }
        }
      }
      return  pairs;
    }

     public static void main(String[] args) {
        int[] num = {1, 5, 7, -1, 5};
        List<int[]> result = ReturnPair.psu(num, 6);

        System.out.println("Pairs with sum 6:");
        for(int i=0;i<result.size();i++){
            int [] pair=result.get(i);
            System.out.print("["+pair[0] + ", " + pair[1]+"]"+",");
        }
    }
}
