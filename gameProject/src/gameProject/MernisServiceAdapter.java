package gameProject;

import java.rmi.RemoteException;
import java.time.ZoneId;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean validation(Customer customer) {
		
			  KPSPublicSoap nationalityCheck = new KPSPublicSoapProxy();
			  System.out.println("TC Kimlik doðrulama sistemi");
			  boolean result = false; 
			  try {
				  result = nationalityCheck.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
						  customer.getFirstName(),
						  customer.getLastName(),
						  customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
			  } catch (NumberFormatException | RemoteException e) {
					e.printStackTrace();
				}

				return result;
		
	


}
	}