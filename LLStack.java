public class LLStack<E> {
    class Node<E> {
        E data;
        Node<E> next;

        Node(E data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node<E> head=null, last;

    boolean isEmpty()
    {
        return head==null;
    }

    void push(E data)
    {
        if(head==null)
        {
            head=new Node<E>(data);
            last=head;
            return;
        }
        last.next=new Node<E>(data);
        last=last.next;

    }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            last=null;
            return;
        }
        if(head.next.next==null)
        {
            last=head;
            head.next=null;
            return;
        }
        Node<E> tmp=head;
        while(tmp.next.next!=null)
            tmp=tmp.next;
        last=tmp;
        tmp.next=null;
    }

    void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        Node<E> tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        LLStack<Integer> stack=new LLStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        stack.pop();
        stack.print();
        stack.push(4);
        stack.push(5);
        stack.print();
        /*test edge cases*/
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        stack.pop();
        stack.print();
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();

    }
}