package com.pl.ssm.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class User implements Serializable{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int cid;
	 	private String name;
	 	private String sex;
	 	private Date cardDate;
	 	 private BigDecimal deposit;
	 	 private  List<Orders> ordersList;
		public List<Orders> getOrdersList() {
			return ordersList;
		}
		public void setOrdersList(List<Orders> ordersList) {
			this.ordersList = ordersList;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public Date getCardDate() {
			return cardDate;
		}
		public void setCardDate(Date cardDate) {
			this.cardDate = cardDate;
		}
		public BigDecimal getDeposit() {
			return deposit;
		}
		public void setDeposit(BigDecimal deposit) {
			this.deposit = deposit;
		}
		@Override
		public String toString() {
			return "User [cid=" + cid + ", name=" + name + ", sex=" + sex + ", cardDate=" + cardDate + ", deposit="
					+ deposit + "]";
		}
	 	 
}
