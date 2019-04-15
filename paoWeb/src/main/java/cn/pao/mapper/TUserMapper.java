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
    
    //自己加的
    List<TUser> queryAll();
    
  //添加用户
  	public Integer regist(TUser user) throws Exception;
  	
  	//查询用户
  	public TUser findByUsername(String username) throws Exception;
  	
  	//登录
  	public TUser login(TUser u) throws Exception;
  	
  	//更新用户登录时间
  	public void updateLoginTime(TUser u) throws Exception;
}