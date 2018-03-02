package com.xinqushi.service;

import com.xinqushi.entity.LoginUserInfo;

public interface LoginUserService {
	LoginUserInfo getLoginUserByToken(String token);
}
