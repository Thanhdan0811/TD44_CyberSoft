import java.util.Scanner;

public class BaiTapTheTinDung {

	public static void main(String[] args) {
		/*
		 * Bài tập Credit Card
		 */
		Scanner scanner = new Scanner(System.in);
		float creditCardBalance, payment, balance, penalty = 0;
		
		System.out.print("Credit Card Balance: ");
		creditCardBalance = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Payment Amount: ");
		payment = Float.parseFloat(scanner.nextLine());
		
		balance = payment - creditCardBalance;
		
		if(balance > 0) {
			penalty = balance * 1.5f / 100;
		}
		
		System.out.println("Penalty you need to pay: " + penalty);
		
	}

}
