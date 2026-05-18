import java.util.*;

class Leetcode_62_Unique_Path {

    public static int uniquePaths(int m, int n) {

        int memo[][] = new int[m][n];

        for(int[] row : memo){
            Arrays.fill(row, -1);
        }

        return solve(0, 0, m, n, memo);
    }

    public static int solve(int i, int j,int m, int n,int memo[][]) {

        if(i >= m || j >= n) return 0;

        if(i == m-1 && j == n-1) return 1;

        if(memo[i][j] != -1) return memo[i][j];

        return memo[i][j] =
                solve(i+1, j, m, n, memo) +
                solve(i, j+1, m, n, memo);
    }

    public static void main(String[] args) {

        int m = 3, n = 7;

        int ans = uniquePaths(m, n);

        System.out.println(ans);
    }
}