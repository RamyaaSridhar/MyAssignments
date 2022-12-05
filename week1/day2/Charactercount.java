package week1.day2;

public class Charactercount {

	public static void main(String[] args) {
		/*pseudocode
		 * 1)Break the String into characterArray
		 * 2)Iteriate using for loop
		 * 3)If the character match , count the number
		 */
		String company = "Hexaware";
		char exp='e';
		int count =0;
		char arr[] = company.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==exp) {
				count+=1;
			}
		}
		System.out.println("Count of"+" "+exp+" "+"Present in the input is:"+count);

	}

}
