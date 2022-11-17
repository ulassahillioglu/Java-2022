package kodlamaIOSimulation.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged via e-mail: " + message);
		
	}

}
