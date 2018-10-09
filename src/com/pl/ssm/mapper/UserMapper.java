package com.pl.ssm.mapper;

import java.util.List;

import com.pl.ssm.pojo.User;
import com.pl.ssm.pojo.UserCustom;
import com.pl.ssm.pojo.UserQueryVo;

public interface UserMapper {
//	public User findUserById();
	
	//根据id查询用户
	public User findUserById(int cid);
	public void insertUser(User user);
	public void deleteUser(int id);
	public List<User> findUserByName(String name);
	
	public List<UserCustom> findUserList(UserQueryVo userQueryVo);
	public int findUserCount(UserQueryVo userQueryVo) ;
	public User findUserByIdResultMap(int cid);
}
