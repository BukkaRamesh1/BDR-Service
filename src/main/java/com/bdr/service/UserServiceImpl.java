package com.bdr.service;

import org.springframework.stereotype.Service;

import com.bdr.model.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	  /*
	   * 
	   *  Loops 
	   *    while loop  -- if the given condition is true the it will repate the loop
	   *    do while  --  it will same like while but the condition check will happpen at end of the logic / body
	   *    for loop  -- multiple time the iteration will go trough and repreates it manages loop variables
	   *    enhanced for loop or foreach loop
	   *      
	   *      
	   *     while(expression) {
	   *     }
	   *     
	   *     do{
	   *     
	   *     }while(expression)
	   *     
	   *     for(initialise, condition check, incrememnt or decrementy ){
	   *     
	   *     }
	   * 
	   * 
	   * 
	   *  Decison making statment
	   *     if
	   *     if else
	   *     if else if
	   *     nested if
	   *     switch
	   *     
	   *     continue
	   *     break
	   *     
	   *     
	   *     switch(expression){
	   *     case 1:
	   *      dasdasd;
	   *      break;
	   *     case 2:
	   *      dsadasdasd 
	   *      break;
	   *     case 3:
	   *      dasdasd
	   *      break;
	   *     deault: 
	   *     sdasdasd  
	   *      
	   *      
	   *     }
	   *     
	   *     
	   *     
	   *     OOPS
	   *     
	   *     Inheritance  -- acquring the properties of parent to child get it vvia extends key word 
	   *     Encapsulation --  binding of data and object together we call as 
	   *     Abstraction  -- hiding 
	   *     Polymorphism  -- many forms of a method 
	   *     
	   *     method overlaoding -- same method with different signiture 
	   *     method overriding -- same method and same signiture the latest values will be replaced by your primary method 
	   *     
	   *     
	   *     
	   *     
	   *     
	   *    if(condition){
	   * 
	   */
	
	 public User createUser(User user) {
		  String ufirstName = "Bob";  // local variable because the scope is inside the method 
		 // name = "Daniel";
		 // age = 21;  // the varaible is defined as final you cant override it
		  
		  //if the user name == alex
		  // then save the user address as texas
		  
		  
		  
		  while(user.getUserName() == "Alex") {
			  
			  if (user.getUserNumber() > 1) {
			  System.out.println("the name is alex");  // this will get executed if while condirtion satisfies
		  
			  } else {
				  System.out.println("the name and number doest match the requirment");
			  }
			  
		  
		  }
			  
		  
		  
		  do {
			  System.out.println("the name is alex from do while");
			  
			  if(user.getUserName().contains("A")) {
				  System.out.println("Say the user namer contians A");
			  } else if(user.getUserNumber() > 1) {
				   System.out.println("the user number is greate then 1");
			  } else {
				  System.out.println("Any of the condition doesn't match");
			  }
			  

		  }  while(user.getUserName() == "Alex"); 
		  
		  
	      for(int i=0 ; i<= user.getSize() ; i ++) {
				  
				  
				  if(user.getName().contains("A")) {
					  if(user.getUserNumber() > 1) {
						  System.out.println();
					  }
				  } else {
					  System.out.println("both the condiony done't match");
				  }
				  
			  }
			  
			  for(String name : User) {
				  
			  }
			  
			  
			switch(user.getUserName()) {
			case "A":
				System.out.println("user names start with a");
				break;
			case "A":
				System.out.println("user names start with a");
				break;
			case "A":
				System.out.println("user names start with a");
				break;	
			default:
				System.out.println("Nonen of the above case is matching");
				
				
			}
		  
		  
		  return user;
	  }
	  
	 
	  public User getUser() {
		return null;
	  }

}
