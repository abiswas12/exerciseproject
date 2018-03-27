package accountsproject;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class service {
	private HashMap<Integer,account> acc;
	private int count;
	
	public service(){
		count =0;
		acc = new HashMap<Integer,account>();
	}
	public void removeAcc(int acckey) {
		if(acc.containsKey(acckey)) acc.remove(acckey);
	}
	public void addAcc(String firstname, String lastname, String accno) {
		this.acc.put(count, new account(firstname, lastname, accno));
		count++;
	}
	public account retrieveAccount(int key)
	{
		return acc.get(key);
	}
	public String translateAccount() throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonFromMap = mapper.writeValueAsString(acc);
		System.out.println(jsonFromMap);
		
		return jsonFromMap;
	}
}