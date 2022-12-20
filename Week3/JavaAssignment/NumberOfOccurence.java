package Week3.JavaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOfOccurence {

	public static void main(String[] args) {
		
		String a = "ababba";
		char[] input = a.toCharArray();
		Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for(int i=0;i<input.length;i++) {
			if(!hashMap.containsKey(input[i])) {
				hashMap.put(input[i],1);
			}
			else {
				Integer integer = hashMap.get(input[i]);
				hashMap.put(input[i], integer+1);
			}
		}
		//sorting the map
		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		List<Entry<Character, Integer>>list = new ArrayList<>(entrySet);    //Convert Map into List to perform Sorting
		Collections.sort(list, new Comparator<Entry<Character, Integer>> () {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		int size = list.size();
		System.out.println("Most Repeating Character is:"+" "+list.get(size-1).getKey());
		
		

	}

}
