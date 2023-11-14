package Graph.cycles;

import java.util.ArrayList;
import java.util.Arrays;




public class undirectedDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Solution obj = new Solution();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
class Solution{
    public boolean isCycle(int V,ArrayList<ArrayList<Integer>> adj ){
        boolean[] vis=new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++){
            if(vis[i]==false){
               if( dfs(i,-1,vis,adj)==true)return true;
;            }
        }
        return false;
    }

    private boolean dfs(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node]=true;
        for(int it:adj.get(node)){
            if(vis[it]==false){
                if(dfs(it,node,vis,adj)==true){
                    return true;
                }
                else if(it!=parent){
                    return true;
                }
            }
        }
        return false;


    }
}


