package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FirstNonRepeatChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] charArray = input.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		List<Character> list = new ArrayList<Character>();
		int output=0;
		for(int i=0;i<charArray.length;i++) {
			if(map.containsKey(charArray[i])){
				
				Integer value = map.get(charArray[i]);
				map.put(charArray[i], value+1);
				if(list.contains(charArray[i])) {
					int index = list.indexOf(charArray[i]);
					list.remove(index);
				}
				
				
				
				
			}
			else {
				list.add(charArray[i]);
				map.put(charArray[i], 1);
			}
		}
		
		if(list.size()>=1) {
			char res = list.get(0);
			System.out.println("First Non-repeating Character :"+" "+input.indexOf(res));
		}
		else {
			System.out.println("-1");
		}
		
		

	}

}
