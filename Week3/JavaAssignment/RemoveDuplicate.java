package Week3.JavaAssignment;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String>lhs = new LinkedHashSet<String>();
		String nextLine = sc.nextLine();
		String[] input = nextLine.split(" ");
		for(int i=0;i<input.length;i++) {
			lhs.add(input[i]);
		}
		Object[] array = lhs.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		

	}

}
