package com.test;

import java.util.Arrays;

public class Graph {
    int v;
    int[][] g;

    public Graph(int v){
        this.v = v;
        g = new int[v][v];
    }

    public void addEdge(int i, int j, int wt){
        g[i][j] =  wt;
    }

    public void MST(int startVertex){
        boolean[] visited = new boolean[v];
        int[] dist = new int[v];
        int[] parent = new int[v];

        Arrays.fill(dist, Integer.MAX_VALUE);

        parent[startVertex] = startVertex;
        dist[startVertex] = 0;

        for (int i = 0; i < v - 1; i++) {
            int minVertex = findMin(dist, visited);
            visited[minVertex] = true;
            for (int j = 0; j < v; j++) {
               if (g[minVertex][j] != 0 && !visited[j] && g[minVertex][j] < dist[j]){
                   parent[j] = minVertex;
                   dist[j] = g[minVertex][j];
               }
            }
        }

        for (int i = 1; i < v; i++) {
            System.out.println(parent[i] + "->" + i + " : " + g[parent[i]][i]);
        }
    }

    private int findMin(int[] dist, boolean[] visited){
        int min = Integer.MAX_VALUE;
        int vertex = 0;
        for (int i = 0; i < v; i++) {
           if(!visited[i] && dist[i] < min){
               min = dist[i];
               vertex = i;
           }
        }
        return vertex;
    }
}
