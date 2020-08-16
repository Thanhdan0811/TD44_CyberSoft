import java.math.BigDecimal;
import java.util.Scanner;

public class BT_Buoi_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		inKetQuaTuyenSinh();
//		tinhThueCaNhan();
		tinhTienDien();
//		tinhTienGrab();
		scan.close();
	}
	
	// Hàm Quản Lý Tuyển Sinh
	public static void inKetQuaTuyenSinh() {
		Scanner scan = new Scanner(System.in);
		float diemTong, diemChuan, diemMon_1, diemMon_2, diemMon_3; 
		String khuVuc; 
		byte doiTuongDuThi;
		System.out.print("Điểm chuẩn :\t");
		diemChuan = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm môn thứ nhất :\t");
		diemMon_1 = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm môn thứ hai :\t");
		diemMon_2 = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm môn thứ ba :\t");
		diemMon_3 = Float.parseFloat(scan.nextLine());
		System.out.print("Khu vực ưu tiên :\t");
		khuVuc = scan.nextLine();
		System.out.print("Đối tượng ưu tiên :\t");
		doiTuongDuThi = Byte.parseByte(scan.nextLine());
		// Tổng điểm
		diemTong = diemMon_1 + diemMon_2 + diemMon_3;
		// Kiểm tra điểm ưu tiên khu vực
		switch(khuVuc) {
		case "A":
		case "a":
			diemTong += 2;
			break;
		case "B":
		case "b":
			diemTong += 1;
			break;
		case "C":
		case "c":
			diemTong += 0.5;
			break;
		case "X":
		case "x":
			diemTong += 0;
			break;
		default:
			System.out.println("Bạn đã nhập sai khu vực");
			break;
		}
		
		// Kiểm tra điểm ưu tiên đối tượng
		switch(doiTuongDuThi) {
		case 1:
			diemTong += 2.5;
			break;
		case 2:
			diemTong += 1.5;
			break;
		case 3:
			diemTong += 1;
			break;
		case 0:
			diemTong += 0;
			break;
		default:
			System.out.println("Bạn đã nhập sai Đối tượng");
			break;
		}
		
		if(diemMon_1 > 0 && diemMon_2 > 0 && diemMon_3 > 0) {
			if(diemTong >= diemChuan) {
				System.out.println("Thí sinh đậu và tổng điểm là : " + diemTong);
				return;
			}
		}
		System.out.println("Thí sinh đã rớt và điểm tổng là : " + diemTong);
		
	}
	
	// Hàm tính thuế thu nhập cá nhân
	public static void tinhThueCaNhan() {
		Scanner scan = new Scanner(System.in);
		float tongThuNHapNam, thuNhapChiuThue;
		byte soNguoiPhuThuoc;
		String hoTen;
		System.out.print("Họ tên : ");
		hoTen = scan.nextLine();
		System.out.print("Tổng thu nhập trong năm :\t");
		tongThuNHapNam = Float.parseFloat(scan.nextLine());
		System.out.print("Số người phụ thuộc :\t");
		soNguoiPhuThuoc = Byte.parseByte(scan.nextLine());
		// TÍnh thu thập chịu thuế
		thuNhapChiuThue =  tongThuNHapNam - 4000000 - soNguoiPhuThuoc * 1600000;
		System.out.println("Thu nhập chịu thuế " + String.format("%.0f",thuNhapChiuThue));
		// Xét điều kiện tính ra thuế
		if(thuNhapChiuThue > 960000000) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.35) + " vnd");
		} else if(thuNhapChiuThue > 624000000) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.30) + " vnd");
		} else if(thuNhapChiuThue > 384000000) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.25) + " vnd");
		} else if(thuNhapChiuThue > 216000000) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.20) + " vnd");
		} else if(thuNhapChiuThue > 120000000) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.15) + " vnd");
		} else if(thuNhapChiuThue > 60000000) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.1) + " vnd");
		} else if(thuNhapChiuThue > 0) {
			System.out.println("Thuế thu nhập cá nhân là \t" + String.format("%.0f",thuNhapChiuThue * 0.05) + " vnd");
		}
	}

	// Hàm tính tiền điện
	public static void tinhTienDien() {
		Scanner scan = new Scanner(System.in);
		float soKW, tienDien;
		String hoTen;
		System.out.print("Họ tên : ");
		hoTen = scan.nextLine();
		System.out.print("Số KW điện :\t");
		soKW = Float.parseFloat(scan.nextLine());
		if(soKW > 50) { // nếu số điện lớn hơn 50Kw đầu
			tienDien = 50 * 500;
			soKW -= 50;
			if(soKW > 50) { // nếu số điện lớn hơn 50Kw tiếp theo
				tienDien += 50 * 650;
				soKW -= 50;
				if(soKW > 100) { // nếu số điện lớn hơn 100Kw tiếp theo
					tienDien += 100 * 850;
					soKW -= 100;
					if(soKW > 150) { // nếu số điện lớn hơn 150Kw tiếp theo
						tienDien += 150 * 1100;
						soKW -= 150;
						if(soKW > 0) {
							tienDien += soKW * 1300;
							System.out.println("Số tiền điện : " + tienDien);
							return;
						}
						System.out.println("Số tiền điện : " + tienDien);
						return;
					}
					System.out.println("Số tiền điện : " + (tienDien + soKW * 1100)); // nếu số điện nhỏ hơn 150kw kế tiếp
					return;
				}
				System.out.println("Số tiền điện : " + (tienDien + soKW * 850)); // nếu số điện nhỏ hơn 100kw tiếp theo
				return;
			}
			System.out.println("Số tiền điện : " + (tienDien + soKW * 650)); // nếu số điện nhỏ hơn 50kw tiếp theo
			return;
		}
		System.out.println("Số tiền điện : " + soKW * 500); // nếu số điện nhỏ hơn 50kw đầu
		return;
	}

	// Tính tiền Grab 
	public static void tinhTienGrab() {
		Scanner scan = new Scanner(System.in);
		int loaiGrab;
		float soKmDiDuoc, thoiGianCho, tongTien = 0;
		System.out.println("Chọn 1 trong 3 loại grab sau : \n\t1 : GrabCar \n\t2 : Grab SUV \n\t3 : GrabBlack ");
		System.out.print("Loại xe :");
		loaiGrab = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào số KM : ");
		soKmDiDuoc = Float.parseFloat(scan.nextLine());
		System.out.println("thời gian chờ : ");
		thoiGianCho = Float.parseFloat(scan.nextLine());
		switch(loaiGrab) {
			case 1: // GRAB CAR
				if(soKmDiDuoc > 19) { // chạy trên 19km, sẽ là tổng của 1km đầu + 18km tiếp theo + số km còn lại
					tongTien = 8000;
					tongTien += 18 * 7500;
					tongTien += (soKmDiDuoc - 19) * 7000 + (int)(thoiGianCho / 3) * 2000;
				} else if(soKmDiDuoc > 1) { // chạy từ 1 đến 19 km : 1km đầu + số km còn lại
					tongTien = 8000;
					tongTien += (soKmDiDuoc - 1) * 7500 + (int)(thoiGianCho / 3) * 2000;
				} else if(soKmDiDuoc <= 1) { // chạy ít hơm 1km 
					tongTien = soKmDiDuoc * 8000 + (int)(thoiGianCho / 3) * 2000;
				}
				break;
			case 2: // GRAB SUV
				if(soKmDiDuoc > 19) {
					tongTien = 9000;
					tongTien += 18 * 8500;
					tongTien += (soKmDiDuoc - 19) * 8000 + (int)(thoiGianCho / 3) * 3000;
				} else if(soKmDiDuoc > 1) {
					tongTien = 9000;
					tongTien += (soKmDiDuoc - 1) * 8500 + (int)(thoiGianCho / 3) * 3000;
				} else if(soKmDiDuoc <= 1) {
					tongTien = soKmDiDuoc * 9000 + (int)(thoiGianCho / 3) * 3000;
				}
				break;
			case 3: // GRAB BLACK
				if(soKmDiDuoc > 19) {
					tongTien = 10000;
					tongTien += 18 * 9500;
					tongTien += (soKmDiDuoc - 19) * 9000 + (int)(thoiGianCho / 3) * 3500;
				} else if(soKmDiDuoc > 1) {
					tongTien = 10000;
					tongTien += (soKmDiDuoc - 1) * 9500 + (int)(thoiGianCho / 3) * 3500;
				} else if(soKmDiDuoc <= 1) {
					tongTien = soKmDiDuoc * 10000 + (int)(thoiGianCho / 3) * 3500;
				}
				break;
			default : 
				System.out.println("Bạn đã nhập sai dịch vụ grab");
				break;
		}
		System.out.println("Tổng tiền : " + tongTien);
	}

}