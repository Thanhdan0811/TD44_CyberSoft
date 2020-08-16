import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scanner = new Scanner(System.in);

		// Nhập dữ liệu
		System.out.println("Nhập chiều dài hình chữ nhật: ");
		float chieuDai = Float.parseFloat(scanner.nextLine());
		System.out.println("Nhập chiều rộng hình chữ nhật: ");
		float chieuRong = Float.parseFloat(scanner.nextLine());

		// Xử lý
		float chuVi = (chieuDai + chieuRong) * 2;
		float dienTich = chieuDai * chieuRong;

		// Đầu ra
		System.out.println("Chu vi hình chữ nhật là: " + chuVi);
		System.out.println("Diện tích hình chữ nhật là: " + dienTich);
	}

}
