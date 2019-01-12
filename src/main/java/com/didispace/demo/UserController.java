package com.didispace.demo;

import com.didispace.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Api(tags="用户管理")
@RestController
public class UserController {

    @ApiOperation(value = "创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true ,dataType = "Json")
    @PostMapping("/users")
    public User create(@RequestBody @Valid User user) {
        return user;
    }

    @ApiOperation(value = "用户详情")
    @ApiImplicitParam(name = "id", example = "123",value = "用户Id", required = true, dataType = "Long")
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return new User("bbb", 21, "上海", "aaa@bbb.com");
    }

    @ApiOperation("用户列表")
    @GetMapping("/users")
    public List<User> list(@ApiParam("查看第几页") @RequestParam int pageIndex,
                           @ApiParam("每页多少条") @RequestParam int pageSize) {
        List<User> result = new ArrayList<>();
        result.add(new User("aaa", 50, "北京", "aaa@ccc.com"));
        result.add(new User("bbb", 21, "广州", "aaa@ddd.com"));
        return result;
    }

    @ApiIgnore
    @DeleteMapping("/users/{id}")
    public String deleteById(@PathVariable Long id) {
        return "delete user : " + id;
    }

}