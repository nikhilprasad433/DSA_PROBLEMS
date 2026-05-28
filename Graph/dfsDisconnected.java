package Graph;

import java.util.*;
class dfsDisconnected {
    public static void main(String[] args) {
    int n = 7;

int[][] edges = {
    {0,1},
    {1,2},
    {3,4},
    {5,6}
};
// creating adj list for given edges
ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
}
  for(int i=0;i<edges.length;i++){
      int u=edges[i][0];
      int v=edges[i][1];
      adj.get(u).add(v);
      adj.get(v).add(u);
  }
  System.out.println(adj);
  ArrayList<Integer> ans=new ArrayList<>();
  boolean []vis=new boolean[n];
 for(int i = 0; i < n; i++){

            if(vis[i] == false){

                dfs(i, adj, ans, vis);
            }
        }
  System.out.println(ans);
    }
    
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans, boolean [] vis){
    vis[node]=true;
    ans.add(node);
    
    for(int item: adj.get(node)){
        if(vis[item]==false){
            dfs(item,adj,ans,vis);
        }
    }
    
        
    }
}
