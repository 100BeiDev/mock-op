package com.bb.mo.server.common;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *     通用分页请求
 * </p>
 *
 * @author zhangyue
 * @date 2017/4/18
 */
@Data
public class PageRequest implements Serializable{
    private Integer pageSize = 10;

    private Integer currentPage;

}
