package com.xambank.dao;

import org.springframework.data.repository.CrudRepository;
import com.xambank.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByLoginAndPassword (Long login, Long passWord);
}
