package cn.dbke.info.mapper;

import cn.dbke.info.po.ItemsCustom;
import cn.dbke.info.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by lpd on 2015/9/11.
 */
public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsByname(ItemsQueryVo itemsQueryVo)throws Exception;
}
