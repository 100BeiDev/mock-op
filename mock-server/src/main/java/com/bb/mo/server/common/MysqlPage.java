package com.bb.mo.server.common;

import lombok.Data;

/**
 * Created by l_yy on 2017/6/14.
 */
@Data
public class MysqlPage {

    private int start;

    private int offset;


    public static MysqlPage createBy(PageRequest pageRequest) {
        MysqlPage p = new MysqlPage();
        p.setStart((pageRequest.getCurrentPage() - 1) * pageRequest.getPageSize());
        p.setOffset(pageRequest.getPageSize());
        return p;
    }

}
