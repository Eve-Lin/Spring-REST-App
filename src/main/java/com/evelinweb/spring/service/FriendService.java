package com.evelinweb.spring.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.evelinweb.spring.entity.Friend;

@Service
public interface FriendService extends CrudRepository<Friend, Integer>{

	
	Iterable<Friend> findByFirstNameAndLastName(
			String firstName,
			String lastName
			);
	
	Iterable<Friend> findByFirstName(String firstName);
	Iterable<Friend> findByLastName(String lastName);
}
