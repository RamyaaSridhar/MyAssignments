package org.system;

public class Desktop extends Computer {
	
	public static void main(String [] args) {
		
		Desktop object = new Desktop();                        //Creating object to access the methods in same and other classes in package.
		
	    object.computerModel();
	    int size = object.desktopSize();
	    System.out.println("Size of the laptop:"+" "+size);
	    	
	}

	private int desktopSize() {
		return 100;
		
		
	}
	
	

}
