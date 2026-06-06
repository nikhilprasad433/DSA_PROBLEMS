package Graph;
import java.util.*;
class Leetcode_994 {
   
    public static void main(String []args) {
    int [][]grid={{0,0,1,1},{1,2,2,1},{2,1,1,1},{0,0,1,1}};
    int m=grid.length;
    int n=grid[0].length;
   int fresh=0;
    Queue<int []> qu=new LinkedList<>();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==2){
                qu.offer(new int []{i,j});   
            }
            if(grid[i][j]==1) fresh++;
        }
    }
    int minute=0;
    int []drow={0,0,1,-1};
    int []dcol={1,-1,0,0}; 

    while(!qu.isEmpty() && fresh>0){
        int size=qu.size();
        for(int s=0;s<size;s++){
        int []cur=qu.poll();
        int row=cur[0];
        int col=cur[1];

    
        for(int k=0;k<4;k++){
            int nrow=row+drow[k];
            int ncol=col+dcol[k];
            if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && grid[nrow][ncol]==1 ){
                grid[nrow][ncol]=2;
                fresh--;
                qu.offer(new int []{nrow,ncol});
                
            }
        }

        }
        minute++;
    }
System.out.println(fresh==0 ? minute:-1);
}
}