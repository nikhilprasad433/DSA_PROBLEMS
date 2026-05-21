import java.util.*;
class Leetcode_64 {
    public static void main(String [] args) {
        int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
        int m=grid.length;
        int n=grid[0].length;
        int memo[][]= new int[m+1][n+1];
        for(int []row:memo){
            Arrays.fill(row,-1);
        }
        int ans= solve(0,0,m,n,grid,memo);
        System.out.println(ans);
    }
    public static int solve(int i, int j,int m, int n,int [][] grid,int [][]memo){
    if(i> m-1 || j>n-1) return memo[i][j]=Integer.MAX_VALUE;
    if(i==m-1 && j==n-1) return memo[i][j]=grid[i][j];
    if(memo[i][j] != -1) return memo[i][j];
    return memo[i][j]=grid[i][j] + Math.min(solve(i+1,j,m,n,grid,memo),            solve(i,j+1,m,n,grid,memo));
    }
}