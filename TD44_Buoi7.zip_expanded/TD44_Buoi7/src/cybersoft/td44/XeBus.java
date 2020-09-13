package cybersoft.td44;
import java.util.Scanner;

public class XeBus {
	// thuộc tính
	protected String maSoKhung;
	String soDangKy;
	String mauXe;
	float soMaLucDinhDanh;
	byte soChoNgoi;
	int tuyenXe;
	String hopTacXa;
	
	// phương thức khởi tạo
	public XeBus() {
		maSoKhung = "chưa xác định";
		soDangKy = "chưa đăng ký";
		mauXe = "xanh lá";
		hopTacXa = "HTX 19/5";
	}
	
	public XeBus(String soDangKy, byte soChoNgoi) {
		this();
		this.soDangKy = soDangKy;
		this.soChoNgoi = soChoNgoi;
	}
	
	// phương thức
	void inThongTin() {
		System.out.println("THÔNG TIN XE BUS: ");
		System.out.println("Mã số khung:\t" + maSoKhung);
		System.out.println("Số đăng ký:\t" + soDangKy);
		System.out.println("Màu xe:\t\t" + mauXe);
		System.out.println("Số mã lực:\t" + soMaLucDinhDanh);
		System.out.println("Số chỗ ngồi\t" + soChoNgoi);
		System.out.println("Tuyến xe:\t" + tuyenXe);
		System.out.println("Hợp tác xã:\t" + hopTacXa);
	}
	
	void nhapThongTin(Scanner scanner) {
		/*
		 * Cho phép người dùng
		 * nhập thông tin từ bàn phím
		 */
		System.out.println("NHẬP THÔNG TIN: ");
		System.out.print("Mã số khung:\t");
		maSoKhung = scanner.nextLine();
		System.out.print("Số đăng ký:\t");
		soDangKy =  scanner.nextLine();
		System.out.print("Màu xe:\t\t");
		mauXe = scanner.nextLine();
		System.out.print("Số mã lực:\t");
		soMaLucDinhDanh = Float.parseFloat(scanner.nextLine());
		System.out.print("Số chỗ ngồi\t");
		soChoNgoi = Byte.parseByte(scanner.nextLine());
		System.out.print("Tuyến xe:\t");
		tuyenXe = Integer.parseInt(scanner.nextLine());
		System.out.print("Hợp tác xã:\t");
		hopTacXa = scanner.nextLine();
	}
}
