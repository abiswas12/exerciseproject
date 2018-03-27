import static org.junit.Assert.*;

import org.junit.Test;

import accountsproject.service;

public class servicetest {

	@Test
	public void test() {
        service service = new service();
		
		service.addAcc("Matt", "Moore", "0");
		assertTrue(service.retrieveAccount(0).getAccountNo() == "0");
		service.addAcc("Nick", "Watton", "1");
		assertTrue(service.retrieveAccount(1).getAccountNo() == "1");
		service.addAcc("Anirban", "Biswas", "2");
		assertTrue(service.retrieveAccount(2).getAccountNo() == "2");
		service.addAcc("Andrew", "McGill", "3");
		assertTrue(service.retrieveAccount(3).getAccountNo() == "3");
		
		service.removeAcc(3);
		service.removeAcc(2);
		service.removeAcc(1);
		service.removeAcc(0);
	}

}
