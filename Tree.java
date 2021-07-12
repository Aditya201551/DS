import java.util.*;
public class Tree {
    
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    Node root;
    boolean flag;
    int maxLevel=0;
    Tree()
    {
        this.root=null;
        flag=false;
    }

    void search(int data, Node root)
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
            return;
        }
        if(root.data==data)
        {
            flag=true;
            return;
        }

        if(flag==false && root.left!=null)
            search(data, root.left);

        if(flag==false && root.right!=null)
            search(data, root.right);
    }
    /* Recursive approach[STARTS] */
    void leftView(Node root, int level)
    {
        if(root==null)
            return;
        if(maxLevel<level)
        {
            System.out.print(root.data+" ");
            maxLevel=level;
        }

        leftView(root.left, level+1);
        leftView(root.right, level+1);
    }

    void rightView(Node root, int level)
    {
        if(root==null)
            return;
        if(maxLevel<level)
        {
            System.out.print(root.data+" ");
            maxLevel=level;
        }

        rightView(root.right, level+1);
        rightView(root.left, level+1);
    }
    /* Recursive approach[ENDS] */
    
    /* Iterative approach [STARTS] */
    void rightView(Node root)
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int len=q.size();

            for(int i=0;i<len;i++)
            {
                Node node=q.poll();
                if(i==len-1)
                    System.out.print(root.data+" ");
                if(node.left!=null)
                    q.add(node.left);
                if(root.right!=null)
                    q.add(node.right);
            }
        }

    }

    void leftView(Node root)
    {
        if(root==null)
        {
            System.out.println("Tree is empty!");
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int len=q.size();

            for(int i=0;i<len;i++)
            {
                Node node=q.poll();

                if(i==0)
                    System.out.print(node.data+" ");
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
    }

    void worker()
    {
        root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        root.right.right.left=new Node(100);
        root.right.right.right=new Node(200);

        search(25, root);
        leftView(root, 1);
        maxLevel=0;
        System.out.println();
        rightView(root, 1);
        System.out.println("\nLeft View");
        leftView(root);
        System.out.println("\nRight View");
        rightView(root);

    }

    public static void main(String[] args) {
        Tree ob=new Tree();
        ob.worker();
        if(ob.flag)
            System.out.println("\nPresent");
        else
            System.out.println("Not present");
    }
}
