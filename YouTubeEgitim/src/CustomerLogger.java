
public class CustomerLogger implements Logger{

	
	public void log(int data) {
		System.out.println("Saved log into hybernate. User ID : " + data);
		
		
	}

	public void log2(int data) {
		System.out.println("Deleted log from hybernate. User ID : " + data);
		
		
	}

}
