package com.xambank.services;

import com.xambank.entity.User;

public interface UserService {
	User findByLoginAndPassword (Long login, Long passWord);
}
