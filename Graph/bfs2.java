package Graph;

import java.util.*;
class bfs2 {
    public static void main(String[] args) {
    int [][] graph={{1,0},{1,2},{3,2},{2,0}};
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    for(int i=0;i<graph.length;i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0;i<graph.length;i++){
        int u=graph[i][0];
        int v=graph[i][1];
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    System.out.println(adj);
    //bfs traversal
    Queue<Integer> qu=new LinkedList<>();
    ArrayList<Integer> ans=new ArrayList<>(); 
    boolean vis[]=new boolean[graph.length];
    
    qu.offer(0);
    vis[0]=true;
    while(!qu.isEmpty()){
        int item=qu.poll();
        ans.add(item);
        
       for(int i: adj.get(item)){
           if(vis[i]==false){
               vis[i]=true;
               qu.add(i);
           }
       }
    }
    
    System.out.println(ans);
    
    }
}
