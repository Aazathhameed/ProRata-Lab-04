import java.util.Scanner;

public class IT22925404Lab4Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100):");
		double examMarks = input.nextDouble();
		if(examMarks<0||examMarks>100){
			System.out.println("Invalid input for exam marks, Terminating Program");
			return;
		}
		
		System.out.print("Plese enter lab subission marks (out of 100):");
		double subMarks = input.nextDouble();
		if(subMarks<0||subMarks>100){
			System.out.println("Invalid input for Submission marks, Terminating Program");
			return;
		}
		
		System.out.print("Please enter the percentage given for the exam:");
		double examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab subission:");
		double labPercentage = input.nextDouble();
		
		if(examPercentage+labPercentage != 100){
			System.out.println("The percentage must add upto 100. Terminating program");
			return;
		}
		
		double finalmarks = (examMarks*examPercentage/100)+(subMarks*labPercentage/100);
		System.out.println("Final exam mark is: "+finalmarks);
		
		input.close();
		
	}
}