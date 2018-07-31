package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Print the elements of an array in the decreasing frequency if 2 numbers have same frequency 
 * then print the one which came first. 
*/

public class SortByFrequency {
	
	public static void main(String[] args) {
		int[] a = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
		
		Map<Integer, Integer> count = new HashMap<>();
		Integer frequency = null;
		for(int x: a) {
			frequency = count.get(x)==null?1:frequency+1;
			count.put(x, frequency);
		}
		System.out.println(count);
		
		List<Map.Entry<Integer, Integer>> l = new ArrayList<>(count.entrySet());
		l.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		
		/*Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return -e1.getValue().compareTo(e2.getValue());
			}
		});
		*/
		
		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, Integer> e : l)
			sortedMap.put(e.getKey(), e.getValue());
		
		System.out.println(sortedMap.keySet());
	}
}
