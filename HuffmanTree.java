import java.util.*;

public class HuffmanTree {

    HashMap<Character, Integer> map=new HashMap<>(); //to store frequency of each letter in the string

    Hnode createTree(String message)
    {
        for(int i=0;i<message.length();i++) //counting frequency
        {
            char ch=message.charAt(i);
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }

        PriorityQueue<Hnode> q=new PriorityQueue<>(map.size(), (a,b)->a.freq-b.freq);//stores data to the queue according to the Comparison rule set by ComparisonRule class

        for(Map.Entry<Character, Integer> entry: map.entrySet())
            q.add(new Hnode(entry.getValue(), entry.getKey()));

        Hnode root=null; //store the root address

        while(q.size()>1)
        {
            //take two smallest nodes from the queue and add them to a new node "tmp"
            Hnode x=q.peek();
            q.poll();

            Hnode y=q.peek();
            q.poll();

            Hnode tmp=new Hnode((x.freq+y.freq),'-');
            //make tmp's left and right to x and y 
            tmp.left=x;
            tmp.right=y;

            //add tmp to queue for furtute addition if required
            q.add(tmp);
            root=tmp;
        }

        return root;
    }

    void printCode(Hnode root, String s)
    {
        if(root.right==null && root.left==null && (Character.isLetter(root.c) || root.c==' '))
        {
            System.out.println(root.c+": "+s);
            return;
        }

        printCode(root.left, s+"0");
        printCode(root.right, s+"1");
    }

    public static void main(String[] args) {
        HuffmanTree ob=new HuffmanTree();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the message to get Huffman Encoding: ");
        ob.printCode(ob.createTree(sc.nextLine()), "");
        sc.close();

    }

}


class Hnode{
    int freq;
    char c;

    Hnode left, right;

    Hnode(int freq, char c)
    {
        this.freq=freq;
        this.c=c;

        left=right=null;
    }
}