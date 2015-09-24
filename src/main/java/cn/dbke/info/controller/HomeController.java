package cn.dbke.info.controller;

import cn.dbke.info.dal.dao.PeopleDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/16.
 */
@Controller
@RequestMapping("/home")
public class HomeController implements InitializingBean{


    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Resource
    private PeopleDAO peopleDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        logger.warn("get a request");
        return "hello";
    }

    public void afterPropertiesSet() throws Exception {
        logger.warn("init homeController");
    }
}
