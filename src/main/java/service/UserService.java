package service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser(){
		return null;}
	
	public User  getUserBtId(Long id) {
		return null;
		
	}
	
	public User  createUser(User user) {
		return null;
		
	}
	
	
	public User  updateUser(User user , Long id) {
		return null;
		
	}
	public void  deleteUser(User user) {
		return;
		
	}

}
