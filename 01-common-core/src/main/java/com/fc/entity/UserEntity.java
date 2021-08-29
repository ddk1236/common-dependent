package com.fc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ddk
 * @date 2021/8/17
 */
@Data
//该注解设置为chain=true，生成setter方法返回this（也就是返回的是对象），代替了默认的返回void。

@Accessors(chain = true)
@NoArgsConstructor
public class UserEntity {
    @TableId(value = "id",type = IdType.ASSIGN_ID )
    private Long id;
    private String name;
    private int age;
    private String emali;
    private String info;

}
