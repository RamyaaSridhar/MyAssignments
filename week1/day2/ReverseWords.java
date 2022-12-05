package week1.day2;

public class ReverseWords {

	public static void main(String[] args) {
		String name = "Amazon developement center, Chennai";
		String [] split = name.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			String res = split[i].toLowerCase();
			System.out.print(res+" ");
		}

	}

}
