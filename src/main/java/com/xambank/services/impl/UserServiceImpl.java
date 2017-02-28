package com.xambank.services.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.xambank.dao.UserRepository;
import com.xambank.entity.User;
import com.xambank.services.UserService;

@Component()
@Transactional
public class UserServiceImpl implements UserService{

	@Resource
	UserRepository userRepository;
	
	@Override
	public User findByLoginAndPassword(Long login, Long passWord) {
		
		return userRepository.findByLoginAndPassword(login, passWord);		
	}
}
