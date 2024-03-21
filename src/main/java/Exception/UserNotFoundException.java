package Exception;



@ExceptionHandler(UserNotFoundException.class)
public class UserNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3327937343540036226L;
	
	
	public UserNotFoundException() {
		
	}
	
	public UserNotFoundException(String message) {
		super(message);
		System.out.println("User not foiund exception : "+message);
	}
	
	
	

}
