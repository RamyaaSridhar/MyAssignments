package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "babu";
		char [] namearr = name.toCharArray(); //Convert String into Character Array.
		for(int i=namearr.length-1;i>=0;i--) {
			System.out.print(namearr[i]);
		}

	}

}
