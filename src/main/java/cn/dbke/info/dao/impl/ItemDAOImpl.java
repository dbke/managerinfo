package cn.dbke.info.dao.impl;

import cn.dbke.info.dao.ItemDAO;
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
