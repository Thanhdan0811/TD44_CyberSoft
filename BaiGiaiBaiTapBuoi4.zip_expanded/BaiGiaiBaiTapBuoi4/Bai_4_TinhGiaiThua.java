import java.util.Scanner;

public class Bai_4_TinhGiaiThua {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		tinhGiaiThua(scan);
	}

	public static void tinhGiaiThua(Scanner scan) {
		final int SO_MAC_DINH = 0;
		final int SO_MOT = 1;
		int giaiThua = SO_MOT;
		System.out.println("Nhập giới hạn giai thừa : ");
		int n = Integer.parseInt(scan.nextLine());
		if (n > 0) {
			for (int i = SO_MOT; i <= n; i++) {
				giaiThua *= i;
				if (n == SO_MAC_DINH) {
					giaiThua = SO_MOT;
				}
			}
			System.out.println("Giai thừa đến n là : " + giaiThua);
		} else {
			System.out.println("Số nhập không hợp lệ!");
		}
	}
}
