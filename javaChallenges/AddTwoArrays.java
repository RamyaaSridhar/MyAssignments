package javaChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine();
		String[]  arr1 = in1.split(" ");
		String in2 = sc.nextLine();
		String[]  arr2 = in2.split(" ");
		
		//String arr1 [] = {"ab","c"};
		//String arr2 [] = {"a","bc"};
		
		/*List first = new ArrayList(Arrays.asList(arr1));
		first.addAll(Arrays.asList(arr2));
		System.out.println(first);*/
		
		int a = arr1.length;
		int b = arr2.length;
		
		String first="",second="";
		for(int i=0;i<a;i++) {
			first+=arr1[i];
		}
		
		for(int i=0;i<b;i++) {
			second+=arr2[i];
		}
		if(first.equals(second)) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
		
	}

}
