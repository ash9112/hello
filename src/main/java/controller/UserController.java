package controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;

@RequestMapping(" users")
public abstract  class UserController {
    
	@Autowired
	private UserService userService;
	
	@GetMapping(" {id}")
	public List<User> getAllUser(){
		return null;	
	}
	
	public ResponseEntity<User> getUserById (Long id) {
		return null;
	}{
		List<User> user = userService.getAllUser(){
			if ( user == null) {

				ResponseEntity.ok(CreateUser);
				
				
			}
		}
		
		
	}
	
	

	@PutMapping(" id")
	public abstract ResponseEntity<User> updateuser(Long id , @RequestBody User userDetail);{
		Long userDetailed;
		User id;
		User updateUser = userService.updateUser(id, userDetailed);
		
	
		if (updateUser == null) {
			
			ResponseEntity.ok(updateUser);
			
			
		}
	
	
}

	
    @DeleteMapping (" id")	
    public ResponseEntity<Void> deleteUser (id){
    	
    	userservice.deleteUser(id);
    	
    	ResponseEntity.ok();
		
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}