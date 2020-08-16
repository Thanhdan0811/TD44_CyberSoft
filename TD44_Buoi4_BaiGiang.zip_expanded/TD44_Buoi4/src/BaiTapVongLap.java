import java.util.Scanner;

public class BaiTapVongLap {
	public static void main(String[] args) {
		/*
		 * Tính tổng các số lớn hơn không
		 * do người dùng nhập
		 * Chương trình sẽ dừng khi nhập số âm
		 * hoặc 0.
		 */
		Scanner scanner = new Scanner(System.in);
		int tong = 0, soNhap = 1;
		/*
		System.out.print("Mời nhập số nguyên: ");
		soNhap = Integer.parseInt(scanner.nextLine());
		
		if(soNhap > 0)
			tong += soNhap;
		*/
		boolean tiepTucChay = false;
		do {
			System.out.print("Mời nhập số nguyên: ");
			soNhap = Integer.parseInt(scanner.nextLine());
			
			if(soNhap > 0) {
				tong += soNhap;
				tiepTucChay = true;
			} else 
				tiepTucChay = false;
				
		} while(tiepTucChay);
		
		System.out.println("Tổng các số đã nhập: " + tong);
	}
}
