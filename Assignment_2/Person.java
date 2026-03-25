package default_package;

public class Person {
	
	private String name;
	private int age;
	private String email;
	private double salery;
	
	Person(String name, int age, String email, double salery){
		this.name = name;
		this.age = age;
		this.email = email;
		this.salery = salery;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getSalery() {
		return salery;
	}
	
	public void setAge(int age) {
		if(age>=0 && age<=120) {
			this.age = age;
		}
		else {
			System.out.println("Age you have entred is invalied!");
		}
	}
	
	public void setSalery(double salery) {
		if(salery >= 0) {
			this.salery = salery;
		}
		else {
			System.out.println("Salery must not be negative!");
		}
	}
	
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = email;
		}
		else {
			System.out.println("Enter a valied Email ID!");
		}
	}
	
	public static void main(String[] args) {
		
		Person p = new Person("Yeswanth", 25, "Yeswanth@gmail.com", 68000);
		
		p.setAge(-5);
		p.setSalery(-1000);
		p.setEmail("NOT VALIED");
		
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Email ID: " + p.getEmail());
		System.out.println("Salery: " + p.getSalery());
		
	}

}
