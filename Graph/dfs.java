package Graph;

import java.util.*;
class dfs {
    public static void main(String[] args) {
     int n = 5;

int[][] edges = {
    {0,1},
    {0,2},
    {1,3},
    {2,4}
};
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
      // System.out.println(adj);
       
       ArrayList<Integer> ans=new ArrayList<>();
       boolean []vis=new boolean[n];
       dfs(2,adj,ans,vis);
       System.out.println(ans);
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,boolean [] vis){
        vis[node]=true;
        ans.add(node);
        for(int item:adj.get(node)){
            if(vis[item]==false){
                dfs(item,adj,ans,vis);
            }
        }
    }
    
}
