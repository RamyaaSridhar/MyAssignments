package javaChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.util.SystemOutLogger;

public class LuckyNumber {

	public static void main(String[] args) {

		int [] arr = {1,2,2,3,3,3};
		Arrays.sort(arr);

		Map<Integer,Integer> map = new TreeMap <Integer,Integer>();
		List<Integer> list = new ArrayList<Integer>();


		for (int i=0;i<arr.length;i++) {
			int c=0;
			
			for (int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c+=1;
					
				}
				else {

					continue;
				}


			}
			
			map.put(arr[i],c);
			
		}
		//System.out.println(map);
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if(entry.getKey()==entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		
		System.out.println("Luckest Number is:"+list.get(list.size()-1));



		
	}


}


//if(!list.contains(arr[i]))
