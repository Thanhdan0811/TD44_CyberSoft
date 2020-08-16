import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// Tinh giá trị P(x) = ax ^ n
		// Đầu vào
		Scanner scanner = new Scanner(System.in);

		// Nhập dữ liệu
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số thực a: ");
		float a = Float.parseFloat(scanner.nextLine());
		System.out.println("Nhập n với n > 0: ");
		int n = Integer.parseInt(scanner.nextLine());

		// Xử lý
		double ketQua = Math.pow((a * x), n);

		// Đầu ra
		System.out.println("P(x) = ax ^ n có kết quả P = " + ketQua);

	}

}
