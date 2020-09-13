import java.util.Scanner;
public class TaiKhoan {
	private String soTaiKhoan;
	private String tenTaiKhoan;
	private double soDuTaiKhoan;
	public TaiKhoan() {
		this.soTaiKhoan = "";
		this.tenTaiKhoan = "";
	}
	public TaiKhoan(String tenTK) {
		this();
		this.tenTaiKhoan = tenTK;
	}
	
	// Getters / Setters 
	public String getSoTaiKhoan() {
		return this.soTaiKhoan ;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public double getSoDuTaiKhoan() {
		return soDuTaiKhoan;
	}
	
	// Phương thức
	
	public void napTien(Scanner scan) {
		System.out.print("Số tiền nạp vào : ");
		this.soDuTaiKhoan += this.soDuTaiKhoan + Integer.parseInt(scan.nextLine());
	}

	public void rutTien(Scanner scan) {
		float phuPhi = 1100;
		System.out.print("Số tiền rut vào : ");
		this.soDuTaiKhoan += this.soDuTaiKhoan - phuPhi - Integer.parseInt(scan.nextLine());
	}

	
	
	public void nhapThongTinTK(Scanner scan) {
		System.out.println("********* Nhập thông tin tài khoản ******** ");
		System.out.print("Tên tài khoản : ");
		this.tenTaiKhoan = scan.nextLine();
		System.out.print("So tài khoản : ");
		this.soTaiKhoan = scan.nextLine();
		System.out.print("so Du tai khoan : ");
		this.soDuTaiKhoan = Double.parseDouble(scan.nextLine());
	}
	
	public void xuatThongTinTK() {
		System.out.println("********* Thông tin tài khoản ******** ");
		System.out.println("Tên tài khoản : " + this.tenTaiKhoan);
		System.out.println("Số tài khoản : " + this.soTaiKhoan);
		System.out.println("Số dư tài khoản : " + this.soDuTaiKhoan);
	}
	
	public void chuyenKhoan(Scanner scan) {
		float phuPhi = 1100;
		System.out.println("Số tiền cần chuyển : ");
		this.soDuTaiKhoan += this.soDuTaiKhoan - phuPhi - Integer.parseInt(scan.nextLine());
	}
}
