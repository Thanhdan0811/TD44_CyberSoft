import java.util.Scanner;

public class BaiTapVongFor {
	public static void main(String[] args) {
		/*
		 * Viết chương trình cho phép người dùng
		 * nhập vào N số nguyên. Số N do người dùng nhập.
		 * 
		 * Tính tổng các số chia hết cho 3 cho N số
		 * vừa nhập.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int soPhanTu, tong = 0, soNhap;
		
		System.out.print("Nhập số phần tử muốn nhập: ");
		soPhanTu = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < soPhanTu; i++) {
			System.out.print("Mời nhập số: ");
			soNhap = Integer.parseInt(scanner.nextLine());
			if(soNhap % 3 == 0)
				tong += soNhap;
		}
		
		System.out.println("Tổng các số chia hết cho 3: " + tong);
		
		System.out.println("Kết thúc chương trình.");
	}
}
