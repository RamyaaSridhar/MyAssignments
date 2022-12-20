package javaChallenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TenthDayChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		char [] jewels = a.toCharArray();
		char[] stones = b.toCharArray();
		List <Character> list = new ArrayList<Character>();
		for(int i=0;i<jewels.length;i++) {
			list.add(jewels[i]);
		}
		int count=0;
		for(int i=0;i<stones.length;i++) {
			if(list.contains(stones[i])){
				count+=1;
			}
		}
		System.out.println("Total stones in Jewel is :"+count);

	}

}
