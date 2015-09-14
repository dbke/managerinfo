package cn.dbke.info.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lpd on 2015/9/11.
 */
@Controller
public class ItemsController implements InitializingBean{

    private Logger logger = LoggerFactory.getLogger(ItemsController.class);

    public void afterPropertiesSet() throws Exception {
        logger.warn("========================================>controller");
    }

    public ModelAndView queryItems()throws Exception{
        // 调用service查询数据库，得到列表
        /*List<ItemsCustom> list=itemsService.findItemsByname(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);// 将数据放入模型
        modelAndView.setViewName("queryItems");
        return modelAndView;*/
        return null;
    }
}
