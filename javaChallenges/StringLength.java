package javaChallenges;
import java.util.Scanner;
public class StringLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word1 [] = word.split(" ");
		String res = word1[word1.length-1];
		System.out.println(res.length());



	}



}


