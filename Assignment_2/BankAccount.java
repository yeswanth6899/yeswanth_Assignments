<<<<<<< HEAD
package default_package;

public class BankAccount {
	
	String accountNumber;
	String holderName;
	String accountType;
	double balance;
	int transactionCount;
	
	BankAccount(String accNo, String name , double bal, String type){
		if(bal < 0) {
			System.out.println("Blanace Cannot be negeative, updating to 0.");
			bal = 0;
		}
		accountNumber = accNo;
		holderName = name;
		balance = bal;
		accountType = type;
		transactionCount = 0;
	}
	
	void deposit(double amt) {
		
		if(amt > 0) {
			balance += amt;
			transactionCount++;
		}
	}
	
	void withdraw(double amt) {
		if(amt >0 && amt <=balance) {
			balance -= amt;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void transfer(BankAccount target, double amt) {
		if(amt>0 && amt <= balance) {
			this.balance -= amt;
			target.balance += amt;
			this.transactionCount++;
			target.transactionCount++;
		}
		else {
			System.out.println("Transaction Failed");
		}
	}
	
	void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Account Type: " + accountType);
		System.out.println("Current Balance: " + balance);
		System.out.println("Transaction Count: " + transactionCount);
		System.out.println("----------------------------------------");
	}


public static void main(String[] args) {
	
	BankAccount account1 = new BankAccount("468", "Pranathi" , 46800 , "Savings");
	BankAccount account2 = new BankAccount("499", "Yeswanth", 49900, "Current");
	
	account1.deposit(499);
	account1.withdraw(468);
	account2.transfer(account1, 499);
	account2.deposit(468);
	account2.withdraw(499);
	
	System.out.println("Final Statements: ");
	System.out.println();
	account1.display();
	account2.display();
}
=======
package default_package;

public class BankAccount {
	
	String accountNumber;
	String holderName;
	String accountType;
	double balance;
	int transactionCount;
	
	BankAccount(String accNo, String name , double bal, String type){
		if(bal < 0) {
			System.out.println("Blanace Cannot be negeative, updating to 0.");
			bal = 0;
		}
		accountNumber = accNo;
		holderName = name;
		balance = bal;
		accountType = type;
		transactionCount = 0;
	}
	
	void deposit(double amt) {
		
		if(amt > 0) {
			balance += amt;
			transactionCount++;
		}
	}
	
	void withdraw(double amt) {
		if(amt >0 && amt <=balance) {
			balance -= amt;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void transfer(BankAccount target, double amt) {
		if(amt>0 && amt <= balance) {
			this.balance -= amt;
			target.balance += amt;
			this.transactionCount++;
			target.transactionCount++;
		}
		else {
			System.out.println("Transaction Failed");
		}
	}
	
	void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Account Type: " + accountType);
		System.out.println("Current Balance: " + balance);
		System.out.println("Transaction Count: " + transactionCount);
		System.out.println("----------------------------------------");
	}


public static void main(String[] args) {
	
	BankAccount account1 = new BankAccount("468", "Pranathi" , 46800 , "Savings");
	BankAccount account2 = new BankAccount("499", "Yeswanth", 49900, "Current");
	
	account1.deposit(499);
	account1.withdraw(468);
	account2.transfer(account1, 499);
	account2.deposit(468);
	account2.withdraw(499);
	
	System.out.println("Final Statements: ");
	System.out.println();
	account1.display();
	account2.display();
}
>>>>>>> 7ea7e141b6440b42900aaa9ff550f5905408bd3d
}