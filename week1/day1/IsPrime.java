package week1.day2;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count+=1;
				break;
			}
		}
		
		if(count==0) {
			System.out.println(num+" is a prime Number");
		}
		else {
			System.out.println(num+" is not a prime Number");
		}
		
			
		
	}

}
