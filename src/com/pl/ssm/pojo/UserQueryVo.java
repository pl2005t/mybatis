package com.pl.ssm.pojo;

import java.util.List;

//��װ����
public class UserQueryVo {
	//������id
	private List<Integer> cids;
	//��װ����Ҫ�Ĳ�ѯ����
	
	

	//�û���ѯ����
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
	
	//���԰�װ�����Ĳ�ѯ����������/��Ʒ��
}
