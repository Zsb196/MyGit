package com.aaa.dao;


import com.aaa.entity.studen;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// 获取SPRINGCLOUD-PORDUCT服务下得
@FeignClient(value = "springcloud-porduct"/*,fallback = PorductUserServiceImpl.class*/)
public interface PorductUserService {

    // 映射生产者对应得方法请求路径
    @RequestMapping("/user/getUser")
    String getUser();
    // 路径和生产者得请求路径一直，参数名和生产者参数名一致

    @RequestMapping("/user/listAll")
    List<studen> listAll();

    @RequestMapping("user/del")
    int del(Integer sid);

    @RequestMapping("user/add")
    int add(studen studen);
}
