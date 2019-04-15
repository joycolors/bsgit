package cn.pao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pao.mapper.TUserMapper;
import cn.pao.mapper.TWorkerMapper;
import cn.pao.pojo.TUser;
import cn.pao.pojo.TWorker;
import cn.pao.service.IUserService;
import cn.pao.service.IWorkerService;

@Service("userService")
public class WorkerServiceImpl implements IWorkerService{

	private TWorkerMapper workerMapper;

	public TWorkerMapper getWorkerMapper() {
		return workerMapper;
	}

	@Autowired
	public void setWorkerMapper(TWorkerMapper workerMapper) {
		this.workerMapper = workerMapper;
	}
	
/*	@Override
	public List<TUser> loadUsers(){
		return userMapper.queryAll();
	}*/

	public Integer rigist(TWorker worker) throws Exception {
		
		return workerMapper.insert(worker);
	}

	public TWorker findByWorkername(String workername) throws Exception {
		// TODO Auto-generated method stub
		return workerMapper.findByWorkername(workername);
	}

	public TWorker login(TWorker w) throws Exception {
		// TODO Auto-generated method stub
		return workerMapper.login(w);
	}

	public void updateLoginTime(TWorker w) throws Exception {
		// TODO Auto-generated method stub
		workerMapper.updateLoginTime(w);
		
	}
}
