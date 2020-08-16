import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int thang;
		int nam;
		int demNgay = 0;

		System.out.print("Mời nhập vào tháng bạn muốn kiểm tra: ");
		thang = Integer.parseInt(scan.nextLine());
		System.out.print("Mời nhập vào năm bạn muốn kiểm tra: ");
		nam = Integer.parseInt(scan.nextLine());

		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			demNgay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			demNgay = 30;
			break;
		case 2:
			if (nam % 100 == 0 && nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0) {
				demNgay = 29;

			} else {
				demNgay = 28;
			}

		}
		if (thang > 0 && thang <= 12) {
			System.out.println("Tháng " + thang + " năm " + nam + " có " + demNgay + " ngày.");

		} else {
			System.out.println("Tháng không hợp lệ.");
		}

	}

}
