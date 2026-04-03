package java_Session;

public class Shopping_Bill_Calculator {
	
	public static void main(String[] args) {
		
		final double Rice = 250;
		final double Oil = 180;
		final double Bread = 45;
		final double Milk = 90;
		final double Eggs = 84;
		
		double subTotal = 0;
		
		subTotal += Rice;
		subTotal += Oil;
		subTotal += Bread;
		subTotal += Milk;
		subTotal += Eggs;
		
		System.out.println("Subtotal: Rs. " + subTotal);
		
		double gst = (subTotal > 500) ? subTotal * 0.05 : 0;
		
		System.out.println("GST (5%): Rs. " + gst);
		subTotal += gst;
		
		double Discount = (subTotal > 600) ? subTotal * 0.10 : 0;
		
		System.out.println("Discount: Rs. " + Discount);
		
		subTotal -= Discount; // Floating point numbers cannot represent some decimals exactly in binary.
		
		System.out.println("Total: Rs. " + subTotal);
	}
}
