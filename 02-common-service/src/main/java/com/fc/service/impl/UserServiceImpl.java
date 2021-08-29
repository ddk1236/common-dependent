package com.fc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fc.entity.UserEntity;
import com.fc.mapper.UserMapper;
import com.fc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ddk
 * @date 2021/8/17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {


}
