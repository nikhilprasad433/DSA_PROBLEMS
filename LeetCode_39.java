import java.util.*;

public class LeetCode_39 {

    static List<List<Integer>> ans = new ArrayList<>();

    public static void solve(int index, int[] arr, int target, List<Integer> temp) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // If index out of bounds
        if (index == arr.length) {
            return;
        }

        // PICK
        if (arr[index] <= target) {

            temp.add(arr[index]);

            // stay on same index because repetition allowed
            solve(index, arr, target - arr[index], temp);

            // BACKTRACK
            temp.remove(temp.size() - 1);
        }

        // NOT PICK
        solve(index + 1, arr, target, temp);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};
        int target = 7;

        solve(0, arr, target, new ArrayList<>());

        System.out.println(ans);
    }
}