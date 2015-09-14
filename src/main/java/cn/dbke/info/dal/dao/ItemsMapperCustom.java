package cn.dbke.info.dal.dao;

import cn.dbke.info.domain.ItemsCustom;
import cn.dbke.info.domain.ItemsQueryVo;

import java.util.List;

/**
 * Created by lpd on 2015/9/11.
 */
public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsByname(ItemsQueryVo itemsQueryVo)throws Exception;
}
