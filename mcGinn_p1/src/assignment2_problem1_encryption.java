import java.util.Scanner;

public class assignment2_problem1_encryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int data;
		int first;
		int second;
		int third;
		int fourth;
		
		System.out.print("Please enter a 4 digit integer:");
		data = scnr.nextInt();
		
		first = data / 1000;
		second = (data / 100) % 10;
		third = (data / 10) % 10;
		fourth = data % 10;
		
		first = (first + 7) % 10;
		second = (second + 7) % 10;
		third = (third + 7) % 10;
		fourth = (fourth + 7) % 10;
		
		System.out.println("encrypted: " + third + fourth + first + second);	
	}

}
