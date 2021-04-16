package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;


public interface IUserService {
    /**
     * 创建用户
     */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
