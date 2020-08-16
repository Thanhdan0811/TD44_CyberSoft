import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// Đầu vào
		final int TI_GIA = 23_500;
		Scanner scanner = new Scanner(System.in);
		
		// Nhập dữ liệu
		System.out.println("Nhập số tiền USD muốn quy đổi: ");
		int tienUSD = Integer.parseInt(scanner.nextLine());
		
		// Xử lý
		int tienVND = tienUSD * TI_GIA;
		
		// Đầu ra
		System.out.println("Số tiền trên có giá trị tương đương " + tienVND + " VND");
	}

}
