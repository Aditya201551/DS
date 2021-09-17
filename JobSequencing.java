import java.util.*;
public class JobSequencing {
    
    char[] sequencer(ArrayList<jobs> list)
    {
        Collections.sort(list,(a,b)->b.profit-a.profit);
        int max=list.stream().max(Comparator.comparing(l->l.deadline)).get().deadline;
        // System.out.println(max);
        char arr[]=new char[max];
        for(int i=0;i<max;i++)
            arr[i]='-';

        for(int i=0;i<list.size();i++)
        {
            inner:
            for(int j=list.get(i).deadline-1;j>=0;j--)
                if(arr[j]=='-')
                {
                    arr[j]=list.get(i).id;
                    break inner;
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        JobSequencing ob=new JobSequencing();
        ArrayList<jobs> list=new ArrayList<>();
        list.add(new jobs('a', 2, 100));
        list.add(new jobs('b', 1, 19));
        list.add(new jobs('c', 2, 27));
        list.add(new jobs('d', 1, 25));
        list.add(new jobs('e', 3, 15));

        System.out.println(Arrays.toString(ob.sequencer(list)));

    }
}

class jobs{
    char id;
    int deadline, profit;

    jobs(char id, int deadline, int profit)
    {
        this.id=id;
        this.profit=profit;
        this.deadline=deadline;
    }
}