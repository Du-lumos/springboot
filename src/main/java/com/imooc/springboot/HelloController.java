package com.imooc.springboot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 刘水镜
 * @blog https://liushuijinger.blog.csdn.net
 * @date 2019/06/02
 */
@Api
@RestController
public class HelloController {

    @ApiOperation(value = "Hello Spring Boot 方法")
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) @ApiParam("名字") String name) {
        if (name != null && !"".equals(name)) {
            return "Hello " + name;
        }
        return "Hello Spring Boot";
    }
}
