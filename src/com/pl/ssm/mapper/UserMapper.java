package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.User;

public interface UserMapper {
//	public User findUserById();
	
	//����id��ѯ�û�
	public User findUserById(int cid);
	public void insertUser(User user);
	public void deleteUser(int id);
	public List<User> findUserByName(String name);
}
