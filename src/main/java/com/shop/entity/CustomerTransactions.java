package com.shop.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="customer_transactions")
public class CustomerTransactions {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;
	@Column(name="productName")
	private String productName;
	@Column(name="productPrice")
	private long productPrice;
	@Column(name="date")
	private Date date = new Date();
}
