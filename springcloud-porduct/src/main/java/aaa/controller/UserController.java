package aaa.controller;

import aaa.dao.studenDao;
import aaa.entity.studen;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "user",produces = "application/json;charset=UTF-8")
public class UserController {

    @Resource
    studenDao studenDao;

    @RequestMapping("getUser")
    public String getUser(){
        return "{\"user\":{\"id\":1,\"name\":张三}}";
    }

    @RequestMapping(value = "listAll")
    @ResponseBody
    public Object listAll(){
        List<studen>listAll = studenDao.listAll();
        System.out.println("listAll:"+listAll);
        return listAll;
    }

    @RequestMapping("del")
    public int del(@RequestBody Integer sid){
        int count = studenDao.del(sid);
        if(count==1){
            return 1;
        }else{
            return 0;
        }
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(@RequestBody studen studen){
        System.out.println("走添加方法");
        int count = studenDao.add(studen);
        System.out.println("add===="+studen);
        System.out.println("count====="+count);
        if(count==1){
            return 1;
        }else{
            return 0;
        }
    }


}