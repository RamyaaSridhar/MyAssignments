package javaChallenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DigitFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();             //Myself2 Me1 I4 and3
		String[] split = input.split(" ");
		
		Map<Integer,String> word = new TreeMap<Integer,String>();
		
		for(int i=0;i<split.length;i++) {
			String digit = split[i].replaceAll("[^0-9]","");
			String letter = split[i].replaceAll("[0-9]", "");
			int index = Integer.parseInt(digit);
			word.put(index, letter);
			
			
			
		}
		Collection<String> values = word.values();
		for (String iter : values) {
			System.out.print(iter+" ");
		}
		
		
	}

}
