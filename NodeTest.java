public class NodeTest
{
    public static void main(String[] args) {
        listnode head=new listnode(1);
        listnode tmp=head;
        for(int i=2;i<=5;i++)
        {
            tmp.next=new listnode(i);
            tmp=tmp.next;
        }
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
class listnode{
    listnode next;
    int data;
    listnode(int data)
    {
        this.data=data;
        this.next=null;
    }
}