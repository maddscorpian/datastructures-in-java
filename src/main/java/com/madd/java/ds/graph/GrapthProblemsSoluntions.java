package com.madd.java.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GrapthProblemsSoluntions {

	public int componentCount(int[][] edges) throws Exception {
		if (edges == null || edges.length == 0)
			return 0;
		
		
		// Represent the graph in a Adj List.
		Map<Integer, List<Integer>> adjList = GraphUtilities.createAdjList(edges);
		
		
		// Create a list for staring visited list.
		boolean[] visited = new boolean[adjList .size()];

		// Variable to store the count of components. 
		int count = 0;
		// Loop through all the vertices 
		for (int i=0;i<adjList.size();i++) {
			if (visited[i] == false) {
				count++;
				//GraphUtilities.dfs()
			}
		}
		return 0;

	}

	public boolean isGraphCyclic(int[][] edges) throws Exception {
		if (edges == null || edges.length == 0)
			return false;
		// Represent the graph in a Adj List.
		Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();

		for (int[] edge : edges) {
			if (edge.length != 2) {
				// Invalid edge.
				throw new Exception("Invalid edge. Invalid Graoh");
			}
			List<Integer> list = adjList.get(edge[0]);
			// Adding for the first time.
			if (list == null) {
				list = new ArrayList<Integer>();
			}
			list.add(edge[1]);
			adjList.put(edge[0], list);
		}

		return false;

	}

}
