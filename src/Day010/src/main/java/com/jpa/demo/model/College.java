package com.jpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int cid;
	private String cname;
	private String address;
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}