package com.litb.listing.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by pengbo on 16/9/8.
 */
@Controller
@RequestMapping("pro")
public class ProductController {


    @RequestMapping("index")
    String index(Map<String, Object> model){
        List<String> l= new LinkedList<String>();
        l.add("商品名称，testProduct");
        l.add("商品描述，testDescription");
        l.add("商品价格，3.2");
        l.add("交期，3");
        l.add("其他，others");
        l.add("分类，Shoes");
        //将数据存放map里面，可以直接在velocity页面，使用key访问
        model.put("data",l);
        return "index";

    }
}
