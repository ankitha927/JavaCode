//Largest number
public class New3 {
    public static void main(String[]args){
        int[] num={10,20,30,40,500};
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Largest elemt is "+max);

    }
}
