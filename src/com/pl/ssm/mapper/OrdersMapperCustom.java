package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.Orders;
import com.pl.ssm.pojo.OrdersCustom;
import com.pl.ssm.pojo.User;

public interface OrdersMapperCustom {
	//��ѯ����������ѯ�û�
	public List<OrdersCustom> findOrdersUser() throws Exception;
	//��ѯ����������ѯ�û�ʹ��resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
	//��ѯ�����Ͷ�����ϸ
	public List<Orders> findOrdersAndOrdersDetailResultMap() throws Exception;
	//��ѯ�û��������Ʒ��Ϣ
	public List<User> findUserAndItemsResultMap() throws Exception;
	//��ѯ����������ѯ�û����û���Ϣ�ӳټ���
	public List<Orders> findOrdersUserlazyLoading();
}
