package Graph;

// n = 5
// edges = [[0,1,5],[0,2,2],[1,3,5],[2,4,7]]
import java.util.*;
class weightedGraph {
    public static void main(String[] args) {
        int n=5;
        int [][] edges={{0,1,5},{0,2,2},{1,3,5},{2,4,7}};
        ArrayList<ArrayList<int []>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
           int u=edges[i][0];
           int v=edges[i][1];
           int w=edges[i][2];

           adj.get(u).add(new int[]{v,w});
           adj.get(v).add(new int[]{u,w});
        }
        //print adj_list
        for(int i=0;i<n;i++){
            System.out.print(i + " -> ");
            for(int [] item: adj.get(i)){
                System.out.print("(" +item[0] +" "+item[1]+ ")");

            }
            System.out.println();
        }
    }
}
