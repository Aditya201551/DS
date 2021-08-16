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

        for(int i=0;i<=graph.size();i++)
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
        for(int i=0;i<4;i++)
            ob.addVertex();
        int arr[][]={{0, 1}, {0, 2}, {1, 2}, {2,0}, {2,3}, {3,1}};
        for(int i[]:arr)
        {
            int wt=(int)(Math.random()*100);
            ob.addEdge(i[0], i[1], wt);
        }
        ob.printGraph();
    }
}
