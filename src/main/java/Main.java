import Abstract.BaseCustomerManager;
import Adapter.MernisService.tr.gov.nvi.tckimlik.ws.KPSPublic;
import Adapter.MernisService.tr.gov.nvi.tckimlik.ws.KPSPublicSoap;
import Adapter.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.URL;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        customerManager.save(new Customer(1,"VEYSEL","HİMMETOĞLU",2000, 2341341));

    }

}
