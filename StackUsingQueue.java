import java.util.*;
public class StackUsingQueue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    void pushCostly(int data)
    {
        q2.add(data);
        while(!q1.isEmpty())
            q2.add(q1.remove());
        
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }

    void popCostly()
    {
        if(q1.isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }

        while(q1.size()!=1)
            q2.add(q1.remove());
        
        System.out.print(q1.remove()+" ");

        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }

    public static void main(String[] args) {
        StackUsingQueue ob=new StackUsingQueue();

        //if pushCostly and popCostly works together then it will act as a queue(queue using two queue)
        for(int i=1;i<=10;i++)
            ob.pushCostly(i);
        for(int i=1;i<=10;i++)
        ob.popCostly();
    }
}
