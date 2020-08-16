import java.util.Scanner;

public class BaiTapTinhGiamGia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Nhập tên, số lượng, đơn giá của 1 mặt hàng
		 * xuất tiền theo rule :
		 * 50 => 100 giảm 8%
		 * > 100 : giảm 12%
		 */
		Scanner scan = new Scanner(System.in);
		int soLuongHang ;
		String tenHang; 
		float  giaHang = 0, tongThanhToan;
		System.out.print("Tên mặt hằng : ");
		tenHang = scan.nextLine();
		System.out.print("Số lượng mua : ");
		soLuongHang = Integer.parseInt(scan.nextLine());
		System.out.print("Giá của mặt hàng : ");
		giaHang = Float.parseFloat(scan.nextLine());
		scan.close();
		if(100 < soLuongHang) {
			System.out.println("Đơn hàng được giảm giá 12% ");
			tongThanhToan = soLuongHang * giaHang * 0.88f;
		} else if(50 <= soLuongHang) {
			System.out.println("Đơn hàng được giảm giá 8% ");
			tongThanhToan = soLuongHang * giaHang * 0.92f; 
		}
		else {
			System.out.println("Đơn hàng không được giảm giá ");
			tongThanhToan = soLuongHang * giaHang;
		}
		System.out.println("Tổng tiền cần thanh toán là : " + tongThanhToan);
	}

}
