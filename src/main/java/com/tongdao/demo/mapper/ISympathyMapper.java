package com.tongdao.demo.mapper;

import com.tongdao.demo.entity.dto.SympathyDto;
import com.tongdao.demo.entity.query.SympathyQuery;
import com.tongdao.demo.entity.vo.SympathyVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 2019/8/17 8:12
 * @Description:
 */
@Mapper
public interface ISympathyMapper {

    String INSERT = "user_id,content,create_time";
    String INSERT_PROPERTY = "#{userId},#{content},now()";

    @Insert("insert into sympathy_records (" + INSERT + ") value(" + INSERT_PROPERTY + ")" )
    int insertSympathyMapper(SympathyDto sympathyRecords);

    List<SympathyVo> listSympathy(SympathyQuery sympathyQuery);

    int countSympathy(SympathyQuery sympathyQuery);

    int countUserRecords(@Param("userId")String userId,@Param("nowYear")String nowYear);
}
