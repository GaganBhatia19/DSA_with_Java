package com.company.Graphs;

public class Graphs1_DFS1 {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,0,0},{0,0,1,1,1,0},{0,1,0,1,0,1},{0,1,1,0,1,1},{0,1,0,1,0,0},{0,0,1,1,0,0}};
        boolean[]visited = new boolean[10];
        DFS(1,matrix,visited);
        visited = new boolean[10];
        System.out.println();
        DFS(2,matrix,visited);
        System.out.println();
        visited = new boolean[10];
        DFS(3,matrix,visited);
        System.out.println();
        visited = new boolean[10];
        DFS(4,matrix,visited);
        System.out.println();
        visited = new boolean[10];
        DFS(5,matrix,visited);
    }
    static void DFS(int u, int[][]matrix,boolean[]visited) {
        if(!visited[u]) { // if not visited
            System.out.print(u + " ");
            visited[u] = true; // mark as visited
            for(int vertex = 1;vertex<=matrix.length-1;vertex++) {
                if(matrix[u][vertex] == 1 && !visited[vertex]) {
                    DFS(vertex,matrix,visited);
                }
            }
        }
    }
}
