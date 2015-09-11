package cn.dbke.infoManager.mapper;

import cn.dbke.infoManager.po.ItemsCustom;
import cn.dbke.infoManager.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by lpd on 2015/9/11.
 */
public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsByname(ItemsQueryVo itemsQueryVo)throws Exception;
}
