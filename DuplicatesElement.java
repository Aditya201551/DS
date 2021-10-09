import java.util.*;
public class DuplicatesElement {
    List<Integer> find(int nums[])
    {
       List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
                result.add(Math.abs(index)+1);
            nums[index]=-nums[index];
        }
        
        return result;    
    }
    public static void main(String[] args) {
        DuplicatesElement ob=new DuplicatesElement();
        System.out.println(ob.find(new int[]{4,5,2,7,8,2,3,1}));
    }
}
