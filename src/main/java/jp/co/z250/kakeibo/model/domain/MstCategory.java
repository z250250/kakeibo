package jp.co.z250.kakeibo.model.domain;

import java.sql.Timestamp;

public class MstCategory {
	
	private int id;
	private String categoryName;
	private Timestamp createdAt;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName=categoryName;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt=createdAt;
	}

}
