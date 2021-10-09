import java.util.*;
public class PlusOne {
    public int[] plusOne(int[] arr) {
       if(arr.length==1)
       {
           if(arr[0]==9)
               return new int[]{1,0};
           else
               return new int[]{arr[0]+1};
       }
        int i=arr.length;
        arr[i-1]++;
        while(--i!=0)
        {
            if(arr[i]>9)
            {
                arr[i]=0;
                arr[i-1]++;
            }
            else
                break;
        }
        if(arr[0]==10)
        {
            System.out.println("arr[0] is 10");
            int result[]=new int[arr.length+1];
            result[0]=1;
            for(i=1;i<result.length;i++)
                result[i]=0;
            return result;
        } 
        System.out.println("normal arr return");
        return arr;
    }

    public static void main(String[] args) {
        PlusOne ob=new PlusOne();
        System.out.println(Arrays.toString(ob.plusOne(new int[]{9,9,9})));
    }
}
