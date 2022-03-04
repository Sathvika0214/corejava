package multithreading;
public class runThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		runThread mt = new  runThread();
  		mt.start();
 	}
}




