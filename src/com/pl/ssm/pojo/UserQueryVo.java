package com.pl.ssm.pojo;

import java.util.List;

//包装类型
public class UserQueryVo {
	//传入多个id
	private List<Integer> cids;
	//包装所需要的查询条件
	
	

	//用户查询条件
	private UserCustom userCustom;

	public List<Integer> getCids() {
		return cids;
	}

	public void setCids(List<Integer> cids) {
		this.cids = cids;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
	//可以包装其他的查询条件，订单/商品等
}
