package cn.dbke.infoManager.service;

import cn.dbke.infoManager.po.ItemsCustom;
import cn.dbke.infoManager.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by lpd on 2015/9/10.
 */
public interface ItemsService {
    //根据物品名称模糊查询
    public List<ItemsCustom> findItemsByname(ItemsQueryVo itemsQueryVo)throws Exception;
}

