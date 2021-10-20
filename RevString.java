public class RevString {
    
    void reverse(String s, int i){
        if(i==s.length()-1)
        return;
        reverse(s, ++i);
        System.out.print(s.charAt(i));
    }
    
    public static void main(String[] args) {
        new RevString().reverse("Hello", -1);
        // System.out.println("\n"+(1&2147483647));
    }
}
