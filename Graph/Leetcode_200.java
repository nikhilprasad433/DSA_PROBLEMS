package Graph;

class Leetcode_200 {
    public static void main(String []args){
        char [][]grid={{'1','1','1','0'},{'1','1','0','1'},{'0','0','1','1'},};
     int m=grid.length;
     int n=grid[0].length;
     boolean [][] vis=new boolean[m][n];
     int count=0;
    for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(!vis[row][col] && grid[row][col]=='1'){
                    count++;
            
                dfs(row,col,vis,grid);
                
            }
        }
     }
     System.out.println(count);

    }
    public static void dfs(int row,int col, boolean [][]vis,char [][] grid){
        vis[row][col]=true;
        int []drow={-1,0,1,0};
        int []dcol={0,-1,0,1};
        for(int k=0;k<4;k++){
            int nrow=row+drow[k];
            int ncol=col+dcol[k];

            if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && grid[nrow][ncol]=='1' && !vis[nrow][ncol]){
                dfs(nrow,ncol,vis,grid);
            }
        }

    }
}
