import java.util.Scanner;

public class BaiTapTinhGiamGia {

	public static void main(String[] args) {
		/*
		 * Tính hóa đơn
		 */
		Scanner scanner = new Scanner(System.in);
		int soLuong;
		float donGia, tongTien = 0;
		String tenHang;
		
		System.out.print("Tên hàng: ");
		tenHang = scanner.nextLine();
		
		System.out.print("Số lượng: ");
		soLuong = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Đơn giá: ");
		donGia = Float.parseFloat(scanner.nextLine());
		
		if(soLuong > 100) {
			System.out.println("Đơn hàng này được giảm giá 12%.");
			tongTien = soLuong * donGia - soLuong * donGia * 12 / 100;
		} else if(soLuong >= 50) {
			System.out.println("Đơn hàng này được giảm giá 8%.");
			tongTien = soLuong * donGia - soLuong * donGia * 8 / 100;
		} else {
			tongTien = soLuong * donGia;
		}
		
		System.out.println("Số tiền phải thanh toán: " + tongTien);
	}

}
