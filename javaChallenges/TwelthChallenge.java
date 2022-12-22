package javaChallenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TwelthChallenge {

	public static void main(String[] args) {
		
		int[] array= {-3,0,1,-3,1,1,1,-3,10,0};
		
		Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			if(!hashMap.containsKey(array[i])){
				hashMap.put(array[i], 1);
			}
			else {
				Integer integer = hashMap.get(array[i]);
				hashMap.put(array[i], integer+1);
				
			}
		}
		System.out.println(hashMap);
		
		List<Integer> result = new ArrayList<Integer>();
		
		
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		int c1=0;
		for (Entry<Integer, Integer> entry : entrySet) {
			if(!result.contains(entry.getValue())) {
				result.add(entry.getValue());
				
			}
			else {
				System.out.println("false");
				c1+=1;
				break;
			}
		}
		if(c1==0) {
			System.out.println("true");
		}
		
		
		
	}
}


