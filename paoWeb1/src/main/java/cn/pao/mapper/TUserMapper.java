package cn.pao.mapper;

import cn.pao.pojo.TUser;
import cn.pao.pojo.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    //分页查询
    public List<TUser> queryByPage(@Param("begin")int begin, @Param("limit")int limit);
    
    //查询全部
    public List<TUser> queryAll();
    
  //娣诲姞鐢ㄦ埛  
  	public Integer regist(TUser user) throws Exception;
  	
  	//鏌ヨ鐢ㄦ埛
  	public TUser findByUsername(String username) throws Exception;
  	
  	//鐧诲綍
  	public TUser login(TUser u) throws Exception;
  	
  	//鏇存柊鐢ㄦ埛鐧诲綍鏃堕棿
  	public void updateLoginTime(TUser u) throws Exception;
  	
  	//模糊查询
  	public List<TUser> fuzzyQueryAll(String userName) throws Exception;
  	
  	//分页模糊查询
  	public List<TUser> fuzzyQueryByPage(@Param("begin")int begin,@Param("limit")int limit, @Param("userName")String userName) throws Exception;
  	
}