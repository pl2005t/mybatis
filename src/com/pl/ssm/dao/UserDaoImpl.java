package com.pl.ssm.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pl.ssm.pojo.User;
import com.pl.ssm.test.UserDaoImplTest;

public class UserDaoImpl implements UserDao{

	SqlSession sqlSession;
	public UserDaoImpl() throws IOException {
		String resource="SqlMapConfig.xml";
		//InputStream inputStream=MybatisTest.class.getClassLoader().getResourceAsStream(resource);
		InputStream inputStream=Resources.getResourceAsStream(UserDaoImplTest.class.getClassLoader(), resource);
		
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession=sqlSessionFactory.openSession();
	}
	@Override
	public User findUserById(int id) {
		String statement="test.findUserById";
		User user=sqlSession.selectOne(statement,id);
		//System.out.println(user);
		sqlSession.close();
		return user;
	}

}
