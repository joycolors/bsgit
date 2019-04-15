package cn.pao.mapper;

import cn.pao.pojo.TUserAddress;
import cn.pao.pojo.TUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserAddressMapper {
    int countByExample(TUserAddressExample example);

    int deleteByExample(TUserAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(TUserAddress record);

    int insertSelective(TUserAddress record);

    List<TUserAddress> selectByExample(TUserAddressExample example);

    TUserAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") TUserAddress record, @Param("example") TUserAddressExample example);

    int updateByExample(@Param("record") TUserAddress record, @Param("example") TUserAddressExample example);

    int updateByPrimaryKeySelective(TUserAddress record);

    int updateByPrimaryKey(TUserAddress record);
}