package com.madd.java.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphUtilities {
	
	public static Map<Integer, List<Integer>> createAdjList(int[][] edges) throws Exception{
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
		return adjList;
	}

}
