package Graphs;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Main1{
    
    public static void main(String[] args) {
        
        int v = 5;
        int e = 10;

        int a[][] = new int[v+1][v+1];
        ArrayList<Arraylist<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<=v; i++){
            adj.add(new ArrayList<Integer>());
        }

    }

    static void addEdge(int src, int des){
    
        a[src][des] = 1;
        a[des][src] =1;
    }


    static void addEdge(ArrayList<ArrayList<Integer>> adj,int src,int des){
        adj.get(src).add(des);
        adj.get(des).add(src);
    }
}