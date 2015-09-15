package com.dbke.info.dal.dao;

import cn.dbke.info.dal.dao.PeopleDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/spring/persistence.xml",
                       "classpath*:config/spring/biz-dao.xml"})
public class PeopleDAOTest {

    @Resource
    private PeopleDAO peopleDAO;

    @Test
    public void testInsertDO(){
        Assert.isTrue(peopleDAO != null);
        Assert.isTrue(true);
    }

}
