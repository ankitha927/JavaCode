import java.util.Arrays;

public class Anagrams{
    public static void anangram(String s1,String s2){
       int [] feq1=new int[100];
       int [] feq2=new int[100];
       for(int i=0;i<s1.length();i++){
        
            char ch=s1.charAt(i);
            feq1[ch-'a']++;
        }


        for(int i=0;i<s2.length();i++){
        
            char ch=s2.charAt(i);
            feq2[ch-'a']++;
        }
        if (Arrays.equals(feq1, feq2)) {
    System.out.println("yes 2 strings are anagram");
} else {
    System.out.println("not anagram");
}

       }

public static void main(String[] args) {
    String s1="cat";
    String s2="tac";
    Anagrams ob=new Anagrams();
    ob.anangram(s1, s2);
    
}


    }
