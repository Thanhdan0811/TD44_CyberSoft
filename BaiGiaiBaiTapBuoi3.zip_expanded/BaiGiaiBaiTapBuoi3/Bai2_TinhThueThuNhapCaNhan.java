import java.util.Scanner;

public class Bai2_TinhThueThuNhapCaNhan {
	static final double THUE_SUAT_60_DAU = 0.05;
	static final double THUE_SUAT_60DEN120 = 0.1;
	static final double THUE_SUAT_120DEN216 = 0.15;
	static final double THUE_SUAT_216DEN384 = 0.2;
	static final double THUE_SUAT_384DEN624 = 0.25;
	static final double THUE_SUAT_624DEN960 = 0.3;
	static final double THUE_SUAT_TREN960 = 0.35;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double tongThuNhap1Nam;
		int soNguoiPhuThuoc;
		double thueThuNhapCaNhan;

		System.out.println("Nhập họ tên: ");
		String hoTen = scan.nextLine();
		System.out.println("Nhập tổng thu nhập 1 năm: (đơn vị: triệu VNĐ)");
		tongThuNhap1Nam = Double.parseDouble(scan.nextLine());
		System.out.println("Nhập số người phụ thuộc: ");
		soNguoiPhuThuoc = Integer.parseInt(scan.nextLine());
		if (soNguoiPhuThuoc < 0) {
			soNguoiPhuThuoc = 0;
		}
		thueThuNhapCaNhan = tinhThueThuNhapCaNhan(tongThuNhap1Nam, soNguoiPhuThuoc);
		System.out.println("Thuế thu nhập cá nhân" + " anh/chị " + hoTen + " phải trả là: " + thueThuNhapCaNhan + " triệu VNĐ");

		scan.close();
	}

	public static double tinhThueThuNhapCaNhan(double tongThuNhap1Nam, int soNguoiPhuThuoc) {
		double thueCaNhan;
		double thuNhapChiuThue = tongThuNhap1Nam - 4 - soNguoiPhuThuoc * 1.6;
		if (thuNhapChiuThue <= 60) {
			thueCaNhan = thuNhapChiuThue * THUE_SUAT_60_DAU;
		} else if (thuNhapChiuThue > 60 && thuNhapChiuThue <= 120) {
			thueCaNhan = 60 * THUE_SUAT_60_DAU + (thuNhapChiuThue - 60) * THUE_SUAT_60DEN120;
		} else if (thuNhapChiuThue > 120 && thuNhapChiuThue <= 216) {
			thueCaNhan = 60 * THUE_SUAT_60_DAU + (120 - 60) * THUE_SUAT_60DEN120
					+ (thuNhapChiuThue - 120) * THUE_SUAT_120DEN216;
		} else if (thuNhapChiuThue > 216 && thuNhapChiuThue <= 384) {
			thueCaNhan = 60 * THUE_SUAT_60_DAU + (120 - 60) * THUE_SUAT_60DEN120 + (216 - 120) * THUE_SUAT_120DEN216
					+ (thuNhapChiuThue - 216) * THUE_SUAT_216DEN384;
		} else if (thuNhapChiuThue > 384 && thuNhapChiuThue <= 624) {
			thueCaNhan = 60 * THUE_SUAT_60_DAU + (120 - 60) * THUE_SUAT_60DEN120 + (216 - 120) * THUE_SUAT_120DEN216
					+ (384 - 216) * THUE_SUAT_216DEN384 + (thuNhapChiuThue - 384) * THUE_SUAT_384DEN624;
		} else if (thuNhapChiuThue > 624 && thuNhapChiuThue <= 960) {
			thueCaNhan = 60 * THUE_SUAT_60_DAU + (120 - 60) * THUE_SUAT_60DEN120 + (216 - 120) * THUE_SUAT_120DEN216
					+ (384 - 216) * THUE_SUAT_216DEN384 + (624 - 384) * THUE_SUAT_384DEN624
					+ (thuNhapChiuThue - 624) * THUE_SUAT_624DEN960;
		} else {
			thueCaNhan = 60 * THUE_SUAT_60_DAU + (120 - 60) * THUE_SUAT_60DEN120 + (216 - 120) * THUE_SUAT_120DEN216
					+ (384 - 216) * THUE_SUAT_216DEN384 + (624 - 384) * THUE_SUAT_384DEN624
					+ (960 - 624) * THUE_SUAT_624DEN960 + (thuNhapChiuThue - 960) * THUE_SUAT_TREN960;
		}
		return thueCaNhan;
	}
}
