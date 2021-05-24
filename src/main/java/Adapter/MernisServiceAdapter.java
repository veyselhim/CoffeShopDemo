package Adapter;

import Abstract.CustomerCheckService;
import Adapter.MernisService.tr.gov.nvi.tckimlik.ws.KPSPublic;
import Adapter.MernisService.tr.gov.nvi.tckimlik.ws.KPSPublicSoap;
import Entities.Customer;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.URL;
import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @SneakyThrows
    @Override
    public boolean checkIfRealPerson(Customer customer){

        String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
        URL url = URI.create(endpoint).toURL();
        KPSPublic service = new KPSPublic(url);
        KPSPublicSoap publicSoap = service.getPort(KPSPublicSoap.class);

        return publicSoap.tcKimlikNoDogrula(customer.getNationaltyId(), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(Locale.ROOT), customer.getDateOfBirdth());

    }
}
