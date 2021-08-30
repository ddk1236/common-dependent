package com.fc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ddk
 * @date 2021/8/17
 */
@Data
//该注解设置为chain=true，生成setter方法返回this（也就是返回的是对象），代替了默认的返回void。

@Accessors(chain = true)
@NoArgsConstructor
@TableName("user")
public class UserEntity implements Serializable {

    /**
     * 主键ID
     */
    @ApiModelProperty("主键ID")
    @TableId(value = "id",type = IdType.ASSIGN_ID )
    private Long id;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private String name;

    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private Integer age;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 信息
     */
    @ApiModelProperty("信息")
    private String info;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date modifyTime;

    /**
     * 修改人id
     */
    @ApiModelProperty("修改人id")
    private Long modifyUserId;

    /**
     * 创建人id
     */
    @ApiModelProperty("创建人id")
    private Long createUserId;

    /**
     * 是否删除（0正常,1删除）
     */
    @ApiModelProperty("是否删除（0正常,1删除）")
    private Boolean deleted;

    private static final long serialVersionUID = 1L;

}
