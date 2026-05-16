import java.util.*;

class Leetcode_3211 {

    public static List<String> validStrings(int n) {

        List<String> ans = new ArrayList<>();
        Map<String, Boolean> memo = new HashMap<>();

        solve(n, "", ans, memo);

        return ans;
    }

    public static void solve(int n, String curr,
                      List<String> ans,
                      Map<String, Boolean> memo) {

        if (curr.length() == n) {
            ans.add(curr);
            return;
        }

        String key = curr;

        if (memo.containsKey(key)) return;

        solve(n, curr + "1", ans, memo);

        if (curr.length() == 0 ||
            curr.charAt(curr.length() - 1) != '0') {

            solve(n, curr + "0", ans, memo);
        }

        memo.put(key, true);
    }
    public static void main(String [] args){
        int n=5;
        List<String> result=validStrings(n);
        System.out.println(result);
    }
}