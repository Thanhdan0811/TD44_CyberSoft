package BaiTapNganHang;

final public class TaiKhoan implements INhap, IXuat {
	// Instance variables
	private int soTaiKhoan = 0;
	private String tenTaiKhoan;
	private double soTienTaiKhoan;

	public int getSoTaiKhoan() {
		return soTaiKhoan;
	}

	// Getter, Setter methods
	public void setSoTaiKhoan(int _soTaiKhoan) {
		this.soTaiKhoan = _soTaiKhoan;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String _tenTaiKhoan) {
		this.tenTaiKhoan = _tenTaiKhoan;
	}

	public double getSoTienTaiKhoan() {
		return soTienTaiKhoan;
	}

	public void setSoTienTaiKhoan(double _soTienTaiKhoan) {
		this.soTienTaiKhoan = _soTienTaiKhoan;
	}

	// Constructors
	public TaiKhoan() {
	}

	public TaiKhoan(int _soTaiKhoan, String _tenTaiKhoan, double _soTienTaiKhoan) {
		this.soTaiKhoan = _soTaiKhoan;
		this.tenTaiKhoan = _tenTaiKhoan;
		this.soTienTaiKhoan = _soTienTaiKhoan;
	}

	// Other methods
	public void NhapThongTinTaiKhoan() {
//		System.out.print("Mời nhập số tài khoản: ");
//		this.soTaiKhoan = Integer.parseInt(scan.nextLine());
		System.out.print("Mời nhập tên tài khoản: ");
		this.tenTaiKhoan = scan.nextLine();
		this.soTienTaiKhoan = this.validationDouble("Mời nhập số tiền khởi tạo tài khoản: ");
	}

	public void XuatThongTinTaiKhoan() {
		System.out
				.println("Số TK: " + this.soTaiKhoan + " - Số tiền còn lại: " + this.dinhDangTien(this.soTienTaiKhoan));
	}

}
