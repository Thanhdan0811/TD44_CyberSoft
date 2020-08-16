import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// Đầu vào
		final int LUONG_NGAY = 100000;
		Scanner scanner = new Scanner(System.in);
		//Nhập dữ liệu
		System.out.print("Nhập số ngày công của nhân viên: ");
		int soNgayCong = Integer.parseInt(scanner.nextLine());

		// Xử lý
		int tienLuong = soNgayCong * LUONG_NGAY;

		// Đầu ra
		System.out.println("Tiền lương của nhân viên là: " + tienLuong);
	}
}
