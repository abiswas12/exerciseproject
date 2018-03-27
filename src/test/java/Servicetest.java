import static org.junit.Assert.*;

import org.junit.Test;

import accountsproject.Service;

public class Servicetest {

	@Test
	public void test() throws Exception {
        Service service = new Service();
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

}
