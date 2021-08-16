//bidirectional graph
import java.util.*;
public class Graph {
    ArrayList<HashSet<Integer>> graph=new ArrayList<>();

    void addVertex()
    {
        graph.add(new HashSet<Integer>());
    }

    void addEdge(int u, int v)
    {
        if(u<0 || u>graph.size() || v<0 || v>graph.size())
        {
            System.out.println("Invalid location");
            return;
        }

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void DFS(int v)
    {
        Stack<Integer> stack=new Stack<>();
        boolean visited[]=new boolean[graph.size()];
        stack.push(v);

        while(!stack.isEmpty())
        {
            v=stack.pop();
            if(!visited[v])
            {
                System.out.print(v+" ");
                visited[v]=true;
            }

            Iterator<Integer> i=graph.get(v).iterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                    stack.push(n);
            }
        }
    }

    void BFS(int v)
    {
        Queue<Integer> queue=new LinkedList<>();
        boolean visited[]=new boolean[graph.size()];

        queue.add(v);
        visited[v]=true;
        while(!queue.isEmpty())
        {
            v=queue.poll();
            System.out.print(v+" ");

            Iterator<Integer> i=graph.get(v).iterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    queue.add(n);
                    visited[n]=true;
                }
            }
        }
    }

    void printGraph() {
        int x = 0;
        for (HashSet<Integer> i : graph) {
            System.out.print(x++ + " ->");
            Iterator<Integer> j = i.iterator();
            while (j.hasNext())
                System.out.print(j.next() + ", ");
            System.out.println();
        }
    }

     public static void main(String[] args)
    {
        Graph ob=new Graph();
        for(int i=0;i<4;i++)
            ob.addVertex();
        int arr[][]={{0, 1}, {0, 2}, {1, 2}, {2,0}, {2,3}, {3,1}};
        for(int[] i:arr)
            ob.addEdge(i[0],i[1]);
        ob.printGraph();
        System.out.println("__________________________________________");
        ob.DFS(0);
        System.out.println("\n__________________________________________");
        ob.BFS(3);
    }
}
