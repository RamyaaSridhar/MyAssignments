package overridepoly;

public class Student {

	public static void main(String[] args) {
		
		Student object = new Student();
		
		object.getmethodInfo(1234);
		object.getmethodInfo(1234,"Ramya");
		object.getmethodInfo("ramyass123@gmail.com",90909090);

	}

	private void getmethodInfo(String email, int phoneNumber) {
		
		System.out.println("Email :"+" "+email);
		System.out.println("PhoneNumber :"+" "+phoneNumber);
		
	}

	private void getmethodInfo(int idt, String name) {
		
		System.out.println("Student-id :"+" "+idt);
		System.out.println("Name of the Student :"+" "+name);
		
		
		
	}

	private void getmethodInfo(int idt) {
		
		System.out.println("Student-id :"+" "+idt);
		
		
	}

}
