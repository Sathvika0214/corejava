package multithreading;

public class sender {
	
		
		
		
		public void send(String msg) {
			
			System.out.println("Sending  "+msg);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Message Sent "+msg);
			
			
		}

	}

