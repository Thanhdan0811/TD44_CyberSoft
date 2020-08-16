import java.util.Scanner;

public class DemoLoop {

	public static void main(String[] args) {
		/*
		 * Demo vòng lặp
		 * Viết chương trình nhập vào số điểm thi
		 * Nếu điểm thi < 5 thì cần phải thi lại
		 * In ra số lần thi rớt
		 */
		Scanner scanner = new Scanner(System.in);
		int soLanThiRot = 0;
		float diemThi = 0;
		
		System.out.print("Nhập điểm thi: ");
		diemThi = Float.parseFloat(scanner.nextLine());
		
		while(diemThi < 5) {
			soLanThiRot++;
			System.out.print("Nhập điểm thi: ");
			diemThi = Float.parseFloat(scanner.nextLine());
		}
		
		System.out.println("Số lần thi rớt: " + soLanThiRot);
	}

}
