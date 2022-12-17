package overridepoly;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		
		AxisBank object = new AxisBank();
		
		System.out.println(object.fixed());
		System.out.println(object.saving());
		System.out.println(object.deposit());
		

	}

	@Override
	public String deposit() {
		
		return "Deposit in AxisBank";
	}
	
	
	
	

}
