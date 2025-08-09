public class vowels {
    public static void main(String[] args) {
        String str="I am in Udupi";
        str=str.toLowerCase();
        String s2=str.replaceAll("[aeiou]", "");
        System.out.println(s2);
    }
}
