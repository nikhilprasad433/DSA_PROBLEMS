import java.util.*;
class LeetCode_1143 {
    public static void main(String[] args) {
      String text1="abaabacdacdabc";
      String text2="bbcadbdcadbdca";

    
        int m=text1.length();
        int n=text2.length();
        int [][]memo=new int[m+1][n+1];
        for(int []row:memo){
            Arrays.fill(row,-1);
        }
        int ans=solve(text1,text2,0,0,m,n,memo);
        System.out.println(ans);
    }
    public static int solve(String s1,String s2,int i,int j,int m,int n,int [] []memo){
        if(i>m-1 || j>n-1) return memo[i][j]=0;
        if(memo[i][j] != -1) return memo[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return memo[i][j]= 1+ solve(s1,s2,i+1,j+1,m,n,memo);
        }
        else{
            return memo[i][j]=Math.max(solve(s1,s2,i,j+1,m,n,memo),solve(s1,s2,i+1,j,m,n,memo));
        }
    }
}
