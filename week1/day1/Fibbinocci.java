package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		int t1=0, t2=1;
		System.out.print(t1+" ");
		for(int i=0;i<=11;i++) {
			int res =t1+t2;
			System.out.print(res+" ");
			t2=t1;
			t1=res;
			
		}

	}

}
