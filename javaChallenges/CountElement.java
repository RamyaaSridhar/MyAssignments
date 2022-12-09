package javaChallenges;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountElement {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
	    String []larNum = values.split(" ");
		
		for(int i=0;i<larNum.length;i++) {
			int count=0;
			for(int j=0;j<larNum.length;j++) {
				if(Integer.parseInt(larNum[i])==Integer.parseInt(larNum[j])) {
					count+=1;
				}	
			}
			map.put(larNum[i],count);	
			
		}
		//Accessing Key
		Set<String>keys = map.keySet();	
		for(String key :keys) {
			//System.out.println(key);
		}
		
		//Accessing Values
		for(Integer value :map.values()) {
			//System.out.println(value);
		}
		
		Set<Entry<String,Integer>>entries = map.entrySet();
		for(Entry<String,Integer>entry : entries) {
			if(entry.getValue()!=1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
