package com.deepanshu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
    private int v;
    private List<List<Integer>> g;

    public Graph(int v){
        this.v = v;
        g = new ArrayList<>();
        for(int i = 0; i < v; i++){
            g.add(new ArrayList<>());
        }
    }

    public void addEdge(int a, int b){
        g.get(a).add(b);
    }

    public boolean containsCycle(){
        DSU ds = new DSU(v);
        for(int i = 0; i < v; i++){
            for(int j : g.get(i)){
                int s1 = ds.find(i);
                int s2 = ds.find(j);
                if(s1 == s2) return true;
                ds.union(i, j);
            }
        }
        return false;
    }
}
