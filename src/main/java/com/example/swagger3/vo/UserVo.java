package com.example.swagger3.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 用户VO
 * @author gulin
 * @date 2021/8/10 13:50
 */
@Data
@Schema(name = "用户请求参数")
public class UserVo {

    @Schema(name = "用户名称")
    private String name;
    @Schema(name = "用户编码")
    private String code;

}
