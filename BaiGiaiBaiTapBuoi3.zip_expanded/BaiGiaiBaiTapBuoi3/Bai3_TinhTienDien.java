import java.util.Scanner;

/*
 * Nhập Tên, số Kw
 * hằng số  int GIA_DM_0 = 500, GIA_DM_1 = 650, GIA_DM_2 = 850, GIA_DM_3 = 1100, GIA_DM_4 = 1300;
 * 			int DM_1 = 50, DM_2 = 100, DM_3 = 200, DM_4 = 350;
 * 50 kw đầu giá 500: soKw* GIA_DM_0
 * 50 kw kế giá 650: (DM_1 * GIA_DM_0) + (soKw - DM_1)*GIA_DM_1;
 * 100 kw kế giá 850: (DM_1 * GIA_DM_0) + (DM_2 - DM_1)*GIA_DM_1 + (soKw - DM_2)*GIA_DM_2
 * 150 kw kế tiếp giá 1100: (DM_1 * GIA_DM_0) + (DM_2 - DM_1)*GIA_DM_1 + (DM_3 - DM_2)*GIA_DM_2 + (soKw - DM_3)*GIA_DM_3
 * Còn lại 1300: (DM_1 * GIA_DM_0) + (DM_2 - DM_1)*GIA_DM_1 + (DM_3 - DM_2)*GIA_DM_2 + (DM_4 - DM_3)*GIA_DM_3+(soKw - DM_4)*GIA_DM_43

 * Xuất Tiền điện phải trả
 * */

public class Bai3_TinhTienDien {
	static final int GIA_DM_0 = 500, GIA_DM_1 = 650, GIA_DM_2 = 850, GIA_DM_3 = 1100, GIA_DM_4 = 1300;
	static final int DM_1 = 50, DM_2 = 100, DM_3 = 200, DM_4 = 350;

	public static void main(String[] args) {
		String hoTen;
		int soKwDien;

		Scanner scan = new Scanner(System.in);

		System.out.print("Nhập tên khách hàng: ");
		hoTen = scan.nextLine();
		System.out.print("Số Kw điện tiêu thụ: ");
		soKwDien = Integer.parseInt(scan.nextLine());

		System.out.println("***** BẢNG TÍNH TIỀN ĐIỆN ******");
		System.out.println("Tên khách hàng: " + hoTen);
		System.out.println("Số Kw tiêu thụ: " + soKwDien);

		XuLy(soKwDien);

		scan.close();
	}

	public static int tinhDinhMuc0(int soKw) {
		int thanhTien;
		thanhTien = soKw * GIA_DM_0;
		return thanhTien;
	}

	public static int tinhDinhMuc1(int soKw) {
		int thanhTien;
		thanhTien = tinhDinhMuc0(DM_1);
		thanhTien += (soKw - DM_1) * GIA_DM_1;
		return thanhTien;
	}

	public static int tinhDinhMuc2(int soKw) {
		int thanhTien;
		thanhTien = tinhDinhMuc1(DM_2);
		thanhTien += (soKw - DM_2) * GIA_DM_2;
		return thanhTien;
	}

	public static int tinhDinhMuc3(int soKw) {
		int thanhTien;
		thanhTien = tinhDinhMuc2(DM_3);
		thanhTien += (soKw - DM_3) * GIA_DM_3;
		return thanhTien;
	}

	public static int tinhDinhMuc4(int soKw) {
		int thanhTien;
		thanhTien = tinhDinhMuc3(DM_4);
		thanhTien += (soKw - DM_4) * GIA_DM_4;
		return thanhTien;
	}

	public static void XuLy(int soKw) {
		int soTienThanhToan;
		System.out.println("\n   CHI TIẾT \t\t\t THÀNH TIỀN");
		if (soKw <= DM_1) {
			soTienThanhToan = tinhDinhMuc0(soKw);
			System.out.println(DM_1 + "  đầu (" + GIA_DM_0 + "đ/Kw): \t\t " + soKw * GIA_DM_0 + " VNĐ.");
		} else if ((soKw > DM_1) && (soKw <= DM_2)) {
			soTienThanhToan = tinhDinhMuc1(soKw);
			System.out.println(DM_1 + "  đầu (" + GIA_DM_0 + "đ/Kw): \t\t " + (DM_1 * GIA_DM_0) + " VNĐ.");
			System.out.println(DM_1 + " kế tiếp (" + GIA_DM_1 + "đ/Kw): \t\t " + ((soKw - DM_1) * GIA_DM_1) + " VNĐ.");
		} else if ((soKw > DM_2) && (soKw <= DM_3)) {
			System.out.println(DM_1 + "  đầu (" + GIA_DM_0 + "đ/Kw): \t\t " + (DM_1 * GIA_DM_0) + " VNĐ.");
			System.out.println(DM_1 + " kế (" + GIA_DM_1 + "đ/Kw): \t\t " + ((DM_2 - DM_1) * GIA_DM_1) + " VNĐ.");
			System.out.println(DM_2 + " kế (" + GIA_DM_2 + "đ/Kw): \t\t " + ((soKw - DM_2) * GIA_DM_2) + " VNĐ.");
			soTienThanhToan = tinhDinhMuc2(soKw);
		} else if ((soKw > DM_3) && (soKw <= DM_4)) {
			System.out.println(DM_1 + "  đầu (" + GIA_DM_0 + "đ/Kw): \t\t " + (DM_1 * GIA_DM_0) + " VNĐ.");
			System.out.println(DM_1 + " kế (" + GIA_DM_1 + "đ/Kw): \t\t " + ((DM_2 - DM_1) * GIA_DM_1) + " VNĐ.");
			System.out.println(DM_2 + " kế (" + GIA_DM_2 + "đ/Kw): \t\t " + ((DM_3 - DM_2) * GIA_DM_2) + " VNĐ.");
			System.out.println((DM_3 - DM_1) + " kế (" + GIA_DM_3 + "đ/Kw): \t\t " + ((soKw - DM_3) * GIA_DM_3) + " VNĐ.");
			soTienThanhToan = tinhDinhMuc3(soKw);
		} else {
			System.out.println(DM_1 + "  đầu (" + GIA_DM_0 + "đ/Kw): \t\t " + (DM_1 * GIA_DM_0) + " VNĐ.");
			System.out.println(DM_1 + " kế (" + GIA_DM_1 + "đ/Kw): \t\t " + ((DM_2 - DM_1) * GIA_DM_1) + " VNĐ.");
			System.out.println(DM_2 + " kế (" + GIA_DM_2 + "đ/Kw): \t\t " + ((DM_3 - DM_2) * GIA_DM_2) + " VNĐ.");
			System.out.println((DM_3 - DM_1) + " kế (" + GIA_DM_3 + "đ/Kw): \t\t " + ((DM_4 - DM_3) * GIA_DM_3) + " VNĐ.");
			System.out.println("Trên: " + DM_4 + "(" + GIA_DM_4 + "đ/Kw): \t\t " + ((soKw - DM_4) * GIA_DM_4) + " VNĐ.");
			soTienThanhToan = tinhDinhMuc4(soKw);
		}

		System.out.println("\nTiền điện phải trả: \t\t " + soTienThanhToan + " VNĐ.");
	}

}
