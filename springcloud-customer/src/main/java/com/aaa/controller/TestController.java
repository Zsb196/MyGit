package com.aaa.controller;

import com.aaa.dao.PorductUserService;
import com.aaa.entity.studen;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "customer",produces = "application/json;charset=UTF-8")
public class TestController {

    @Resource
    PorductUserService porductUserService;

    @RequestMapping("test")
    public String test(){
        return porductUserService.getUser();
    }

    @RequestMapping("listAll")
    public List<studen> listAll(){
        List<studen>listAll = porductUserService.listAll();
        return listAll;
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(String sid){
        System.out.println(sid);
        Integer sid1 = Integer.parseInt(sid);
        int count = porductUserService.del(sid1);
        System.out.println("sid="+sid);
        if(count==1){
            return 1;
        }else{
            return 0;
        }
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(@RequestBody studen studen){
        System.out.println("add===="+studen);
        int count = porductUserService.add(studen);
        System.out.println("count====="+count);
        if(count==1){
            return 1;
        }else{
            return 0;
        }
    }

}
