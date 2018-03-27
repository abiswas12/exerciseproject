package accountsproject;

public class account {
	private String firstname;
	private String secondname;
	private String AccountNo;
	public account(String firstN,String secondN,String AccN) {
		this.setFirstname(firstN);
		this.setSecondname(secondN);
		this.setAccountNo(AccN);
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
}
