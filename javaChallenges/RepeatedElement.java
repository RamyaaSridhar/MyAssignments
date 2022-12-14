package javaChallenges;
import java.util.Scanner;


public class RepeatedElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		String [] input = values.split(" ");
		int count =0;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i].equals(input[j])) {
					count+=1;
				}
			}
			if(count>1) {
				System.out.println("true");
				break;
				
			}
		}
		if (count<1) {
			System.out.println("false");
		}

	}

}
