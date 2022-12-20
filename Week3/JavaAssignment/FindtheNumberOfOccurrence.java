package Week3.JavaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindtheNumberOfOccurrence {

	public static void main(String[] args) {
		
		int [] array = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			if(!hashMap.containsKey(array[i])) {
				hashMap.put(array[i],1);
			}
			else {
				Integer integer = hashMap.get(array[i]);
				hashMap.put(array[i], integer+1);
			}
		}
		
		
		//sorting the map
				Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
				List<Entry<Integer, Integer>>list = new ArrayList<>(entrySet);    //Convert Map into List to perform Sorting
				Collections.sort(list, new Comparator <Entry<Integer, Integer>> () {

					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
						
						return o1.getKey().compareTo(o2.getKey());
					}
	});
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i).getKey()+"->"+list.get(i).getValue()+","+" ");
				}
				
	}
}