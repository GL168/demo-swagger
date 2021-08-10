package com.example.swagger2.controller;

import com.example.swagger3.vo.UserVo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户测试类
 * @author gulin
 * @date 2021/8/10 14:09
 */
@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/swagger2")
public class UserController {

    @RequestMapping(value = "/v1/query", method = RequestMethod.POST)
    @ApiOperation(value = "用户查询", notes = "务必提交json格式")
    @ApiResponses({
            @ApiResponse(code = 200, message = "查询成功返回data", response = UserVo.class)
    })
    public String test(@ApiParam(name = "userVo", value = "用户请求VO", required = true) @RequestBody UserVo userVo) {
        System.out.println(userVo.getCode() + "-----" + userVo.getName());
        return "success";
    }

}
