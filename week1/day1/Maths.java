package week1.day1;

public class Maths {

	public static void main(String[] args) {
		Maths oper = new Maths();              											//Object Creation
		System.out.println("Addition of two Numbers :" + oper.add(10,10));				//Method Calling
		System.out.println("Multiplication of two Numbers :" + oper.multi(10,10));		//Method Calling
		System.out.println("Division of two Numbers :" + oper.divide(10,10));			//Method Calling
		

	}

	private int add(int a, int b) {														//add Method definition
		int res = a+b;
		return res;
		
	}
	private int multi(int a, int b) {													//multi Method definition
		int res = a*b;
		return res;
		
	}
	private int divide(int a, int b) {													//divide Method definition
		int res = a/b;
		return res;
		
	}

}
