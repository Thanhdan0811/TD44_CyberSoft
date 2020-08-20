package cybersoft.td44;
import java.util.Scanner;

public class XeBus {
	public String maSoKhung;
	public String soDangKy;
	public String mauXe;
	public float soMaLucDinhDanh;
	public byte soChoNgoi;
	public int tuyenXe;
	public String hopTacXa;
	
	public XeBus() {
		maSoKhung = "Chưa xác định";
		soDangKy= "Chưa đăng ký";
		mauXe = "xanh lá";
//		soMaLucDinhDanh = 0;
//		soChoNgoi = 0;
//		tuyenXe = 0;
		hopTacXa = "19/5";
	}
	
	public XeBus(String soDangKy, byte soChoNgoi) {
		this(); // Gọi Constructor rỗng trước
		this.soDangKy = soDangKy;
		this.soChoNgoi = soChoNgoi;
	}
	
	// Phương thức
	
	void inThongTin() {
		System.out.println("THÔNG TIN XE BUS: ");
		System.out.println("Mã số khung:\t" + maSoKhung);
		System.out.println("Số đăng ký:\t" + soDangKy);
		System.out.println("Màu xe:\t" + mauXe);
		System.out.println("Số mã lực:\t" + soMaLucDinhDanh);
		System.out.println("Số chỗ ngồi:\t" + soChoNgoi);
		System.out.println("Tuyến xe:\t" + tuyenXe);
		System.out.println("Hợp tác xã:\t" + hopTacXa);
	}
	
	void nhapThongTin(Scanner scan) {
		/*
		 * Cho phép người dùng nhập vào thông tin
		 */
		System.out.print("THÔNG TIN XE BUS: ");
		System.out.print("Mã số khung:\t");
		this.maSoKhung = scan.nextLine();
		System.out.print("Số đăng ký:\t");
		this.soDangKy = scan.nextLine();
		System.out.print("Màu xe:\t\t");
		mauXe = scan.nextLine();
		System.out.print("Số mã lực:\t");
		this.soMaLucDinhDanh = Float.parseFloat(scan.nextLine());
		System.out.print("Số chỗ ngồi:\t");
		this.soChoNgoi = Byte.parseByte(scan.nextLine());
		System.out.print("Tuyến xe:\t");
		this.tuyenXe = Integer.parseInt(scan.nextLine());
		System.out.print("Hợp tác xã:\t");
		this.hopTacXa = scan.nextLine();
		
	}
}
