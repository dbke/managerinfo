package cn.dbke.info.dal;

import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/14.
 */
public abstract class BaseDAO {

    @Resource
    private SqlSessionFactory sqlSessionFactory;



}
