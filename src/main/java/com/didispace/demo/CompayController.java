package com.didispace.demo;


import com.didispace.demo.entity.Compay;
import com.didispace.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags="公司系统管理")
@RestController
public class CompayController {


    @ApiOperation(value = "创建系统")
    @ApiImplicitParam(name = "compay", value = "用户详细实体user", required = true ,dataTypeClass = Compay.class)
    @PostMapping("/compay")
    public Compay create(@RequestBody @Valid Compay compay) {
        return compay;
    }

}
