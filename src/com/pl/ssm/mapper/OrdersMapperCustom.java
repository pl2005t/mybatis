package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.Orders;
import com.pl.ssm.pojo.OrdersCustom;

public interface OrdersMapperCustom {
	//��ѯ����������ѯ�û�
	public List<OrdersCustom> findOrdersUser() throws Exception;
	//��ѯ����������ѯ�û�ʹ��resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
}
