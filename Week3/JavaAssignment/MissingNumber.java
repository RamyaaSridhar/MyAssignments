package Week3.JavaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		int array [] = {1,2,3,4,6,8,9,10};
		List<Integer> array_list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			array_list.add(array[i]);
		}
		
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		for(int i=1;i<=10;i++) {
			if(!array_list.contains(i)) {
				lhs.add(i);
			}
		}
		System.out.println(lhs);
		

	}

}
