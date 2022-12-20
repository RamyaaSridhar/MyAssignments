package Week3.JavaAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class SecondLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String next = sc.nextLine();
		String[] input = next.split(" ");
		Set<Integer> tree =  new TreeSet<Integer>();
		
		for(int i=0;i<input.length;i++) {
			int value = Integer.parseInt(input[i]);
			tree.add(value);
		}
		//Set into List
		List<Integer>new1 = new ArrayList<Integer>(tree);
		Collections.sort(new1);
		Collections.reverse(new1);
		System.out.println("Second Largest Element is :"+" "+new1.get(1));


	}

}
