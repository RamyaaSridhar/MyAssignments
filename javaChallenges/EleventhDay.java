package javaChallenges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EleventhDay {

	public static void main(String[] args) {
		
		String input = "abccbaacz";
		char[] charArray = input.toCharArray();
		
		Map<Character,Integer> hashMap = new LinkedHashMap<Character,Integer>() ;
		for(int i=0;i<charArray.length;i++) {
			if(!hashMap.containsKey(charArray[i])) {
				hashMap.put(charArray[i], 1);
			}
			else {
				System.out.println("First twice Character is :"+" "+charArray[i]);	
				break;
			}
			
		}
		

	}

}
