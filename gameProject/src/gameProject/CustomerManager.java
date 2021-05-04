package gameProject;

public class CustomerManager implements CustomerService {
	
	CustomerCheckService customerCheckService ;
	

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Add(Customer customer) {
		System.out.println("oyuncu eklendi: " + customer.getFirstName());
		
	}

	@Override
	public void Update(Customer customer) {
		System.out.println("oyuncu bilgileri güncellendi: " + customer.getFirstName());
		
	}

	@Override
	public void Delete(Customer customer) {
		System.out.println("oyuncu silindi: " + customer.getId());
		
	}

	

}

	


	

