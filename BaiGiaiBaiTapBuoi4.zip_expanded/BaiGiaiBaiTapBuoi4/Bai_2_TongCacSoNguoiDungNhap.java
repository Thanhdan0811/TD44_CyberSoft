import java.util.Scanner;

public class Bai_2_TongCacSoNguoiDungNhap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		tinhTongCacSo(scan);

	}

	public static void tinhTongCacSo(Scanner scan) {
		final int SO_MAC_DINH = 0;
		boolean flag = true;
		float tong = SO_MAC_DINH;
		while (flag) {
			System.out.println("Mời nhập số (nhấn 0 để thoát) : ");
			float so = Float.parseFloat(scan.nextLine());
			tong += so;
			if (so == SO_MAC_DINH) {
				flag = false;
			}
		}
		System.out.println("Tổng tất cả các số vừa nhập là : " + tong);
	}
}
