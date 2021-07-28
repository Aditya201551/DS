import java.util.*;
public class RevSentance {
    // reverse a string
    String rev(String s){
        String result="";
        for(int i=0;i<s.length();i++)
            result=s.charAt(i)+result;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RevSentance ob=new RevSentance();
        System.out.print("Enter the sentance: ");
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++)
            System.out.print(ob.rev(arr[i])+" ");
    }
}
