package multithreading;


	public class MainException {
		   public static void main(String args[]) {
		      try {
		         throw new CustomException("This is a custom message");
		      } catch(CustomException e) {
		         System.out.println(e);
		      }
		   }
		}

