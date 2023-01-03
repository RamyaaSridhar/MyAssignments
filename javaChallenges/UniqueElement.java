package javaChallenges;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueElement {

	public static void main(String[] args) {
		
		
		int arr [] = {1,2,3,2};
		Arrays.sort(arr);
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		int c=1;
		for(int i=0;i<arr.length;i++) {
			
			if(i!=arr.length-1) {
				if(arr[i]==arr[i+1]) {
					c+=1;
					
				}
				else {
					map.put(arr[i], c);
					c=1;
				}
			}
			else {
				if(arr[arr.length-1]==arr[arr.length-2]) {
					map.put(arr[i], c);
				}
				else {
					map.put(arr[i],c);
					map.put(arr[arr.length-1], 1);
				}
			}
			
			
		}
		int res = 0;
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			
			if(entry.getValue()==1) {
				res+=entry.getKey();
			}
			
		}
		System.out.println("Sum of Unique element is :"+res);
		
	}

}
