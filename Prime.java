public class Prime {
    public static void main(String[] args) {
        int i;
        int p=0;
        for( i=2;i<=100;i++){
            p=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    p++;
                }
            
        }
        if(p==2){
            System.out.print(i+" ");
        }
    }
}
}