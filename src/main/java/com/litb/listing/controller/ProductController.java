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
        l.add("商品名称，hadoop");
        l.add("商品描述，hbase");
        l.add("哈喽，hive");
        l.add("哈喽，pig");
        l.add("哈喽，zookeeper");
        l.add("哈喽，三劫散仙");
        //将数据存放map里面，可以直接在velocity页面，使用key访问
        model.put("data",l);
        return "index";

    }
}
