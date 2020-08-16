import java.util.Scanner;

public class LaiSuat_TheTinDung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float creditCardBalance, payment, penaty = 0;
		System.out.print("Nhập vào số dư tài khoản : ");
		creditCardBalance = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào số tiền đã tiêu : ");
		payment = Float.parseFloat(scan.nextLine());
		scan.close();
		if(payment - creditCardBalance > 0) {
			penaty = payment * 0.015f - creditCardBalance * 0.015f;
		}
		System.out.println("Số tiền phạt là " + String.format("%5f$", penaty));
	}

}
