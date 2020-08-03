package jp.co.z250.kakeibo.model.form;

import java.io.Serializable;

public class UserForm implements Serializable {
	private static final long serialVersionUID=1L;
	
	private String mailAddress;
	private String userName;
	private String password;
	
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress=mailAddress;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}

}
