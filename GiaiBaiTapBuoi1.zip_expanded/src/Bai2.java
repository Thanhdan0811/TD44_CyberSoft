import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		//Đầu vào
		Scanner scanner = new Scanner(System.in);
		final int trungBinhCong = 5;
		float ketQua = 0;
		
		//Nhập dữ liệu
		System.out.println("Vui lòng nhập 5 số thực bất kì !");
		System.out.println("Số thứ nhất: ");
		ketQua += Float.parseFloat(scanner.nextLine());
		System.out.println("Số thứ hai: ");
		ketQua += Float.parseFloat(scanner.nextLine());
		System.out.println("Số thứ ba: ");
		ketQua += Float.parseFloat(scanner.nextLine());
		System.out.println("Số thứ tư: ");
		ketQua += Float.parseFloat(scanner.nextLine());
		System.out.println("Số thứ năm: ");
		ketQua += Float.parseFloat(scanner.nextLine());

		//Xử lý tính toán
		ketQua /= trungBinhCong;

		//Đầu ra
		System.out.println("Giá trị trung bình của 5 số đã nhập là : " + ketQua);
	}
}
