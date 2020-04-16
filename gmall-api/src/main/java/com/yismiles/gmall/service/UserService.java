package com.yismiles.gmall.service;

import com.yismiles.gmall.bean.UmsMember;
import com.yismiles.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author ：ZHANGSHUAI
 * @date ：Created in 2020-03-21 19:07
 * @description：用户UserService
 * @modified By：
 * @version: $
 */
public interface UserService {


    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getAllUserBerReceive(String memberId);
}
