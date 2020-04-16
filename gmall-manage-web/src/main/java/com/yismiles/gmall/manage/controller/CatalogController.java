package com.yismiles.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yismiles.gmall.bean.PmsBaseCatalog1;
import com.yismiles.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @author ：ZHANGSHUAI
 * @date ：Created in 2020-04-11 22:35
 * @description：分类
 * @modified By：
 * @version: $
 */
@Controller
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){

        return catalogService.getCatalog1();
    }
}
