package com.bb.mo.server.storage.mysql;

import com.bb.mo.server.common.MysqlPage;
import com.bb.mo.server.domain.po.App;
import com.bb.mo.server.domain.po.AppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMapper {
    long countByExample(AppExample example);

    int deleteByExample(AppExample example);

    int deleteByPrimaryKey(Integer appId);

    int insert(App record);

    int insertSelective(App record);

    List<App> selectByExample(AppExample example);

    App selectByPrimaryKey(Integer appId);

    int updateByExampleSelective(@Param("record") App record, @Param("example") AppExample example);

    int updateByExample(@Param("record") App record, @Param("example") AppExample example);

    int updateByPrimaryKeySelective(App record);

    int updateByPrimaryKey(App record);


    List<App> selectByExampleWithPage(@Param("mysqlPage")MysqlPage mysqlPage, @Param("example")AppExample example);
}