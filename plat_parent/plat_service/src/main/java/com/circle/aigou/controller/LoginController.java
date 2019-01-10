package com.circle.aigou.controller;

import com.circle.aigou.domain.Employee;
import com.circle.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    /**
     *参数：employee
     * 返回值：登录是否成功  AjaxResult
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword()))
            return AjaxResult.me();
        return new AjaxResult(false,"用户名或者密码错误");
    }
}
