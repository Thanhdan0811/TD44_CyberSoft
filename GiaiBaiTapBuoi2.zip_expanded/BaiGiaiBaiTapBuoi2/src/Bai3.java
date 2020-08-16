import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// ĐỌC SỐ CÓ 3 CHỮ SỐ:

		Scanner scan = new Scanner(System.in);

		int soNhap;
		int hangTram, hangChuc, hangDV;
		String docHangTram = "";
		String docHangChuc = "";
		String docHangDV = "";

		System.out.print("Nhập vào một số có 3 chữ số: ");
		soNhap = Integer.parseInt(scan.nextLine());

		hangTram = soNhap / 100;
		hangChuc = soNhap % 100 / 10;
		hangDV = soNhap % 10;

		// đọc số hàng trăm
		switch (hangTram) {
		case 1:
			docHangTram = "Một trăm ";
			break;
		case 2:
			docHangTram = "Hai trăm ";
			break;
		case 3:
			docHangTram = "Ba trăm ";
			break;
		case 4:
			docHangTram = "Bốn trăm ";
			break;
		case 5:
			docHangTram = "Năm trăm ";
			break;
		case 6:
			docHangTram = "Sáu trăm ";
			break;
		case 7:
			docHangTram = "Bảy trăm ";
			break;
		case 8:
			docHangTram = "Tám trăm ";
			break;
		case 9:
			docHangTram = "Chín trăm ";
			break;
		}

		// Đọc hàng chục
		switch (hangChuc) {
		case 0:
			if (hangDV != 0) {
				docHangChuc = "linh ";
			} else {

				docHangChuc = "";
			}
			break;
		case 1:
			docHangChuc = "mười ";
			break;
		case 2:
			docHangChuc = "hai mươi ";
			break;
		case 3:
			docHangChuc = "ba mươi ";
			break;
		case 4:
			docHangChuc = "bốn mươi ";
			break;
		case 5:
			docHangChuc = "năm mươi ";
			break;
		case 6:
			docHangChuc = "sáu mươi ";
			break;
		case 7:
			docHangChuc = "bảy mươi ";
			break;
		case 8:
			docHangChuc = "tám mươi ";
			break;
		case 9:
			docHangChuc = "chín mươi ";
			break;

		}
		// đọc hàng đơn vị
		switch (hangDV) {
		case 0:
			docHangDV = "";
			break;
		case 1:
			if (hangChuc == 0 || hangChuc == 1) {
				docHangDV = "một.";

			} else {

				docHangDV = "mốt.";
			}
			break;
		case 4:
			if (hangChuc == 1) {
				docHangDV = "bốn.";

			} else {

				docHangDV = "tư.";
			}
			break;
		case 5:
			if (hangChuc != 0) {
				docHangDV = "lăm.";

			} else {

				docHangDV = "năm.";
			}
			break;
		case 2:
			docHangDV = "hai.";
			break;
		case 3:
			docHangDV = "ba.";
			break;
		case 6:
			docHangDV = "sáu.";
			break;
		case 7:
			docHangDV = "bảy.";
			break;
		case 8:
			docHangDV = "tám.";
			break;
		case 9:
			docHangDV = "chín.";
			break;
		}
		if (soNhap >= 100 && soNhap <= 999) {
			System.out.println(docHangTram + "" + docHangChuc + "" + docHangDV);
		} else {

			System.out.println("Số không hợp lệ.");
		}
	}

}
