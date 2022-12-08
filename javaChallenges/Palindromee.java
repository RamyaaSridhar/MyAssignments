package javaChallenges;
import java.util.Scanner;
public class Palindromee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1= str.replaceAll("[,:^]*", ""); 
		String str2 = str1.replaceAll("\\s", "").toLowerCase();
		char [] revstr = str2.toCharArray();
		//System.out.println(str2);
		String empty ="";
		
		for(int i=revstr.length-1;i>=0;i--) {
			empty+=revstr[i];
			
		}
	
		if(empty.equals(str2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
