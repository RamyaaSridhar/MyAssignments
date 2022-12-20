package Week3.JavaAssignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		Set<Character> lhs = new LinkedHashSet<Character>();
		
		String name = "Ramya";
		char[] charArray = name.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(!lhs.contains(charArray[i])){
				lhs.add(charArray[i]);
				
			}
			else {
				lhs.remove(charArray[i]);
			}	
		}
		
		System.out.println(lhs);
	}

}
