package gameProject;

public class SalesManagement implements SalesService {



	@Override
	public void gameName(Sale sale) {
	  
		System.out.println("sat�lacak �r�n�n ad�: "  + sale.name);
		
	}

	@Override
	public void gameSale(Sale sale, Campaign campaign) {
		System.out.println("kampanyal� fiyat" + campaign.getRemaining());
		
	}



}
