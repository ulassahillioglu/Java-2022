package interfaceDemo;

public class Worker implements IWorkable,IEatable,IPayable{

	@Override
	public void pay() {
		System.out.println("Payable");
		
	}

	@Override
	public void eat() {
		System.out.println("Eatable");
		
	}

	@Override
	public void work() {
		System.out.println("Workable");
		
	}

}
