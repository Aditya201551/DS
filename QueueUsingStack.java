import java.util.*;
public class QueueUsingStack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    //this will make adding data to the queue costly
    void enqueueCostly(int data)
    {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        
            s1.push(data);

        while(!s2.isEmpty())
            s1.push(s2.pop());
    }

     void dequeueCostly()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }

        while(!s1.isEmpty())
            s2.push(s1.pop());
        
        System.out.println(s2.pop());

        while(!s2.isEmpty())
            s1.push(s2.pop());
    }
    public static void main(String[] args) {
        QueueUsingStack ob=new QueueUsingStack();

        // if enqueueCostly and dequeueCostly works together then it will perform as a stack(stack using two stack)
        for(int i=1;i<=10;i++)
            ob.enqueueCostly(i);
        for(int i=1;i<=10;i++)
            ob.dequeueCostly();
    }
}
