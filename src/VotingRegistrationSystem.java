	
	class UnderAgeException extends Exception{
		
	public UnderAgeException(String message){
			super(message);
		}
	}
public class VotingRegistrationSystem {
	
	public static void registerVoter(String name, int age) throws UnderAgeException{
		if(age >=18) {
			System.out.println("Registered: " + name);
		}
		else {
			throw new UnderAgeException(name + " is too young. Age: " +age);
		}
	}
	
	public static void main(String[] args) {
		try {
			registerVoter("Alice" , 22);
		}catch(UnderAgeException e) {
			System.out.println("UnderAgeException: " + e.getMessage());
		}
		try {
			registerVoter("Bob" , 16);
		}catch(UnderAgeException e) {
			System.out.println("UnderAgeException: " + e.getMessage());
		}
		try {
			registerVoter("Carol" , 18);
		}catch(UnderAgeException e) {
			System.out.println("UnderAgeException: " + e.getMessage());
		}
		System.out.println("Registration process completed");
	}
}
