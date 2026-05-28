package Graph;
// edges = [[0,1],[0,2],[1,3],[2,4]]
import java.util.*;
class createAdjList {
    public static void main(String[] args) {
        int n=5;
        int [][] edges={{0,1},{0,2},{1,3},{2,4}};
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            //for directed graph:-
            //adj.get(edges[i][0]).add(edges[i][1]);
        }
        System.out.println(adj);
    }
}