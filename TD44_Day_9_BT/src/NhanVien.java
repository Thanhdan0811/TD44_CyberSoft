import java.util.Scanner;

public class NhanVien {
	// Properties
	private String hoTen;
	private String maNhanVien;
	private String ngaySinh;
	private String diaChi;
	private float heSoLuong;
	private double luongCoBan;
	private double tongLuong;
	// Constructor 
	public NhanVien() {
		this.hoTen = "";
		this.maNhanVien = "";
		this.ngaySinh = "";
		this.diaChi = "";
	}
	public NhanVien(String hoTen) {
		this();
		setHoTen(hoTen);
	}
	public NhanVien(String hoTen, String maNv) {
		this();
		setHoTen(hoTen);
		setMaNhanVien(maNv);
	}
	public NhanVien(String hoTen, String maNv, String ngaySinh) {
		this(hoTen, maNv);
		setNgaySinh(ngaySinh);
	}
	public void setHeSoLuong(float heSoLuong) {
		if(heSoLuong < 0) return;
		this.heSoLuong = heSoLuong;
	}
	public void setLuongCoBan(double luongCoBan) {
		if(luongCoBan < 0) return;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien(String hoTen, String maNv, String ngaySinh, String diaChi) {
		this(hoTen, maNv, ngaySinh);
		setDiaChi(diaChi);
	}
	public NhanVien(String hoTen, String maNv, float heSoLuong, double luongCoBan) {
		this(hoTen, maNv);
		this.heSoLuong = heSoLuong;
		this.luongCoBan =  luongCoBan;
	}
	// Getters / Setters
	public String getHoTen() {
		return hoTen;
	}
	public void   setHoTen(String hoTen) {
		if(hoTen == null) return;
		
		hoTen = hoTen.trim();
		if("".equalsIgnoreCase(hoTen)) return;
		
		for(int i = 0; i < hoTen.length(); i++) {
			int codeChar = hoTen.codePointAt(i);
			if( !(65 <= codeChar && codeChar <= 90  ||  
				  97 <= codeChar && codeChar <= 122 || 
				  codeChar == 32) ) {
				System.out.println("Bạn nên nhập chỉ nhập chữ");
				return;
			}
		}
		this.hoTen = hoTen;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNV) {
		if(maNV == null) return;
		maNV = maNV.trim();
		if("".equalsIgnoreCase(hoTen)) return;
		for(int i = 0; i < maNV.length(); i++) {
			int codeChar = maNV.codePointAt(i);
			if( !(65 <= codeChar && codeChar <= 90  ||  
				  97 <= codeChar && codeChar <= 122 ||
				  48 <= codeChar && codeChar <= 57)) {
				System.out.println("Bạn nên nhập chỉ nhập chữ và số");
				return;
			}
		}
		this.maNhanVien = maNV;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		if(ngaySinh == null) return;
		ngaySinh = ngaySinh.trim();
		if("".equalsIgnoreCase(ngaySinh)) return;
		if(ngaySinh.length() == 8) {
			for(int i = 0; i < ngaySinh.length(); i++) {
				int codeChar = ngaySinh.codePointAt(i);
				if( !(48 <= codeChar && codeChar <= 57) ) {
					System.out.println("Bạn nên nhập chỉ nhập số");
					return;
				}
			}
			this.ngaySinh = "" + ngaySinh.charAt(0) + ngaySinh.charAt(1) + "/"
					   		+ ngaySinh.charAt(2) + ngaySinh.charAt(3) + "/" 
					   		+ ngaySinh.substring(4);
			return;
		}
		if(ngaySinh.length() == 10) {
			for(int i = 0; i < ngaySinh.length(); i++) {
				int codeChar = ngaySinh.codePointAt(i);
				if(i != 2 && i != 5) {
					if( !(48 <= codeChar && codeChar <= 57) ) {
						System.out.println("Bạn nên nhập chỉ nhập số");
						return;
					}
				} else if( i == 2 || i == 5) {
					if(!(codeChar == 47)) return;
				}
			} 
			this.ngaySinh = ngaySinh;
			return;
		}
		return;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		if(diaChi == null) return;
		if("".equalsIgnoreCase(diaChi)) return;
		this.diaChi = diaChi;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public double getTongLuong() {
		return this.tongLuong;
	}
	// Methods
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhập vào thông tin nhân viên");
		System.out.print("Họ tên : ");
		setHoTen(scan.nextLine());
		System.out.print("Mã số : ");
		setMaNhanVien(scan.nextLine());
		System.out.print("Ngày sinh có dạng ngay/thang/nam hoặc nnttnnnn: ");
		setNgaySinh(scan.nextLine());
		System.out.print("Địa chỉ : ");
		setDiaChi(scan.nextLine());
		System.out.print("Hệ Số Lương : ");
		setHeSoLuong(Float.parseFloat(scan.nextLine()));
		System.out.print("Lương cơ bản : ");
		setLuongCoBan(Double.parseDouble(scan.nextLine()));
	}
	public void xuatThongTin() {
		System.out.print("\nHọ tên : " + this.getHoTen());
		System.out.print("\tMã số : " + this.getMaNhanVien());
		System.out.print("\tNgày sinh : " + this.getNgaySinh());
		System.out.print("\tĐịa chỉ : " + this.getDiaChi());
		System.out.print("\tHệ Số Lương : " + this.getHeSoLuong());
		System.out.print("\tLương cơ bản : " + this.getLuongCoBan());
		System.out.print("\tLương  : " + this.getTongLuong());
	}
	public double tinhLuong() {
		this.tongLuong = this.luongCoBan * this.heSoLuong;
		return this.tongLuong;
	}
}
