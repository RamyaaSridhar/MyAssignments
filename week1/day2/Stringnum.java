package week1.day2;

public class Stringnum {
	public static void main(String[] args) {
		String details = "Amazon has 11400 employees in chennai";
		/*String arr[] = details.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains("0")||
					arr[i].contains("1")||
					arr[i].contains("2")||
					arr[i].contains("3")||
					arr[i].contains("4")||
					arr[i].contains("5")||
					arr[i].contains("6")||
					arr[i].contains("7")||
					arr[i].contains("8")||
					arr[i].contains("9")) {
				System.out.println(arr[i]);
			}*/
		String  res= details.replaceAll("[0-9]", "@");
		System.out.println(res);
		
				
			}
		}
	
	
	
	


