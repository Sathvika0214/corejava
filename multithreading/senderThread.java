package multithreading;


	public class senderThread extends Thread {
		
		
		private	String msg;
	     private sender sender;
		public senderThread(String msg, sender sender) {
			super();
			this.msg = msg;
			this.sender = sender;
		}
			
		@Override
		public void run() {
			
			
			synchronized (sender) {
				
				sender.send(msg);
				
			}
			
			
		}
		
		public static void main(String[] args) {
			
				sender  sender = new sender();
			
					senderThread  t1 = new senderThread("HI",sender);
					
					senderThread  t2 = new senderThread("BYE BYE",sender);
			
					t1.start();
					t2.start();
					
					
					try {
						t1.join();
						t2.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
		}
		


	}

