package com.example.swagger3.controller;

import com.example.swagger3.vo.UserVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * swagger3用例
 * @author gulin
 * @date 2021/8/10 13:48
 */

@RequestMapping("/swagger3")
@RestController
@Tag(name = "用户操作接口")
public class UserController {

    @RequestMapping(value = "/v1/query", method = RequestMethod.POST)
    @Operation(summary = "用户查询", description = "务必提交json格式")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "查询成功返回data")
    })
    public String test(@Parameter(name = "testVo", description = "用户请求VO", required = true) @RequestBody UserVo userVo) {
        System.out.println(userVo.getCode() + "-----" + userVo.getName());
        return "success";
    }

}
