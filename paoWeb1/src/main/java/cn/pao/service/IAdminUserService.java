package cn.pao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.pao.mapper.TUserMapper;
import cn.pao.pojo.TUser;
import cn.pao.util.PageBean;

public interface IAdminUserService {

	//查询用户列表
	public PageBean<TUser> findUserList(int page) throws Exception;
	
	//删除用户
	public void delUserById(int id) throws Exception;
	
	//批量删除用户
	public void batchDelUserById(String[] ids) throws Exception;
	
	//模糊查询用户
	public PageBean<TUser> searchUser(int page, String userName) throws Exception;


} 
