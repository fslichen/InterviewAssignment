package evolution;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapValue {
	public static List<Entry<String, Integer>> sort(Map<String, Integer> map) {
		List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> entry0, Entry<String, Integer> entry1) {
				return (entry0.getValue()).compareTo(entry1.getValue());// Ascending
			}
		});
		return list;
	}	
	
	public static List<Entry<String, Integer>> sortByStream(Map<String, Integer> map) {
		List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		// Descending Sort
		return list.stream().sorted((x, y) -> y.getValue().compareTo(x.getValue())).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Java", 84);
		map.put("C++", 25);
		map.put("Php", 37);
		map.put("Python", 42);
		map.put("Ruby", 98);
		map.put("Perl", 37);
		map.put("Pascal", 34);
		System.out.println(sort(map));
		System.out.println(sortByStream(map));
	}
}
