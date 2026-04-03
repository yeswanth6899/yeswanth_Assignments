package default_package;

public class Quiz_Score_Analysis {
	
	public static void main(String[] args) {
		
		int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};
		
		int highest = 85;
		int lowest = 85;
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            sum = sum + scores[i];
        }

        double average = (double) sum / scores.length;
        
		System.out.println("Highest Score is: " + highest);
		System.out.println("Lowest Score is: " + lowest);
		System.out.println("Average score is: " + average);
			
	}

}
