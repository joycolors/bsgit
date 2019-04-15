package cn.pao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pao.mapper.TUserMapper;
import cn.pao.pojo.TUser;
import cn.pao.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	private TUserMapper userMapper;

	public TUserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(TUserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
/*	@Override
	public List<TUser> loadUsers(){
		return userMapper.queryAll();
	}*/

	public Integer rigist(TUser user) throws Exception {
		
		return userMapper.regist(user);
	}

	public TUser findByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.findByUsername(username);
	}

	public TUser login(TUser u) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.login(u);
	}

	public void updateLoginTime(TUser u) throws Exception {
		// TODO Auto-generated method stub
		userMapper.updateLoginTime(u);
		
	}
}
