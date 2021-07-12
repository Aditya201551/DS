public class LLQueue {
    
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node start=null;
    Node end=null;
    boolean isEmpty()
    {
        return start==null && end==null;
    }

    void enqueue(int data)
    {
        if(start ==null && end==null){
            start=end=new Node(data); 
            return;
        }
        end.next=new Node(data);
        end=end.next;
    }

    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        if(start==end)
        {
            start=end=null;
            return;
        }
        Node tmp=start;
        start=start.next;
        tmp.next=null;
        tmp=null;
    }

    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(start.data);
    }

    void print()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        Node tmp = start;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        LLQueue q=new LLQueue();

        /* test */
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.print();
        q.peek();
        q.dequeue();
        q.enqueue(50);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();
        q.peek();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.peek();
        q.print();
        q.dequeue();
        q.print();
        q.print();

    }
}