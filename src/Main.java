import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		//do�ru bilgiler girildi�inde ba�ar�l� d�ner
		Customer gulsen= new Customer(1, "G�lsen", "Keskin", 1999, "864586456848454");
		BaseCustomerManager customerManager = new BaseCustomerManager() {
		};
		customerManager.Save(gulsen);

		BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManagerStarbucks.Save(gulsen);

		BaseCustomerManager customerManagerNero = new NeroCustomerManager();
		customerManagerNero.Save(gulsen);
		
	}

}
