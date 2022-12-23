package Week3.JavaAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindtheNumberOfOccurrence {

	public static void main(String[] args) {
		
		int [] array = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> hashMap = new TreeMap<Integer,Integer>(); //{}
	
		for(int i=0;i<array.length;i++) {
			if(!hashMap.containsKey(array[i])) {
				hashMap.put(array[i],1);
			}
			else {
				Integer integer = hashMap.get(array[i]);
				hashMap.put(array[i], integer+1);
			}
		}
		System.out.println(hashMap);
		
		//----------------------------Ascending order-------------------------------------------------------------
		
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		
		for(Entry<Integer,Integer> val : entrySet)
        {
            System.out.print(val.getKey() + "-->" + val.getValue()+",");
        }
		System.out.println();
		
		//------------------------------Descending Order------------------------------------------------------
		Set<Integer> keySet = hashMap.keySet();
		Object[] keys = keySet.toArray();
		Collection<Integer> value = hashMap.values();
		Object[] values = value.toArray();
		
		for(int i=(keys.length)-1;i>=0;i--) {
			if(i!=0) {
				System.out.print(keys[i]+"-->"+values[i]+",");
			}
			else {
				System.out.print(keys[i]+"-->"+values[i]);
			}
		}
		
	}

	
}