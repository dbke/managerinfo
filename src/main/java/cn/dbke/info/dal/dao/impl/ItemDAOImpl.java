package cn.dbke.info.dal.dao.impl;

import cn.dbke.info.dal.dao.ItemDAO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liyangtao on 15/9/14.
 */
public class ItemDAOImpl implements ItemDAO{

    @Autowired
    private SqlSessionFactory sqlSessionFactory;


    public Boolean insertDO(){
        return null;
    }

}
