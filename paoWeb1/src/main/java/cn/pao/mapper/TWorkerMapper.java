package cn.pao.mapper;

import cn.pao.pojo.TUser;
import cn.pao.pojo.TWorker;
import cn.pao.pojo.TWorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWorkerMapper {
    int countByExample(TWorkerExample example);

    int deleteByExample(TWorkerExample example);

    int deleteByPrimaryKey(Integer workerId);

    int insert(TWorker record);

    int insertSelective(TWorker record);

    List<TWorker> selectByExample(TWorkerExample example);

    TWorker selectByPrimaryKey(Integer workerId);

    int updateByExampleSelective(@Param("record") TWorker record, @Param("example") TWorkerExample example);

    int updateByExample(@Param("record") TWorker record, @Param("example") TWorkerExample example);

    int updateByPrimaryKeySelective(TWorker record);

    int updateByPrimaryKey(TWorker record);
    
  //查询用户
  	public TWorker findByWorkername(String workername) throws Exception;
  	
  	//登录
  	public TWorker login(TWorker w) throws Exception;
  	
  	//更新用户登录时间
  	public void updateLoginTime(TWorker w) throws Exception;
  	
  	//��ҳ��ѯ
    public List<TWorker> queryByPage(@Param("begin")int begin, @Param("limit")int limit);
    
    //��ѯȫ��
    public List<TWorker> queryAll();
    
  //ģ����ѯ
  	public List<TWorker> fuzzyQueryAll(String workerName) throws Exception;
  	
  	//��ҳģ����ѯ
  	public List<TWorker> fuzzyQueryByPage(@Param("begin")int begin,@Param("limit")int limit, @Param("workerName")String workerName) throws Exception;
}