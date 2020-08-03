package jp.co.z250.kakeibo.model.domain;

import java.sql.Timestamp;

public class MstProduct {
	
	private int id;
	private String productName;
	private int categoryId;
	private int price;
	private Timestamp createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public int getCategryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId=categoryId;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt=createdAt;
	}

}
