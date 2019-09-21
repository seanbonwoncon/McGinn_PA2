import java.util.Scanner;

public class assignment2_problem1_decryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int data;
		int first;
		int second;
		int third;
		int fourth;
		
		System.out.print("Please enter a 4 digit encrypted integer:");
		data = scnr.nextInt();
		
		third = data / 1000; 
		fourth = (data / 100) % 10; 
		first = (data / 10) % 10; 
		second = data % 10; 
		
		//System.out.println("decrypted: " + first + second + third + fourth);
		if(first < 7) {
			first = ((first + 10) - 7) % 10;
		}
		else
			first = (first - 7) % 10;
		
		if(second < 7) {
			second = ((second + 10) - 7) % 10;
		}
		else
			second = (first - 7) % 10;
		
		if(third < 7) {
			third = ((third + 10) - 7) % 10;
		}
		else
			third = (third - 7) % 10;

		if(fourth < 7) {
			fourth = ((fourth + 10) - 7) % 10;
		}
		else
			fourth = (fourth - 7) % 10;
		
		System.out.println("decrypted: " + first + second + third + fourth);
	}

}
