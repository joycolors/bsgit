package cn.pao.mapper;

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
}