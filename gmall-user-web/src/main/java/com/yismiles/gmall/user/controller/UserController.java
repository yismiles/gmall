package com.yismiles.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yismiles.gmall.bean.UmsMember;
import com.yismiles.gmall.bean.UmsMemberReceiveAddress;
import com.yismiles.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：ZHANGSHUAI
 * @date ：Created in 2020-03-21 19:07
 * @description：用户controller
 * @modified By：
 * @version: $
 */
@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "你好啊";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
      List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getAllUserBerReceive")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAllUserBerReceive(String memberId){
        List<UmsMember> umsMembers = userService.getAllUser();
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=userService.getAllUserBerReceive(memberId);
        return umsMemberReceiveAddressList;
    }
}
