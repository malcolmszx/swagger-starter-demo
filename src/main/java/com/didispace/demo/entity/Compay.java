package com.didispace.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("系统基本信息")
public class Compay {

    @ApiModelProperty("系统名称")
    @Size(max = 20)
    private String compayName;

    @ApiModelProperty(value = "年限" ,example = "23")
    @Max(150)
    @Min(1)
    private Integer age;

    @ApiModelProperty("公司地址")
    @NotNull
    private String address;

    @ApiModelProperty("电子邮件")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String email;

}
