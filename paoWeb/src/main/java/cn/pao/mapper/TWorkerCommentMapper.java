package cn.pao.mapper;

import cn.pao.pojo.TWorkerComment;
import cn.pao.pojo.TWorkerCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWorkerCommentMapper {
    int countByExample(TWorkerCommentExample example);

    int deleteByExample(TWorkerCommentExample example);

    int deleteByPrimaryKey(Integer workerOrderId);

    int insert(TWorkerComment record);

    int insertSelective(TWorkerComment record);

    List<TWorkerComment> selectByExample(TWorkerCommentExample example);

    TWorkerComment selectByPrimaryKey(Integer workerOrderId);

    int updateByExampleSelective(@Param("record") TWorkerComment record, @Param("example") TWorkerCommentExample example);

    int updateByExample(@Param("record") TWorkerComment record, @Param("example") TWorkerCommentExample example);

    int updateByPrimaryKeySelective(TWorkerComment record);

    int updateByPrimaryKey(TWorkerComment record);
}