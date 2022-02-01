package com.test;

public class Main {

    public static void main(String[] args) {
	    int size = 6;
	    Graph g = new Graph(size);
	    g.addEdge(0, 1, 4);
	    g.addEdge(0, 2, 6);

	    g.addEdge(1, 0, 4);
        g.addEdge(1, 2, 6);
        g.addEdge(1, 3, 3);
        g.addEdge(1, 4, 4);

        g.addEdge(2, 0, 6);
        g.addEdge(2, 1, 6);
        g.addEdge(2, 3, 1);

        g.addEdge(3, 1, 3);
        g.addEdge(3, 2, 1);
        g.addEdge(3, 4, 2);
        g.addEdge(3, 5, 3);

        g.addEdge(4, 1, 4);
        g.addEdge(4, 3, 2);
        g.addEdge(4, 5, 7);

        g.addEdge(5, 3, 3);
        g.addEdge(5, 4, 7);

        g.MST(4);
    }
}
