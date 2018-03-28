package accountsproject;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	private HashMap<Integer,Account> acc;
	private int count;
	
	public Service(){
		count =0;
		acc = new HashMap<Integer,Account>();
	}
	
	public void removeAcc(int acckey) {
		if(acc.containsKey(acckey)) acc.remove(acckey);
	}
	
	public void addAcc(String firstname, String lastname, String accno) {
		this.acc.put(count, new Account(firstname, lastname, accno));
		count++;
	}
	
	public Account retrieveAccount(int key)
	{
		return acc.get(key);
	}
	
	public String translateAccount() throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonFromMap = mapper.writeValueAsString(acc);
		//System.out.println(jsonFromMap);
		
		return jsonFromMap;
	}

	public int countAccount(String rptdFistN) {
		int namecount =0;
		Account accholder;
		for (int i=0;i<acc.size();i++) {
			accholder = acc.get(i);
			if (accholder.getFirstname().equals(rptdFistN)) namecount++;
		}
		return namecount;
	}
}