package facadePattern;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager();
		
		customerService.save();

	}

}
