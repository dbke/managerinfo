package cn.dbke.info.dal.dao.impl;

import cn.dbke.info.dal.dao.PeopleDAO;
import cn.dbke.info.dal.dbobject.PeopleDO;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/14.
 */
public class PeopleDAOImpl implements PeopleDAO{

    private static String NAME_SPACE = "PeopleDAO.";

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public int insert(PeopleDO people) {
        return 0;
    }
}
