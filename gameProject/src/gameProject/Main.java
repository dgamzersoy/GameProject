package gameProject;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;



public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Dilek Gamze");
		customer1.setLastName("Ersoy");
		customer1.setNationalityId("16513133890");
		customer1.setDateOfBirth(new GregorianCalendar(1995, 8 , 21).getTime());
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
        customerManager.Add(customer1);  
        
        Sale sale1 = new Sale();
        sale1.setName("knight online");
        sale1.setPrice(1200);
        
        
        Campaign campaign = new Campaign();
        campaign.setName("bahar indirimi");
        campaign.setDiscountAmount(20);
        campaign.setPrice(1000);
        
     
      CampaignManager campaignManager = new CampaignManager();
      campaignManager.CampaignCalculate(campaign);
      
      SalesManagement salesManagement = new SalesManagement();
      salesManagement.gameSale(sale1, campaign);
   
        
        
        
        
        
        
	}

}
