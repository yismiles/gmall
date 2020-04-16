package com.yismiles.gmall.user.mapper;

import com.yismiles.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author ：ZHANGSHUAI
 * @date ：Created in 2020-03-21 19:09
 * @description：用户mapper
 * @modified By：
 * @version: $
 */
public interface UserMapper extends Mapper<UmsMember> {

//    List<UserMapper>
    List<UmsMember> selectAllUser();
}
