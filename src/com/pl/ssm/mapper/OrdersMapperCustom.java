package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.Orders;
import com.pl.ssm.pojo.OrdersCustom;
import com.pl.ssm.pojo.User;

public interface OrdersMapperCustom {
	//查询订单关联查询用户
	public List<OrdersCustom> findOrdersUser() throws Exception;
	//查询订单关联查询用户使用resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
	//查询订单和订单明细
	public List<Orders> findOrdersAndOrdersDetailResultMap() throws Exception;
	//查询用户购买的商品信息
	public List<User> findUserAndItemsResultMap() throws Exception;
	//查询订单关联查询用户，用户信息延迟加载
	public List<Orders> findOrdersUserlazyLoading();
}
