package com.bb.mo.server.storage.mysql;

import com.bb.mo.server.common.MysqlPage;
import com.bb.mo.server.domain.po.Group;
import com.bb.mo.server.domain.po.GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {
    long countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);

    List<Group> selectByExampleWithPage(@Param("mysqlPage")MysqlPage mysqlPage, @Param("example")GroupExample example);

}