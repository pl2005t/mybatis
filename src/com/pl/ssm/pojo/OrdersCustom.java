package com.pl.ssm.pojo;
/**
 * ͨ������ӳ�䶩�����û���ѯ�Ľ�����ô���̳а����ֶν϶��pojo��
 * select orders.*,carddb.name,carddb.sex,carddb.cardDate from orders,carddb where orders.user_cid=carddb.cid;
 * @author 11
 *
 */
//
public class OrdersCustom extends Orders{
	private String name;
	private String sex;
	private String cardDate;
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
	public String getCardDate() {
		return cardDate;
	}
	public void setCardDate(String cardDate) {
		this.cardDate = cardDate;
	}
	
}
