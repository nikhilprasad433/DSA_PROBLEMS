package Graph;
import java.util.*;
class Leetcode_542 {
    public static void main(String []args) {
    int [][]mat={{0,0,1},{1,0,0},{1,1,1}};
    int m=mat.length;
    int n=mat[0].length;
    int  dis[][]=new int[m][n];
    Queue <int []>qu=new LinkedList<>();
    boolean [][]vis=new boolean[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0){
                vis[i][j]=true;
                qu.offer(new int[]{i,j});
                dis[i][j]=0;
            }
        }
    } 
    bfs(mat,qu,dis,vis);
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        System.out.print(dis[i][j]+" ");
    }
    System.out.println();
   }
    }
public static void  bfs(int [][] mat,Queue<int []> qu,
int [][] dis,boolean [][]vis){

int []drow={0,0,-1,1};
int []dcol={1,-1,0,0};
   while(!qu.isEmpty()){
    int []cur=qu.poll();
    int row=cur[0];
    int col=cur[1];

for(int k=0;k<4;k++){
    int nrow=row+drow[k];
    int ncol=col+dcol[k];
    if(nrow>=0 && nrow<mat.length && ncol>=0 && ncol<mat[0].length && !vis[nrow][ncol]){
    vis[nrow][ncol]=true;
    qu.offer(new int []{nrow,ncol});
    dis[nrow][ncol]=1+dis[row][col];
}
}
   }
   
    }

}