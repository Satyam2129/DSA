package DSA_01;

import java.util.ArrayList;
import java.util.Arrays;

public class gfgGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    static int primsMST(int graph[][]){
        int V=4;
        int key[] = new int[V], res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        boolean mSet[] = new boolean[V];
        for (int count = 0; count < V; count++) {
            int u=-1;
            for (int i = 0; i < V; i++) {
                if(!mSet[i] || u==-1 || key[i]<key[u])
                    u=i;
                mSet[u]=true;
                res=res+key[u];
                for (int v = 0; v < V; v++) {
                    if(!mSet[v]&&graph[u][v]!=0&&graph[u][v]<key[v])
                        key[v]=graph[u][v];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        printGraph(adj);
        System.out.println();
    }
}
