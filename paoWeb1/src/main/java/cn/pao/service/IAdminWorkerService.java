package cn.pao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.pao.mapper.TWorkerMapper;
import cn.pao.pojo.TWorker;
import cn.pao.pojo.TWorker;
import cn.pao.util.PageBean;

public interface IAdminWorkerService {

	//��ѯ�û��б�
	public PageBean<TWorker> findWorkerList(int page) throws Exception;
	
	//ɾ���û�
	public void delWorkerById(int id) throws Exception;
	
	//����ɾ���û�
	public void batchDelWorkerById(String[] ids) throws Exception;
	
	//ģ����ѯ�û�
	public PageBean<TWorker> searchWorker(int page, String workerName) throws Exception;
	
	//ע���û�
	public void regist(TWorker worker) throws Exception;


} 
