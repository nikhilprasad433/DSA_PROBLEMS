import java.util.*;
class Rat_in_maze {
    public ArrayList<String> ratInMaze(int[][] maze) {
      int n=maze.length;
      boolean [][] visited=new boolean[n][n];
      ArrayList<String> ans=new ArrayList<>();
    
        solve(0,0,n,maze,"",visited,ans);
      
      return ans;
      
    
        
    }
    public static void solve(int i,int j,int n,int [][] maze,
    String path,boolean [][] visited, ArrayList<String> ans){
         if(i<0 || j<0 || i>n-1 || j>n-1 || maze[i][j]==0 ) return ;
         
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return ;
        }
      if(visited[i][j]) return;
      
      visited[i][j]=true;
       
      
       
        solve(i+1,j,n,maze,path+"D",visited,ans);
        solve(i,j-1,n,maze,path+"L",visited,ans);
        solve(i,j+1,n,maze,path+"R",visited,ans);
        solve(i-1,j,n,maze,path+"U",visited,ans);
        
       visited[i][j]=false;
    }
    public static void main(String []args){
        int [][] maze={{1,0,0,0}, {1,1,0,1}, {1,1,0,0},{0,1,1,1}};
        Rat_in_maze obj=new Rat_in_maze();
        ArrayList<String> ans=obj.ratInMaze(maze);
        System.out.println(ans);
        
    }
}