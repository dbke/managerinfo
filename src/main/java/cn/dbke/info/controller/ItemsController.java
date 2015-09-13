package cn.dbke.info.controller;

import cn.dbke.info.po.ItemsCustom;
import cn.dbke.info.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lpd on 2015/9/11.
 */
@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;//service对象

    public ModelAndView queryItems()throws Exception{
        // 调用service查询数据库，得到列表
        List<ItemsCustom> list=itemsService.findItemsByname(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);// 将数据放入模型
        modelAndView.setViewName("queryItems");
        return modelAndView;
    }
}