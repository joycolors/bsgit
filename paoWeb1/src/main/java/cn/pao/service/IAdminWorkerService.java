package cn.pao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.pao.mapper.TWorkerMapper;
import cn.pao.pojo.TWorker;
import cn.pao.pojo.TWorker;
import cn.pao.util.PageBean;

public interface IAdminWorkerService {

	//查询用户列表
	public PageBean<TWorker> findWorkerList(int page) throws Exception;
	
	//删除用户
	public void delWorkerById(int id) throws Exception;
	
	//批量删除用户
	public void batchDelWorkerById(String[] ids) throws Exception;
	
	//模糊查询用户
	public PageBean<TWorker> searchWorker(int page, String workerName) throws Exception;
	
	//注册用户
	public void regist(TWorker worker) throws Exception;


} 
