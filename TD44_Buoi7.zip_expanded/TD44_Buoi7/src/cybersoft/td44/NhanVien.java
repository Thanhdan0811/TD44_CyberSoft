package cybersoft.td44;

public class NhanVien {
	// các thuộc tính
	private String maNv; // 0001
	private String tenNv; // nguyễn văn tèo
	private String soCmnd; // 000000
	private String soDienThoai; // 0909000000
	private String email; // email@gmail.com
	private byte gioiTinh; // 0
	private float soNgayLam;
	private float luongMotNgay;
	private byte soNamThamNien;
	
	// getters
	public String getTenNv() {
		return this.tenNv;
	}
	
	public void setTenNv(String tenNv) {
		this.tenNv = tenNv;
	}
	
	public void setLuongMotNgay(float luongMotNgay) {
		if(luongMotNgay >= 0) {
			this.luongMotNgay = luongMotNgay;
		}
	}



	// phương thức khởi tạo
	public NhanVien() {
		System.out.println("Phương thức khởi tạo đã được gọi.");
		maNv = "";
		tenNv = "Tuấn";
		soCmnd = "";
		soDienThoai = "";
		email = "";
		soNgayLam = 22;
		luongMotNgay = 100;
	}
	
	public NhanVien(String tenNv) {
		this();
		this.tenNv = tenNv;
	}
	
	public NhanVien(String soCmnd, String tenNv) {
		this();
		this.soCmnd = soCmnd;
		this.tenNv = tenNv;
	}
	

	// các phương thức
	void tinhLuong() {
		float luong = 0;
		if(soNgayLam == 22) {
			luong += 500;
		} 
		
		if(soNgayLam >= 24) {
			luong += 800;
		}
		
		if(soNamThamNien > 3) {
			luong += soNamThamNien*200;
		}
		
		luong += soNgayLam * luongMotNgay;
		
		System.out.println("Lương nhân viên: "  + luong);
	}
	
	void tinhTongNgayLam() {
		System.out.println("Phương thức tính tổng ngày làm.");
	}
	
	void tinhTongNgayNghi() {
		System.out.println("Phương thức tính tổng ngày nghỉ.");
	}
	
}
