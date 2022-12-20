package Week3.JavaAssignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class sortAlphabetically {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		String[] input = nextLine.split(" ");
		
		List<String> ll = new LinkedList<String>();
		
		for(int i=0;i<input.length;i++) {
			ll.add(input[i]);
		}
		
		Collections.sort(ll);
		Collections.reverse(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+","+" ");
		}
		

	}

}
