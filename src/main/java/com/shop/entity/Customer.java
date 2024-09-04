package com.shop.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="customer")
public class Customer {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}
	public List<Owner> getOwners() {
		return owners;
	}
	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="customerName")
	private String customerName;
	@Column(name="phnNo")
	private long phnNo;
	@ManyToMany(mappedBy="customers", targetEntity=Owner.class)
	private List<Owner> owners = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="owner_id", referencedColumnName = "id")
	private Owner owner;
	
}
