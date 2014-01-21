
public class Process {

	public static void main(String[] str){
		Thread t = new Thread( new OwnCommand() );
		t.setName("TextProzess");
		t.start();
		System.out.println("In der Main-Methode");
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Main - Zeile: " + i);
			
		}
	}
	
}

class OwnCommand implements Runnable
{
  @Override public void run()
  {
	  System.out.println("In dem OwnCommand");
	  for (int i = 0; i < 10; i++) {
			
			System.out.println("Own - Zeile: " + i);
			
		}
	  
  }
}


