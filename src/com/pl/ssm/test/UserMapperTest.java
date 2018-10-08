package com.pl.ssm.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pl.ssm.mapper.UserMapper;
import com.pl.ssm.pojo.User;

public class UserMapperTest {
	
	public static SqlSessionFactory sqlSessionFactory;
	public static void main(String[] args) throws IOException {
		
		UserMapperTest userMapperTest=new UserMapperTest();
		userMapperTest.setUp();
		userMapperTest.testFindUserById(1);
		
		//userMapperTest.testFindUserByName("a");
	}
	
	public  void setUp() throws IOException {
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
	 sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public User testFindUserById(int id) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//调用UserMapper的方法
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		User user=userMapper.findUserById(id);
		sqlSession.close();
		System.out.println(user);
		return user;
	}
	
	public void testFindUserByName(String name) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//调用UserMapper的方法
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<User> users=userMapper.findUserByName(name);
		sqlSession.close();
		for (User user : users) {
			System.out.println(user);
		}
	} 
}
