import java.util.*;
public class GraphWeighted {
    ArrayList<HashMap<Integer, Integer>> graph=new ArrayList<>();
    
    void addVertex()
    {
        graph.add(new HashMap<>());
    }

    void addEdge(int u, int v, int weight)
    {
        if(u<0 || u>graph.size() || v<0 || v>graph.size())
        {
            System.out.println("Invalid location");
            return;
        }
        graph.get(u).put(v,weight);
    }

    void deleteVertex(int v)
    {
        if(v<0 || v>graph.size())
        {
            System.out.println("INVALID LOCATION");
            return;
        }

        for(int i=0;i<graph.size();i++)
            if(graph.get(i).get(v)!=null)
                graph.get(i).remove(v);

        graph.remove(v);
    }

    void deleteEdge(int u, int v)
    {
        graph.get(u).remove(v);
    }

    void printGraph()
    {
        for(int i=0;i<graph.size();i++)
        {
            System.out.print(i+"--> ");
            for(Map.Entry<Integer, Integer> entry: graph.get(i).entrySet())
                System.out.print("("+entry.getKey()+", "+entry.getValue()+"), ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphWeighted ob=new GraphWeighted();
        for(int i=0;i<8;i++)
            ob.addVertex();
        int arr[][]={{0, 1, 8}, {0, 3, 7}, {0, 2, 2}, {1,5, 16}, {2,0, 5}, {2,6, 3},{3, 4, 9},{4, 0, 4},{4, 5, 5},{4, 7, 8},{6, 2, 6},{6, 3, 3},{6, 4, 4},{7, 6, 5},{7,5,2}};
        for(int i[]:arr)
        {
            ob.addEdge(i[0], i[1], i[2]);
        }
        ob.printGraph();
        // ob.deleteEdge(0, 1);
        // ob.deleteEdge(0, 2);
        // ob.deleteEdge(0, 3);
        System.out.println("__________________________________");
        ob.deleteVertex(3);
        ob.printGraph();
        // ob.deleteVertex(3);
        // ob.printGraph();
    }
}