package javaChallenges;
import java.util.Scanner;

public class MajorityEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		String[] arr = value.split(" ");
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=i+1;j<arr.length;j++) {
				if(Integer.parseInt(arr[i])==Integer.parseInt(arr[j])) {
					//System.out.println(Integer.parseInt(arr[i])+Integer.parseInt(arr[j]));
					count+=1;
				}
				
				
			}
			if(count>res) {
				res=Integer.parseInt(arr[i]);
			}
		}
		System.out.println(res);
		

	}

}
