package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.Orders;
import com.pl.ssm.pojo.OrdersCustom;

public interface OrdersMapperCustom {
	//查询订单关联查询用户
	public List<OrdersCustom> findOrdersUser() throws Exception;
	//查询订单关联查询用户使用resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
}
