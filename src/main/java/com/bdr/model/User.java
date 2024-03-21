package com.bdr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
public class User extends Address {
//	
	
	 String name = "Alex";  // Global variable the scope exisits entire class 
	 
	 final Integer age = 18;
	
	public User() {
		super();
		System.out.println("Default constructor is called");
	}
	
	
	public User(Integer userId, String userName, String userAddress, Long userNumber, boolean userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userNumber = userNumber;
		this.userStatus = userStatus;
	}


	public User(Integer userId, String userName) {
		super();
		
		this.userId = userId;
		this.userName = userName;
	
	}
	
	
	
	
	
	
      
	
public void testUser(String name) {
	System.out.println("test user called from user class");
}
 

public void testUser(String name, String address) {
	System.out.println("test user called from user class");
}

public void testUser(String name, Integer address) {
	System.out.println("test user called from user class");
}
 

  
  
	/*
	 * 
	 * Access specvifiers
	 * 
	 * 
	 *  public   -- accessible for everyone entire project the scope 
	 *  private  -- the scope of the variable is exists inside the class 
	 *  protected   -- the scope is inside the package the variable or anythig defined bt protected can be accessed trough out the package 
	 *  default
	 *  
	 *  static
	 *  
	 *  
	 *  
	 *  Deafult constructor 
	 *  Parameters 
	 *  
	 *  
	 *  varaible types 
	 *  
	 *  Local variable
	 *  global variable
	 *  static variable
	 *  final variable 
	 *  
	 *  
	 *  The static method will read only static variables and fuc
	 *  
	 *    // Model classes
	 *   // Any request that will comes to your controller first
	 *   // It will pass the object to Service
	 *   // It will process the data and get to repository and save in DB
	 *   
	 *   
	 *  
	 *  
	 *  
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	//	
	private String userName;
	private String userAddress;
	protected Long userNumber;
	boolean userStatus = true;  // default and the scope of default is also public
	
	
	public Address address;  // we are inheiting vis aggregation

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", userId=" + userId + ", userName=" + userName
				+ ", userAddress=" + userAddress + ", userNumber=" + userNumber + ", userStatus=" + userStatus
				+ ", address=" + address + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
	
	
	
	

}
