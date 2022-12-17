package abstraction;

public class Automation extends MultipleLanguage implements TestTool {

	public static void main(String[] args) {
		
		Automation object = new Automation();
		System.out.println(object.seleniumTool());
		System.out.println(object.java());
		object.python();
		object.ruby();
		

	}

	@Override
	public String seleniumTool() {
		
		return "Selenium is an interface(TestTool) , so dont'have implementation";
	}
	

	@Override
	public String java() {
		
		return "java is an interface (Language) , so dont'have implementation";
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language is unimplementaed method");
		
	}

}
