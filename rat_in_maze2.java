public class rat_in_maze2 {
    public static void main(String [] args){
        int [][]maze={{1,1,1,1},{1,0,0,1},{0,1,0,1},{1,1,1,1}};
        int m=maze.length;
        int n=maze[0].length;
        boolean [][]visited=new boolean[m][n];
        int []count=new int[1];
        solve(0,0,m,n,count,maze,visited);
        System.out.println("Total possible unique combination= "+count[0]);

    }
    public static void solve(int i,int j,int m,int n, int[]count,int [][]maze,boolean[][] visited){
        if(i<0 || j<0 || i>m-1 ||j>n-1 || visited[i][j] || maze[i][j]==0) return;
        if(i==m-1 && j==n-1){
            count[0]++;
            return;
        }
        visited[i][j]=true;
        solve(i+1,j,m,n,count,maze,visited);
        solve(i,j+1,m,n,count,maze,visited);
        solve(i,j-1,m,n,count,maze,visited);
        solve(i-1,j,m,n,count,maze,visited);
        solve(i-1,j+1,m,n,count,maze,visited);
        solve(i-1,j-1,m,n,count,maze,visited);
        solve(i+1,j-1,m,n,count,maze,visited);
        solve(i+1,j+1,m,n,count,maze,visited);
        visited [i][j]=false;
        
    }
}

