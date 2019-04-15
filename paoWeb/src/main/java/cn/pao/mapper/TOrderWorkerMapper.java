package cn.pao.mapper;

import cn.pao.pojo.TOrderWorker;
import cn.pao.pojo.TOrderWorkerExample;
import cn.pao.pojo.TOrderWorkerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderWorkerMapper {
    int countByExample(TOrderWorkerExample example);

    int deleteByExample(TOrderWorkerExample example);

    int deleteByPrimaryKey(TOrderWorkerKey key);

    int insert(TOrderWorker record);

    int insertSelective(TOrderWorker record);

    List<TOrderWorker> selectByExample(TOrderWorkerExample example);

    TOrderWorker selectByPrimaryKey(TOrderWorkerKey key);

    int updateByExampleSelective(@Param("record") TOrderWorker record, @Param("example") TOrderWorkerExample example);

    int updateByExample(@Param("record") TOrderWorker record, @Param("example") TOrderWorkerExample example);

    int updateByPrimaryKeySelective(TOrderWorker record);

    int updateByPrimaryKey(TOrderWorker record);
}