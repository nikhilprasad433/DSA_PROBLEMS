import java.util.*;
class LeetCode_40{
    public static void main(String [] args) {
int candidates[]={3,4,7,6,43,2,1,5,6};
int target=8;

        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,target,ans,new ArrayList<>());
        System.err.println(ans); 
    }
    public static void solve(int index,int [] candidates,int target,List<List<Integer>> ans, List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
       for(int i=index;i<candidates.length;i++){
        if(i>index && candidates[i]==candidates[i-1]){
            continue;
        }
        if(candidates[i]>target) {
                break;
            }
            temp.add(candidates[i]);
            solve(i+1,candidates,target-candidates[i],ans,temp);
            temp.remove(temp.size()-1);
       }
    }
}