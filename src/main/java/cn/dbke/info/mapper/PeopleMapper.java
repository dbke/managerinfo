package cn.dbke.info.mapper;

import cn.dbke.info.po.People;
import cn.dbke.info.po.PeopleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeopleMapper {
    int countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(String peopleId);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(String peopleId);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}