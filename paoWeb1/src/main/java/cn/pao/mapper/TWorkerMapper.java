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
    
  //鏌ヨ鐢ㄦ埛
  	public TWorker findByWorkername(String workername) throws Exception;
  	
  	//鐧诲綍
  	public TWorker login(TWorker w) throws Exception;
  	
  	//鏇存柊鐢ㄦ埛鐧诲綍鏃堕棿
  	public void updateLoginTime(TWorker w) throws Exception;
  	
  	//分页查询
    public List<TWorker> queryByPage(@Param("begin")int begin, @Param("limit")int limit);
    
    //查询全部
    public List<TWorker> queryAll();
    
  //模糊查询
  	public List<TWorker> fuzzyQueryAll(String workerName) throws Exception;
  	
  	//分页模糊查询
  	public List<TWorker> fuzzyQueryByPage(@Param("begin")int begin,@Param("limit")int limit, @Param("workerName")String workerName) throws Exception;
}