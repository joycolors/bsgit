package cn.pao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.pao.mapper.TUserMapper;
import cn.pao.pojo.TUser;
import cn.pao.pojo.TWorker;

public interface IWorkerService {

	public void updateLoginTime(TWorker w) throws Exception;

	public TWorker login(TWorker w) throws Exception;
	
	public TWorker findByWorkername(String workername) throws Exception;
	
	public Integer rigist(TWorker worker)  throws Exception;

} 
