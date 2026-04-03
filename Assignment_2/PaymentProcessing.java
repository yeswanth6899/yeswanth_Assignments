<<<<<<< HEAD
package default_package;

abstract class Payment{
	String payerName;
	double amount;
	
	Payment(String payerName, double amount){
		this.payerName = payerName;
		this.amount = amount;
	}
	
	abstract void processPayments();
	
	void displayReceipt() {
		System.out.println("Name of the Payer: " + payerName);
		System.out.println("Amount: $" + amount);
		System.out.println("Status of the payment: Completed");
		System.out.println("--------------------------------");
	}
}

class cashPayment extends Payment{
	
	cashPayment(String payerName, double amount){
		super(payerName, amount);
	}
	
	void processPayments() {
		System.out.println("Cash Payment of $" + amount + " Received!");
	}
}

class cardPayment extends Payment{
	
	String cardNumber;
	String bankName;
	
	cardPayment(String payerName, String cardNumber, String bankName, double amount){
		super(payerName, amount);
		this.cardNumber = cardNumber;
		this.bankName = bankName;
	}
	
	void processPayments() {
		String last4 = cardNumber.substring(cardNumber.length() - 4);
		System.out.println("Card payment of $" + amount + " Received from the card ending with " + last4 + "from " + bankName);
		
	}
}

class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment(String payerName, double amount, String upiId){
		super(payerName, amount);
		this.upiId = upiId;
	}
	
	void processPayments() {
		System.out.println("Processing.....");
		System.out.println("Success!");
	}
}

class EMIPayment extends Payment{
	
	int months;
	
	EMIPayment(String payerName, double amount, int months){
		super(payerName, amount);
		this.months = months;
	}
	
	void processPayments() {
		double emi = amount / months;
		System.out.println("Monthly EMI of $" + emi + "for " + months + " months");
	}
}
public class PaymentProcessing {
public static void main(String[] args) {
	Payment[] payments = new Payment[4];
	payments[0] = new cashPayment("Yeswnth" , 1000);
	payments[1] = new cardPayment("Yeswanth", "1234567890","American bank", 1500);
	payments[2] = new UPIPayment("Yeswanth", 2000, "Yeswanth@americanbank.upi");
	payments[3] = new EMIPayment("Yeswanth", 68000, 12);
	
	for(Payment p: payments) {
		p.processPayments();
		p.displayReceipt();
	}
}
}

//Payment p = new Payment();
// ERROR: Cannot create object of abstract class Payment.
// Because it has an abstract method (processPayment) which has no implementation.
=======
package default_package;

abstract class Payment{
	String payerName;
	double amount;
	
	Payment(String payerName, double amount){
		this.payerName = payerName;
		this.amount = amount;
	}
	
	abstract void processPayments();
	
	void displayReceipt() {
		System.out.println("Name of the Payer: " + payerName);
		System.out.println("Amount: $" + amount);
		System.out.println("Status of the payment: Completed");
		System.out.println("--------------------------------");
	}
}

class cashPayment extends Payment{
	
	cashPayment(String payerName, double amount){
		super(payerName, amount);
	}
	
	void processPayments() {
		System.out.println("Cash Payment of $" + amount + " Received!");
	}
}

class cardPayment extends Payment{
	
	String cardNumber;
	String bankName;
	
	cardPayment(String payerName, String cardNumber, String bankName, double amount){
		super(payerName, amount);
		this.cardNumber = cardNumber;
		this.bankName = bankName;
	}
	
	void processPayments() {
		String last4 = cardNumber.substring(cardNumber.length() - 4);
		System.out.println("Card payment of $" + amount + " Received from the card ending with " + last4 + "from " + bankName);
		
	}
}

class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment(String payerName, double amount, String upiId){
		super(payerName, amount);
		this.upiId = upiId;
	}
	
	void processPayments() {
		System.out.println("Processing.....");
		System.out.println("Success!");
	}
}

class EMIPayment extends Payment{
	
	int months;
	
	EMIPayment(String payerName, double amount, int months){
		super(payerName, amount);
		this.months = months;
	}
	
	void processPayments() {
		double emi = amount / months;
		System.out.println("Monthly EMI of $" + emi + "for " + months + " months");
	}
}
public class PaymentProcessing {
public static void main(String[] args) {
	Payment[] payments = new Payment[4];
	payments[0] = new cashPayment("Yeswnth" , 1000);
	payments[1] = new cardPayment("Yeswanth", "1234567890","American bank", 1500);
	payments[2] = new UPIPayment("Yeswanth", 2000, "Yeswanth@americanbank.upi");
	payments[3] = new EMIPayment("Yeswanth", 68000, 12);
	
	for(Payment p: payments) {
		p.processPayments();
		p.displayReceipt();
	}
}
}

//Payment p = new Payment();
// ERROR: Cannot create object of abstract class Payment.
// Because it has an abstract method (processPayment) which has no implementation.
>>>>>>> 7ea7e141b6440b42900aaa9ff550f5905408bd3d
