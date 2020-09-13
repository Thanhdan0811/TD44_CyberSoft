import java.util.Scanner;

public class Bai_6_TroChoiDoanSo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doanSo(scan);

	}

	public static void doanSo(Scanner scan) {
		final int SO_NHAN = 999;
		final int SO_CONG = 1;
		final int SO_MAC_DINH = 0;
		int random = (int) (Math.random() * SO_NHAN + SO_CONG);
		// System.out.println(random);
		int soDoan;
		int soLanDoan = SO_MAC_DINH;
		do {
			System.out.println("Mời đoán số");
			soDoan = Integer.parseInt(scan.nextLine());
			soLanDoan++;
			if (soDoan > random) {
				System.out.println("Số lớn hơn số bí mật");
			} else if (soDoan < random) {
				System.out.println("Số nhỏ hơn số bí mật");

			} else {
				System.out.println("Đã đúng");
				System.out.println("Số random là : " + random);
				System.out.println("Số lần đoán " + soLanDoan);
				break;
			}
		} while (true);
	}
}
//soDoan != random