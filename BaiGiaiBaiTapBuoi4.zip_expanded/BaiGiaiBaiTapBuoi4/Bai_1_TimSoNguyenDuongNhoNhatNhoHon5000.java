/*
 * 	Bài 1: Tìm số
	Tìm số nguyên dương n nhỏ nhất sao cho :
	1 + 2 + … + n > 5000
 */
public class Bai_1_TimSoNguyenDuongNhoNhatNhoHon5000 {

	public static void main(String[] args) {
		timSoNguyenDuongNhoNhat();
	}

	public static void timSoNguyenDuongNhoNhat() {
		final int SO_MAC_DINH = 0;
		final int SO_MUC = 5000;
		int tong = SO_MAC_DINH;
		int n = SO_MAC_DINH;
		while (n <= SO_MUC) {
			tong += n;
			if (tong > SO_MUC) {
				break;
			}
			n++;
		}
		System.out.println("Số cần tìm là: " + n);
	}

}
