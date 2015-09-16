package cn.dbke.info.dal.dao.impl;

import cn.dbke.info.dal.dao.PeopleDAO;
import cn.dbke.info.dal.dbobject.PeopleDO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/14.
 */
public class PeopleDAOImpl implements PeopleDAO,InitializingBean{

    private Logger logger = LoggerFactory.getLogger(PeopleDAOImpl.class);

    private static String NAME_SPACE = "PeopleDAO.";

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public void insert(PeopleDO people) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            sqlSession.insert("cn.dbke.info.dal.dao.PeopleDAO.insertPeople",people);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }

    }

    public void afterPropertiesSet() throws Exception {
        logger.warn("init PeopleDAOImpl bean");
    }
}
