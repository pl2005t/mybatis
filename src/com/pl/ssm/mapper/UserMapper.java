package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.User;

public interface UserMapper {
//	public User findUserById();
	
	//根据id查询用户
	public User findUserById(int cid);
	public void insertUser(User user);
	public void deleteUser(int id);
	public List<User> findUserByName(String name);
}
