import java.util.*;
public class BFordAlgorithm {
    HashMap<Integer, ArrayList<Edge>> graph=new HashMap<>();

    void addVertex(int u)
    {
        graph.put(u, new ArrayList<Edge>());
    }

    void addEdge(int u, int v, int weight)
    {
        graph.get(u).add(new Edge(v, weight));
    }

    void printGraph()
    {
        for(Map.Entry<Integer, ArrayList<Edge>> entry:graph.entrySet())
        {
            System.out.print(entry.getKey()+" -> ");

            for(Edge e:entry.getValue())
                System.out.print("("+e.destination+", "+e.weight+") ");

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 8 }, { 0, 3, 7 }, { 0, 2, 2 }, { 1, 5, 16 }, { 2, 0, 5 }, { 2, 3, 4 }, { 2, 6, 3 },
                { 3, 4, 9 }, { 4, 0, 4 }, { 4, 5, 5 }, { 4, 7, 8 }, { 6, 2, 6 }, { 6, 3, 3 }, { 6, 4, 4 }, { 7, 6, 5 },
                { 7, 5, 2 } };

        BFordAlgorithm ob=new BFordAlgorithm();

        for(int i=0;i<8;i++)
            ob.addVertex(i);
        
        for (int i[] : arr)
            ob.addEdge(i[0], i[1], i[2]);

        ob.printGraph();
    }
}

class Edge{
    int destination,weight;

    Edge(int destination, int weight)
    {
        this.destination=destination;
        this.weight=weight;
    }
}