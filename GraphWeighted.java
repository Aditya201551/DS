import java.util.*;
public class GraphWeighted {
    ArrayList<HashMap<Integer, Integer>> graph=new ArrayList<>();
    boolean isPermanent[]=new boolean[8];
    int pathLength[]=new int[8];
    int pred[]=new int[8];

    void initialize()
    {
        for(int i=0;i<8;i++)
        {
            pathLength[i]=Integer.MAX_VALUE;
            pred[i]=-1;
            isPermanent[i]=false;
        }
    }

    
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

    void dijkstra(int source)
    {
        initialize();
        pathLength[source]=0;
        isPermanent[0]=true;
        int current=source;
        while(check())
        {
            // System.out.println("Running");
            for(Map.Entry<Integer, Integer> entry: graph.get(current).entrySet())
            {
                // System.out.println(graph.get(current));
                if(!isPermanent[entry.getKey()])
                {
                    int pathResult=pathLength[current]+entry.getValue();
                    // System.out.println(entry.getKey()+": "+pathLength[current]+"+"+entry.getValue()+"="+pathResult);
                    // System.out.println(pathLength[current]+" "+current);
                    if(pathResult<pathLength[entry.getKey()])
                    {
                        pathLength[entry.getKey()]=pathResult;
                        pred[entry.getKey()]=current;
                    }
                }
            }
            int min=Integer.MAX_VALUE;
            int minVertex=Integer.MAX_VALUE;
            for(int i=0;i<pathLength.length;i++)
            {
                if(pathLength[i]<min && !isPermanent[i])
                {
                    min=pathLength[i];
                    minVertex=i;
                }
            }
            current=minVertex;
            isPermanent[current]=true;
            // System.out.println("Current: "+current);

        }

    }

    boolean check()
    {
        for(boolean i: isPermanent)
        {
            if(i==false)
                return true;
        }
        return false;
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
        int arr[][]={{0, 1, 8}, {0, 3, 7}, {0, 2, 2}, {1,5, 16}, {2,0, 5},{2,3,4}, {2,6, 3},{3, 4, 9},{4, 0, 4},{4, 5, 5},{4, 7, 8},{6, 2, 6},{6, 3, 3},{6, 4, 4},{7, 6, 5},{7,5,2}};
        for(int i[]:arr)
        {
            ob.addEdge(i[0], i[1], i[2]);
        }
        // ob.printGraph();
        ob.dijkstra(0);
        System.out.println(ob.pathLength[3]);
        // ob.deleteEdge(0, 1);
        // ob.deleteEdge(0, 2);
        // ob.deleteEdge(0, 3);
        // System.out.println("__________________________________");
        // ob.deleteVertex(3);
        // ob.printGraph();
        // ob.deleteVertex(3);
        // ob.printGraph();
    }
}