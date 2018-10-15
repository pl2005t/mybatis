package com.pl.ssm.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.pl.ssm.dao.UserDao;
import com.pl.ssm.dao.UserDaoImpl;
import com.pl.ssm.mapper.OrdersMapperCustom;
import com.pl.ssm.pojo.User;

public class UserDaoImplTest {

/*	public static void main(String[] args) throws IOException  {
		UserMapper userMapper=new UserMapperImpl();
		User user=userMapper.findUserById();
		System.out.println(user);
	}*/
	
	public static void main(String[] args) throws IOException {
		
		try {
		UserDao	userDao = new UserDaoImpl();
			User user=userDao.findUserById(1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
