import java.util.Scanner;

public class Bai_3_TongCacSoChanNguoiDungNhap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		tinhTongCacSoChan(scan);
	}

	public static void tinhTongCacSoChan(Scanner scan) {
		final int SO_MAC_DINH = 0;
		final int SO_CHIA = 2;
		boolean flag = true;
		float tong = SO_MAC_DINH;
		while (flag) {
			System.out.println("Mời nhập số (nhấn 0 để thoát) : ");
			float so = Float.parseFloat(scan.nextLine());
			if (so % SO_CHIA == SO_MAC_DINH) {
				tong += so;
			}
			if (so == SO_MAC_DINH) {
				flag = false;
			}
		}
		System.out.println("Tổng tất cả các số chẵn vừa nhập là : " + tong);
	}
}
