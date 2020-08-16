import java.util.Scanner;

public class BaiTapTinhLuongOT {

	public static void main(String[] args) {
		/*
		 * Bài tập tính lương OT
		 */
		Scanner scanner = new Scanner(System.in);
		float soGioLam, luongMotGio, tongLuong = 0;
		
		System.out.print("Nhập số giờ làm: ");
		soGioLam = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Lương một giờ: ");
		luongMotGio = Float.parseFloat(scanner.nextLine());
		
		if(soGioLam > 40) {
			tongLuong = 40 * luongMotGio + (soGioLam - 40) * 1.5f * luongMotGio;
		} else {
			tongLuong = soGioLam * luongMotGio;
		}
		
		System.out.println("Tổng lương: " + tongLuong);
	}

}
