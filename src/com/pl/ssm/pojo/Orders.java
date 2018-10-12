package com.pl.ssm.pojo;

import java.sql.Date;
import java.util.List;

public class Orders {
	private Integer id;
	private Integer userCid;
	private String number;
	private Date createtime;
	private String note;
	private User user;
	private List<OrdersDetail> ordersDetails;
	
	public List<OrdersDetail> getOrdersDetails() {
		return ordersDetails;
	}
	public void setOrdersDetails(List<OrdersDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserCid() {
		return userCid;
	}
	public void setUserCid(Integer userCid) {
		this.userCid = userCid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
