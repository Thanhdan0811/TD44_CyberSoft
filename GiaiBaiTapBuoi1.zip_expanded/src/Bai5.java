import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scanner = new Scanner(System.in);

		// Nhập dữ liệu
		System.out.println("Hãy nhập vào 1 số nguyên có 2 chữ số: ");
		int soBanDau = Integer.parseInt(scanner.nextLine());

		// Xử lý
		int hangChuc = soBanDau / 10;
		int hangDonVi = soBanDau % 10;
		int tong = hangChuc + hangDonVi;

		// Đầu ra
		System.out.println("Tổng 2 ký số vừa nhập là " + tong);

	}

}
