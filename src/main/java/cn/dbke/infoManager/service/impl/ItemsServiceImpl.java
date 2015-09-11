package cn.dbke.infoManager.service.impl;

import cn.dbke.infoManager.mapper.ItemsMapperCustom;
import cn.dbke.infoManager.po.ItemsCustom;
import cn.dbke.infoManager.po.ItemsQueryVo;
import cn.dbke.infoManager.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lpd on 2015/9/10.
 */
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;//dao对象
    public List<ItemsCustom> findItemsByname(ItemsQueryVo itemsQueryVo)throws Exception{
        //通过dao对象查询数据库
        return itemsMapperCustom.findItemsByname(itemsQueryVo); //itemsQueryVo从service传到dao
    }
}
