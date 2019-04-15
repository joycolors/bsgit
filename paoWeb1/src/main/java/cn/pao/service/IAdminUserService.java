package cn.pao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.pao.mapper.TUserMapper;
import cn.pao.pojo.TUser;
import cn.pao.util.PageBean;

public interface IAdminUserService {

	//��ѯ�û��б�
	public PageBean<TUser> findUserList(int page) throws Exception;
	
	//ɾ���û�
	public void delUserById(int id) throws Exception;
	
	//����ɾ���û�
	public void batchDelUserById(String[] ids) throws Exception;
	
	//ģ����ѯ�û�
	public PageBean<TUser> searchUser(int page, String userName) throws Exception;


} 
