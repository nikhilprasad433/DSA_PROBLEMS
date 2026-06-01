package Graph;
import java.util.*;
class Leetcode_547 {

    public static void main(String[]ags) {
        int [][]isConnected={{1,1,0},{1,1,0},{0,0,1}};
     int v=isConnected.length;
     //Adjecency Matrix to List
     ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
     for(int i=0;i<v;i++){
        adj.add(new ArrayList<>());
     } 
      for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            if(isConnected[i][j]==1){
            adj.get(i).add(j);
            adj.get(j).add(i);
            }
        }
      }
      //No. of provinces:
boolean []vis=new boolean[v];
  
    int count=0;
    for(int i=0;i<v;i++){
        if(vis[i]==false){
            count++;
            dfs(i,adj,vis);
        }
    }
System.out.println("Total no. of provinces:- "+count);     
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>>adj,
   boolean [] vis ){
    vis[node]=true;
    for(int item:adj.get(node)){
        if(vis[item]==false){
            vis[item]=true;
            dfs(item,adj,vis);
        }
    }
   }

}
