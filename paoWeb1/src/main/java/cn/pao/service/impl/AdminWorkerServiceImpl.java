package cn.pao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pao.mapper.TUserMapper;
import cn.pao.mapper.TWorkerMapper;
import cn.pao.pojo.TUser;
import cn.pao.pojo.TWorker;
import cn.pao.service.IAdminUserService;
import cn.pao.service.IAdminWorkerService;
import cn.pao.service.IUserService;
import cn.pao.util.PageBean;

@Service("AdminUserService")
public class AdminWorkerServiceImpl implements IAdminWorkerService{

	private TWorkerMapper workerMapper;

	public TWorkerMapper getWorkerMapper() {
		return workerMapper;
	}

	@Autowired
	public void setWorkerMapper(TWorkerMapper workerMapper) {
		this.workerMapper = workerMapper;
	}

	@Override
	public PageBean<TWorker> findWorkerList(int page) throws Exception {
		// TODO Auto-generated method stub
		PageBean pageBean = new PageBean();
		//每页显示记录数
		int limit = 4;
		pageBean.setLimit(limit);
		//当前页
		pageBean.setPage(page);
		int begin = (page-1)*limit;
		List<TWorker> workerList = workerMapper.queryByPage(begin, limit);
		//设置用户集合
		pageBean.setList(workerList);
		int totalCount = workerMapper.queryAll().size();  
		//总记录数
		pageBean.setTotalCount(totalCount);
		//设置总页数
		if(totalCount%limit == 0){
			if(totalCount == 0) {
				pageBean.setTotalPage(1);
			}else{
				pageBean.setTotalPage(totalCount/limit);
			}
		}
		else {
			pageBean.setTotalPage(totalCount/limit + 1);
		}
		return pageBean;
	}

	@Override
	public void delWorkerById(int id) throws Exception {
		// TODO Auto-generated method stub
		workerMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelWorkerById(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0; i<ids.length; i++) {
			int id = Integer.parseInt(ids[i]);
			workerMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageBean<TWorker> searchWorker(int page, String workerName) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("page=" + page + "----" + "userName=" + userName);
		PageBean pageBean = new PageBean();
		//每页显示记录数
		int limit = 4;
		pageBean.setLimit(limit);
		//当前页
		pageBean.setPage(page);
		int begin = (page-1)*limit;
		List<TWorker> userList = workerMapper.fuzzyQueryByPage(begin, limit, workerName);
		//设置用户集合
		pageBean.setList(userList);
		int totalCount = workerMapper.fuzzyQueryAll(workerName).size();  
		//总记录数
		pageBean.setTotalCount(totalCount);
		//设置总页数
		if(totalCount%limit == 0){
			if(totalCount == 0) {
				pageBean.setTotalPage(1);
			}else{
				pageBean.setTotalPage(totalCount/limit);
			}
		}
		else {
			pageBean.setTotalPage(totalCount/limit + 1);
		}
		pageBean.setFlag(workerName);
		return pageBean;
	}

	@Override
	public void regist(TWorker worker) throws Exception {
		// TODO Auto-generated method stub
		workerMapper.insert(worker);
	}
	

}
