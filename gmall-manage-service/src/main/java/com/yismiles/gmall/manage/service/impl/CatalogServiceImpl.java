package com.yismiles.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yismiles.gmall.bean.PmsBaseCatalog1;
import com.yismiles.gmall.manage.mapper.PmsCatalog1Mapper;
import com.yismiles.gmall.manage.mapper.PmsCatalog2Mapper;
import com.yismiles.gmall.manage.mapper.PmsCatalog3Mapper;
import com.yismiles.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：ZHANGSHUAI
 * @date ：Created in 2020-04-16 22:37
 * @description：分类
 * @modified By：
 * @version: $
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsCatalog1Mapper pmsCatalog1Mapper;
    @Autowired
    private PmsCatalog2Mapper pmsCatalog2Mapper;
    @Autowired
    private PmsCatalog3Mapper pmsCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {

        return pmsCatalog1Mapper.selectAll();
    }
}
