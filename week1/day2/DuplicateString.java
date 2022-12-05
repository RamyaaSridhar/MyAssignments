package week1.day2;

public class DuplicateString {

	public static void main(String[] args) {
		String company ="amazon development";
		char chararr[]=company.toCharArray();
		for(int i=0;i<chararr.length;i++) {
			for(int j=i+1;j<chararr.length;j++) {
				if(chararr[i]==chararr[j]) {
					System.out.println("Duplicate :"+chararr[i]);
				}
			}
		}

	}

}
