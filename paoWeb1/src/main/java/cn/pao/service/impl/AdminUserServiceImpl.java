package cn.pao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pao.mapper.TUserMapper;
import cn.pao.pojo.TUser;
import cn.pao.service.IAdminUserService;
import cn.pao.service.IUserService;
import cn.pao.util.PageBean;

@Service("AdminUserService")
public class AdminUserServiceImpl implements IAdminUserService{

	private TUserMapper userMapper;

	public TUserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(TUserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public PageBean<TUser> findUserList(int page) throws Exception {
		// TODO Auto-generated method stub
		PageBean pageBean = new PageBean();
		//ÿҳ��ʾ��¼��
		int limit = 4;
		pageBean.setLimit(limit);
		//��ǰҳ
		pageBean.setPage(page);
		int begin = (page-1)*limit;
		List<TUser> userList = userMapper.queryByPage(begin, limit);
		//�����û�����
		pageBean.setList(userList);
		int totalCount = userMapper.queryAll().size();  
		//�ܼ�¼��
		pageBean.setTotalCount(totalCount);
		//������ҳ��
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
	public void delUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelUserById(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0; i<ids.length; i++) {
			int id = Integer.parseInt(ids[i]);
			userMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageBean<TUser> searchUser(int page, String userName) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("page=" + page + "----" + "userName=" + userName);
		PageBean pageBean = new PageBean();
		//ÿҳ��ʾ��¼��
		int limit = 4;
		pageBean.setLimit(limit);
		//��ǰҳ
		pageBean.setPage(page);
		int begin = (page-1)*limit;
		List<TUser> userList = userMapper.fuzzyQueryByPage(begin, limit, userName);
		//�����û�����
		pageBean.setList(userList);
		int totalCount = userMapper.fuzzyQueryAll(userName).size();  
		//�ܼ�¼��
		pageBean.setTotalCount(totalCount);
		//������ҳ��
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
		pageBean.setFlag(userName);
		return pageBean;
	}
	

}
