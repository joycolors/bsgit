package cn.pao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.pao.mapper.TUserMapper;
import cn.pao.pojo.TUser;

public interface IUserService {

	public void updateLoginTime(TUser u) throws Exception;

	public TUser login(TUser u) throws Exception;
	
	public TUser findByUsername(String username) throws Exception;
	
	public Integer rigist(TUser user)  throws Exception;

} 
