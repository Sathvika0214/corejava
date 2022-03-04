package multithreading;

public class Diamond3 implements Diamond1, Diamond2 {
	

	
		
			
		
			public void show() {
				
				 Diamond1.super.show();
				 Diamond2.super.show();
				
			}
		
		
			public static void main(String[] args) {
				
					Diamond3 test = new Diamond3();
					
					test.show();
				
			}
		

	}
	

