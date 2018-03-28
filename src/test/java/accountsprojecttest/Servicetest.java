package accountsprojecttest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import accountsproject.Service;

public class Servicetest {
	
	Service service;
	
	@Before
	public void beforetest() {
		service = new Service();
	}
	
	@Test
	public void test() throws Exception {
        
        String jsonconvert = "{\"0\":{\"firstname\":\"Matt\",\"secondname\":\"Moore\",\"accountNo\":\"0\"},\"1\":{\"firstname\":\"Nick\",\"secondname\":\"Watton\",\"accountNo\":\"1\"},\"2\":{\"firstname\":\"Anirban\",\"secondname\":\"Biswas\",\"accountNo\":\"2\"},\"3\":{\"firstname\":\"Andrew\",\"secondname\":\"McGill\",\"accountNo\":\"3\"}}";
		String jsonmap;
        
		service.addAcc("Matt", "Moore", "0");
		assertTrue(service.retrieveAccount(0).getAccountNo() == "0");
		service.addAcc("Nick", "Watton", "1");
		assertTrue(service.retrieveAccount(1).getAccountNo() == "1");
		service.addAcc("Anirban", "Biswas", "2");
		assertTrue(service.retrieveAccount(2).getAccountNo() == "2");
		service.addAcc("Andrew", "McGill", "3");
		assertTrue(service.retrieveAccount(3).getAccountNo() == "3");
		
		jsonmap = service.translateAccount();
		assertEquals(jsonmap, jsonconvert);
		service.removeAcc(3);
		service.removeAcc(2);
		service.removeAcc(1);
		service.removeAcc(0);
	}
	
	@Test
	public void test2() {
		String repeatedFirstName = "Anirban";
		String repeatedSecondName = "Biswas";
		service.addAcc("Matt", "Moore", "0");
		service.addAcc("Nick", "Watton", "1");
		service.addAcc(repeatedFirstName, repeatedSecondName, "2");
		service.addAcc("Andrew", "McGill", "3");
		service.addAcc(repeatedFirstName, repeatedSecondName, "4");
		service.addAcc(repeatedFirstName, repeatedSecondName, "5");
		service.addAcc(repeatedFirstName, repeatedSecondName, "6");
		int numbcheck = service.countAccount(repeatedFirstName);
		assertEquals(4, numbcheck);
	}
	

}
