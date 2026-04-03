import java.util.HashSet;

public class RegistrationSystem {
	
	public static void main(String[] args) {
		HashSet<String> registeredEmails = new HashSet<>();
		registeredEmails.add("alice@mail.com");
		registeredEmails.add("bob@mail.com");
		registeredEmails.add("carol@mail.com");
		registeredEmails.add("alice@mail.com");
		registeredEmails.add("david@mail.com");
		
		System.out.println("Set Size: " + registeredEmails.size());
		
		register(registeredEmails, "bob@mail.com");
		register(registeredEmails, "eve@mail.com");
		
		boolean isPresent = registeredEmails.contains("carol@mail.com");
		System.out.println("carol@mail.com exists: " + isPresent);
		System.out.println("All Emails: ");
		for(String emails: registeredEmails) {
			System.out.print( emails + ", ");
		}
		
		
			
 }
	public static boolean register(HashSet<String> set, String email) {
		
		if(set.contains(email)) {
			System.out.println("Already Registered: " + email);
			return false;
		}
		else {
			set.add(email);
			System.out.println(email + " Registered Successfully.");
			return true;
		}
	}
		

}
