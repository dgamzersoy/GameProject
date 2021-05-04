package gameProject;

public class CampaignManager implements CampaignService {
	
	

	@Override
	public void AddNewCampaign(Campaign campaign) {
	System.out.println("kampanya adý : " + campaign.getName());
		
	}

	@Override
	public void CampaignUpdate(Campaign campaign) {
		System.out.println("kampanya güncellendi : " + campaign.getName());
		
	}

	@Override
	public void CampaignDelete(Campaign campaign) {
		System.out.println("kampanya silindi : " + campaign.getId());
		
	}

	@Override
	public void CampaignCalculate(Campaign campaign) {
		
		System.out.println("kampanya indirimi % : " + campaign.getDiscountAmount());
	}

}
