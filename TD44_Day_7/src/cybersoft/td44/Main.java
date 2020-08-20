package cybersoft.td44;
import java.util.Scanner;
import cybersoft.td44.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Demo Đối tượng
		 */
		Scanner scan = new Scanner(System.in);
		XeBus xeBus;
		xeBus = new XeBus("59-N9-333.33", (byte)50);
		xeBus.nhapThongTin(scan);
//		System.out.println(xeBus.soDangKy);
		
		xeBus.inThongTin();
		
		
		
		
		
		
		
		
		
		//		NhanVien nhanVien;
//		nhanVien  = new NhanVien("4564787","Dan");
		
//		nhanVien.tinhLuong(/*Tham so*/);
//		nhanVien.tinhTongNgayLam();
		
		
//
//		System.out.println("Tên nhân viên " + nhanVien.tenNv);
//		System.out.println("Số Cmnd : " + nhanVien.soCmnd);
//		
//		System.out.println("Kết thúc chương trình");
		
//		SinhVien sinhVien;
//		sinhVien = new SinhVien();
//		
//		sinhVien.tenSv = "Tuan";
//		
//		System.out.println("Tên sinh viên : " + sinhVien.tenSv);
//				
//		System.out.println("Ngành học : " + sinhVien.nganhHocSv);
	}

}
