package com.yismiles.gmall.user.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.yismiles.gmall.bean.UmsMember;
import com.yismiles.gmall.bean.UmsMemberReceiveAddress;
import com.yismiles.gmall.service.UserService;
import com.yismiles.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.yismiles.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//import org.springframework.stereotype.Service;

/**
 * @author ：ZHANGSHUAI
 * @date ：Created in 2020-03-21 19:08
 * @description：用户UserServiceImpl
 * @modified By：
 * @version: $
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
//        List<UmsMapper> umsMappers = userMapper.selectAllUser();
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllUserBerReceive(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
