package jp.co.z250.kakeibo.model.domain;

public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String mailAddress;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUseName(String userName) {
		this.userName=userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getMailAddress() {
		return mailAddress;
	}
	
	public void setMailAddress(String mailAddress) {
		this.mailAddress=mailAddress;
	}

}
