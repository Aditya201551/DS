import java.util.*;
public class JobSequencing {

    int totalProfit = 0;
    
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
                    totalProfit+=list.get(i).profit;
                    arr[j]=list.get(i).id;
                    break inner;
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        JobSequencing ob=new JobSequencing();
        ArrayList<jobs> list=new ArrayList<>();
        list.add(new jobs('a', 5, 200));
        list.add(new jobs('b', 3, 180));
        list.add(new jobs('c', 3, 190));
        list.add(new jobs('d', 2, 300));
        list.add(new jobs('e', 4, 120));
        list.add(new jobs('f', 2, 100));

        System.out.println(Arrays.toString(ob.sequencer(list))+" with total profit of: "+ob.totalProfit);

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