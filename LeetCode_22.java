import java.util.*;
class Solution {
    public static void main(String []args) {
        int n=4;
        List<String> ans = new ArrayList<>();
        solve(n, 0, 0, "", ans);
        System.out.println(ans);
    }

    public static void solve(int n,int open,int close,String temp,List<String> ans){
        if(temp.length()==2*n){
            ans.add(temp);
            return;
        }
        if(open<n){
            solve(n,open+1,close,temp + "(",ans);
        }
        if(close<open) {

            solve(n,open,close+1,temp+")",ans);
        }
    }
}