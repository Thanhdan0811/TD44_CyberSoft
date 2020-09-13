import java.util.Scanner;

public class Bai_5_XuLyMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		xuLyMenu(scan);
	}

	public static void inMenu() {
		System.out.println("===---o0 Menu 0o---===");
		System.out.println("0.Thoát");
		System.out.println("1.Tính tổng");
		System.out.println("2.Tính hiệu");
		System.out.println("3.Tính nhân");
		System.out.println("4.Tính chia");
	}

	public static void xuLyMenu(Scanner scan) {
		final int SO_MAC_DINH = 0;
		final int SO_MUC = 4;
		boolean flag = true;
		int chon = SO_MAC_DINH;
		float ketQua = SO_MAC_DINH;
		do {
			float a = SO_MAC_DINH;
			float b = SO_MAC_DINH;
			inMenu(); // Gọi hàm in Menu cho người chọn
			System.out.print("Chọn >>");
			chon = Integer.parseInt(scan.nextLine());
			if (chon > SO_MAC_DINH && chon <= SO_MUC) {
				// Cho người dùng nhập vào các số để tính toán
				System.out.println("Nhập số a");
				a = Float.parseFloat(scan.nextLine());
				System.out.println("Nhập số b");
				b = Float.parseFloat(scan.nextLine());
			}
			switch (chon) {
			case 1:
				ketQua = a + b;
				System.out.println("Kết quả là : " + ketQua);
				break;

			case 2:
				ketQua = a - b;
				System.out.println("Kết quả là : " + ketQua);
				break;
			case 3:
				ketQua = a * b;
				System.out.println("Kết quả là : " + ketQua);
				break;
			case 4:
				if (b != SO_MAC_DINH) {
					ketQua = a / b;
					System.out.println("Kết quả là : " + ketQua);
				}
				break;
			case 0:
				System.out.println("Đã thoát !");
				flag = false;
				break;
			default:
				System.out.println("Vui lòng chọn đúng Menu !");
			}
		} while (flag);

	}
}
