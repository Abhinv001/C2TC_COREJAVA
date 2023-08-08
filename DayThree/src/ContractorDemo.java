
public class ContractorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer  c = new customer();
		c.setCustomerId(1);
		c.setCustomerName("Abhinav");
		c.setCustomercity("Bangalore");
		
		//System.out.println(c.getCustomerId());
		//System.out.println(c.getCustomerName());
		//System.out.println(c.getCustomercity());
		System.out.println(c);
		
		c.disply();
	}

}
