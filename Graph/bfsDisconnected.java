package Graph;

import java.util.*;

public class bfsDisconnected {
    public static void main(String [] args){
        int n = 7;

int[][] edges = {
    {0,1},
    {1,2},
    {3,4},
    {5,6}
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

ArrayList<Integer> ans=new ArrayList<>();
Queue<Integer> qu=new LinkedList<>();
int [] vis=new int[n];
 
 for(int i=0;i<n;i++){
 if(vis[i]==0){
    qu.offer(i);
    vis[i]=1;
 }
    while(!qu.isEmpty()){
        int item=qu.poll();
        ans.add(item);
   

        for(int l:adj.get(item)){
            if(vis[l]==0){
                vis[l]=1;
                qu.offer(l);
            }
        }
    }
}

System.out.println(ans);;
 }
    }
  

