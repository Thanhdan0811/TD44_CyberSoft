import java.util.Scanner;

public class Bai4_TinhTienGrab {
	final static double KMDAUTIEN_GRABCAR = 8000, KMDAUTIEN_GRABSUV = 9000, KMDAUTIEN_GRABBLACK = 10_000;
	final static double KM1_19_GRABCAR = 7500, KM1_19_GRABSUV = 8500, KM1_19_GRABBLACK = 9500;
	final static double KM_TREN19_GRABCAR = 7000, KM_TREN19_GRABSUV = 8000, KM_TREN19_GRABBLACK = 9000;
	final static double GIACHOXE_GRABCAR = 2000, GIACHOXE_GRABSUV = 3000, GIACHOXE_GRABBLACK = 3500;

	public static void main(String[] args) {
		// Đầu vào:
		Scanner scan = new Scanner(System.in);
		int loaiXe = 0, thoiGianCho = 0;
		double soKmDiDuoc = 0;

		// Nhập sữ liệu:
		System.out.println("---CHƯƠNG TRÌNH TÍNH TIỀN GRAB---");
		System.out.println("Mời bạn nhập số Km đi được: ");
		soKmDiDuoc = Double.parseDouble(scan.next());

		System.out.println("Mời bạn nhập thời gian chờ: ");
		thoiGianCho = Integer.parseInt(scan.next());

		// Menu
		System.out.println("Bạn muốn tính tiền loại Grab nào ?");
		System.out.println("1. GrabCar");
		System.out.println("2. Grab SUV");
		System.out.println("3. GrabBlack");
		System.out.println("Mời bạn chọn 1 trong 3 loại Grab: ( 1 or 2 or 3)");
		loaiXe = scan.nextInt();

		// Hàm xử lý
		xuLy(soKmDiDuoc, thoiGianCho, loaiXe);

		scan.close();
	}

	public static void xuLy(double soKmDiDuoc, int thoiGianCho, int loaiXe) {
		// Xử lý và xuất kết quả:
		if (soKmDiDuoc > 0 && thoiGianCho >= 0) {
			switch (loaiXe) {
			case 1:
			case 2:
			case 3:
				System.out.println("Tổng tiền đi được là: " + giaTheoLoaiXe(loaiXe, soKmDiDuoc, thoiGianCho) + " VNĐ");
				break;
			default:
				System.out.println("Bạn nhập sai loại xe! Vui lòng chạy lại chương trình và chọn lại !");
				break;

			}
		} else {
			System.out.println("Vui lòng nhập lại thông tin !");
		}
	}

	public static double bangGia(double soKm, double giaMoCua, double donGia1, double donGia2, int thoiGianCho,
			double giaChoXe) {
		// Đầu vào
		double tongTien = 0;

		// Xử lý
		if (soKm <= 1) {
			if (thoiGianCho >= 3) { // trường hợp thời gian chờ > 3 thì mới tính tiền chờ
				tongTien = giaMoCua + (thoiGianCho / 3) * giaChoXe;
				return tongTien;
			}
			tongTien = giaMoCua;
		}

		if (soKm <= 19) {
			if (thoiGianCho >= 3) {
				tongTien = giaMoCua + (soKm - 1) * donGia1 + (thoiGianCho / 3) * giaChoXe;
				return tongTien;
			}
			tongTien = giaMoCua + (soKm - 1) * donGia1;
		}

		if (soKm > 19) {
			if (thoiGianCho >= 3) {
				tongTien = giaMoCua + (soKm - 1) * donGia1 + (soKm - 19) * donGia2 + (thoiGianCho / 3) * giaChoXe;
				return tongTien;
			}
			tongTien = giaMoCua + (soKm - 1) * donGia1 + +(soKm - 19) * donGia2;
		}

		return tongTien;
	}

	public static double giaTheoLoaiXe(int loaiXe, double soKm, int thoiGianCho) {
		double tongTien = 0;
		switch (loaiXe) {
		case 1: // GrabCar
			tongTien = bangGia(soKm, KMDAUTIEN_GRABCAR, KM1_19_GRABCAR, KM_TREN19_GRABCAR, thoiGianCho,
					GIACHOXE_GRABCAR);
			break;
		case 2: // GrabSUV
			tongTien = bangGia(soKm, KMDAUTIEN_GRABSUV, KM1_19_GRABSUV, KM_TREN19_GRABSUV, thoiGianCho,
					GIACHOXE_GRABSUV);
			break;
		case 3: // GrabBlack
			tongTien = bangGia(soKm, KMDAUTIEN_GRABBLACK, KM1_19_GRABBLACK, KM_TREN19_GRABBLACK, thoiGianCho,
					GIACHOXE_GRABBLACK);
			break;
		}
		return tongTien;
	}

}
