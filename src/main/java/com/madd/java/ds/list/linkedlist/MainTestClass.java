package com.madd.java.ds.list.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MainTestClass {

	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Write your code here.
		Map<String, Integer> scores = new HashMap<String, Integer>();
		for (int i = 0; i < competitions.size(); i++) {
			if (results.get(i) == 0) {
				if (scores.containsKey(competitions.get(i).get(1))) {
					scores.put(competitions.get(i).get(1), scores.get(competitions.get(i).get(1)) + 1);
				}
			}else {
				if (scores.containsKey(competitions.get(i).get(0))) {
					scores.put(competitions.get(i).get(0), scores.get(competitions.get(i).get(0)) + 1);
				}
			}
		}
		
//		
//		  Optional<Entry<String, Integer>> maxEntry = scores.entrySet()
//		            .stream()
//		            .max((Entry<String, Integer> e1, Entry<String, Integer> e2) -> e1.getValue()
//		                .compareTo(e2.getValue())
//		            );
//		        
//		        return maxEntry.get().getKey();
//		
		return null;
	
	}

}
