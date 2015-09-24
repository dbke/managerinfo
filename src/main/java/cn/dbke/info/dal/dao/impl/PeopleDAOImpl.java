package cn.dbke.info.dal.dao.impl;

import cn.dbke.info.dal.dao.PeopleDAO;
import cn.dbke.info.dal.dbobject.PeopleDO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by liyangtao on 15/9/14.
 */
@Repository
public class PeopleDAOImpl extends SqlSessionDaoSupport implements PeopleDAO,InitializingBean{

    private Logger logger = LoggerFactory.getLogger(PeopleDAOImpl.class);

    private static String NAME_SPACE = "PeopleDAO.";


    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void insert(PeopleDO people) {
        getSqlSession().insert("cn.dbke.info.dal.dao.PeopleDAO.insertPeople", people);
    }

}
