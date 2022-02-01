package com.deepanshu;

public class DSU {
    private int size;
    private int[] rank, parent;

    public DSU(int size){
        this.size = size;
        rank = new int[size];
        parent = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int n){
        if(parent[n] == n) return n;
        return parent[n] = find(parent[n]);
    }

    public void union(int a, int b){
        int s1 = find(a);
        int s2 = find(b);
        if(s1 != s2){
           if(rank[s1] < rank[s2]){
               parent[s1] = s2;
               rank[s2] += rank[s1];
           }
           else{
               parent[s2] = s1;
               rank[s1] += rank[s2];
           }
        }
    }
}
