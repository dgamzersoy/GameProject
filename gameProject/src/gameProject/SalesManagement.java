package gameProject;

public class SalesManagement implements SalesService {



	@Override
	public void gameName(Sale sale) {
	  
		System.out.println("satýlacak ürünün adý: "  + sale.name);
		
	}

	@Override
	public void gameSale(Sale sale, Campaign campaign) {
		System.out.println("kampanyalý fiyat" + campaign.getRemaining());
		
	}



}
