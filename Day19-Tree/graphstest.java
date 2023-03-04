import java.util.ArrayList;

public class graphstest {
    
    public static class Edge
    {
        int v;
        int w;
        Edge(int v,int w)
        {
            this.v =v;
            this.w =w;
        }
    }
    // public static void addEdgeuni(ArrayList<Edge> graph[],int u,int v,int w)
    // {
    //     graph[u].add(new Edge(v, w));
    // }

    public static void Display(ArrayList<Edge> graph[])
    {
        for(int u=0;u<graph.length;u++)
        {
            System.out.print(" { [ "+u+" ] -> " );

        for(Edge ed: graph[u])
        {
            System.out.print(" (  "+ed.v + " , "+ ed.w + " ) ");
        }
        System.out.println( " } ");
        }
        System.out.println(FindEdge(graph,1,5));
        
    }

    public static int FindEdge(ArrayList<Edge> graph[],int u,int v)
    {
        for(int i=0;i< graph[u].size();i++)
        {
            Edge curr = graph[u].get(i);
            if(curr.v == v)
            {
                return i;
            }
        }
        return -1;
    }

    public static void Removeedge(ArrayList<Edge> graph[],int u,int v)
    {
        int x = FindEdge(graph, u, v);
        int y = FindEdge(graph, v, u);
        
        if(x != -1)
        {
            graph[u].remove(x);
            graph[v].remove(y);
        }
    }

    public static void RemoveVertex(ArrayList<Edge> graph[],int u)
    {
        for(int i=graph[u].size()-1;i>=0 ;i--)
        {
            Removeedge(graph,u,graph[u].get(i).v);
        }
    }

    public static boolean haspath(ArrayList<Edge> graph[],int u,int v)
    {
            if(u == v) return true;
            boolean ans = false;
            for(int i=0;i< graph[u].size();i++)
            {
                ans = ans || haspath(graph,graph[u].get(i).v,v);
            }
            return ans;
    }

    public static void dfs(int src,ArrayList<Edge> graph[],boolean [] visited)
    {
            /// first step
            // mark curr node visited
            visited[src] = true;
            System.out.println(src);
            for(Edge ed : graph[src])
            {
                int next = ed.v;
                if(visited[next] == false)
                {   
                    dfs(next,graph,visited);
                }
            }
    }


    public static void addEdgebi(ArrayList<Edge> graph[],int u,int v,int w)
    {
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }
    public static void ConstructGraph(ArrayList<Edge> graph[])
    {
        int n = graph.length; // this is the total number of vertices
        // addEdgeuni(graph,0,1,10);
        // addEdgeuni(graph,1,0,10);

        //first initialise array list inside the array , as previously it would be pointing to null
        for(int v=0;v<n;v++)
        {
            graph[v] = new ArrayList<>();
        }

        addEdgebi(graph,0,1,10);
        addEdgebi(graph,0,6,10);

        addEdgebi(graph,1,5,20);
        addEdgebi(graph,1,2,5);

        addEdgebi(graph,2,4,30);
        addEdgebi(graph,2,3,50);

        addEdgebi(graph,3,4,30);

        addEdgebi(graph,5,6,10);
        addEdgebi(graph,5,7,20);
        addEdgebi(graph,5,8,20);

        addEdgebi(graph,7,8,20);

    }
    public static void main(String[] args) {
        // to store information of the graph
        // boolean temp[] = new boolean[10];
        ArrayList<Edge> graph[] = new ArrayList[9];
        ConstructGraph(graph);

        //display graph
        Display(graph);
        // Removeedge(graph,1,5);
        // Display(graph);
        // RemoveVertex(graph,2);
        // Display(graph);
        // haspath(graph,0,8);
        // Display(graph);
        System.out.println("-------");
        boolean[] visited = new boolean[9];
        dfs(0,graph,visited);
    }
}
