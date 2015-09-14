package cn.dbke.info.service.impl;

import cn.dbke.info.dao.ItemsMapperCustom;
import cn.dbke.info.domain.ItemsCustom;
import cn.dbke.info.domain.ItemsQueryVo;
import cn.dbke.info.service.ItemsService;
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
