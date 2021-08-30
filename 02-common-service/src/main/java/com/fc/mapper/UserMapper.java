package com.fc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fc.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 版本 Mapper 接口
 * </p>
 *
 * @author chen52
 * @since 2021-07-24
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
