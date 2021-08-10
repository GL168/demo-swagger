package com.example.swagger2.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户VO
 * @author gulin
 * @date 2021/8/10 14:11
 */
@Data
@ApiModel(description = "用户请求参数")
public class UserVo {
    @ApiModelProperty(value = "用户名称",required = true,position = 1)
    private String name;
    @ApiModelProperty(value = "用户编码",required = true,position = 2)
    private String code;
}
