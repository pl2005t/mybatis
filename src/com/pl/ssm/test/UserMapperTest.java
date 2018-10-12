package com.pl.ssm.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pl.ssm.mapper.OrdersMapperCustom;
import com.pl.ssm.mapper.UserMapper;
import com.pl.ssm.pojo.Orders;
import com.pl.ssm.pojo.OrdersCustom;
import com.pl.ssm.pojo.User;
import com.pl.ssm.pojo.UserCustom;
import com.pl.ssm.pojo.UserQueryVo;

public class UserMapperTest {

	public static SqlSessionFactory sqlSessionFactory;

	public static void main(String[] args) throws Exception {

		UserMapperTest userMapperTest = new UserMapperTest();
		userMapperTest.setUp();
		// userMapperTest.testFindUserById(1);
		// userMapperTest.testFindUserByName("a");
		//userMapperTest.testFindUserList();
		//userMapperTest.testFindUserCount();
		//userMapperTest.testFindUserByIdResultMap(1);
		//userMapperTest.testFindOrdersUser();
		//userMapperTest.testFindOrdersUserResultMap();
		//userMapperTest.testFindOrdersAndOrdersDetailResultMap();
		//userMapperTest.testFindUserAndItemsResultMap();
		userMapperTest.testFindOrdersUserlazyLoading();
	}

	public void setUp() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public User testFindUserById(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 调用UserMapper的方法
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(id);
		sqlSession.close();
		System.out.println(user);
		return user;
	}

	public User testFindUserByIdResultMap(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 调用UserMapper的方法
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserByIdResultMap(id);
		sqlSession.close();
		System.out.println(user);
		return user;
	}

	
	public void testFindUserByName(String name) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 调用UserMapper的方法
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> users = userMapper.findUserByName(name);
		sqlSession.close();
		for (User user : users) {
			System.out.println(user);
		}
	}

	public void testFindUserList() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 调用UserMapper的方法
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		//userCustom.setSex("male");
		
		userCustom.setName("y");
		//传入多个id
		List<Integer> cids=new ArrayList<Integer>();
		cids.add(2);
		cids.add(5);
		cids.add(9);
		userQueryVo.setUserCustom(userCustom);
		//将cids传入statement
		userQueryVo.setCids(cids);
		List<UserCustom> list = userMapper.findUserList(userQueryVo);
		sqlSession.close();
		for (UserCustom userCustom2 : list) {
			System.out.println(userCustom2);
		}
	}
	
	public void testFindUserCount() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 调用UserMapper的方法
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("male");
		userCustom.setName("a");
		userQueryVo.setUserCustom(userCustom);
		int count=userMapper.findUserCount(userQueryVo);
		
		sqlSession.close();
		System.out.println(count);
	}
	
	public void testFindOrdersUser() throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
		//调用mapper方法
		List<OrdersCustom> list=ordersMapperCustom.findOrdersUser();
		System.out.println(list);
		sqlSession.close();
	}
	
	public void testFindOrdersUserResultMap() throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
		//调用mapper方法
		List<Orders> list=ordersMapperCustom.findOrdersUserResultMap();
		System.out.println(list);
		sqlSession.close();
	}
	
	public void testFindOrdersAndOrdersDetailResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
		//调用mapper方法
		List<Orders> list=ordersMapperCustom.findOrdersAndOrdersDetailResultMap();
		System.out.println(list);
		sqlSession.close();
	}
	
	public void testFindUserAndItemsResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
		//调用mapper方法
		List<User> list=ordersMapperCustom.findUserAndItemsResultMap();
		System.out.println(list);
		sqlSession.close();
	}
	
	//延迟加载
	public void testFindOrdersUserlazyLoading() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom=sqlSession.getMapper(OrdersMapperCustom.class);
		//调用mapper方法
		List<Orders> list=ordersMapperCustom.findOrdersUserlazyLoading();
		for (Orders orders : list) {
			//实现按需加载
			User user=orders.getUser();
			System.out.println(user);
		}	
		sqlSession.close();
	}
}
