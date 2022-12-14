package com.listToMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapToList {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("siva", 1);
		map.put("mahesh", 2);
		map.put("shan", 4);
		map.put("ravi", 3);
		map.put("sriman", 5);
		System.out.println(map);
		System.out.println("-=-==-=-=-Sorting With TreeMAp-=-=-=-=-=-=-=-=-");
		TreeMap<String, Integer> tree = new TreeMap<>(map);
		System.out.println(tree);
		System.out.println("-=-==-=-=--=Convert map to List-=-=-=-=-=-=-=-");
		List<Entry<String, Integer>> list = new ArrayList(map.entrySet());
		System.out.println(list);
		System.out.println("-=-==-=-=--=Sorting Normal=====");
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		System.out.println(list);
		System.out.println("-=-==-=-=--=Sorting value Normal=====");
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(list);

	}

}
