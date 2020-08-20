package cybersoft.td44;

public class NhanVien {
	// Các thuộc tính
	private String maNv;
	private String tenNv;
	private String soCmnd;
	private String soDienThoai;
	private String email;
	private byte gioiTinh;
	private float soNgayLam;
	float luongMotNgay;
	// Phương thức khởi tạo
	
	public NhanVien() {
		System.out.println("Phương thức khởi tạo đã được gọi");
		tenNv = "Tuấn";
		maNv = "";
		soCmnd = "";
		soDienThoai = "";
		email = "";
		soNgayLam = 22;
		luongMotNgay = 100;
	}
	
	public NhanVien(String tenNv) {
		// TODO Auto-generated constructor stub
		this.tenNv = tenNv;
	}
	
	public NhanVien(String soCmnd, String tenNv) {
		// TODO Auto-generated constructor stub
		this.soCmnd = soCmnd;
		this.tenNv = tenNv;
	}

	// Các phương thức 
	void tinhLuong() {
		System.out.println("Phương thức tình lương");
	}
	
	void tinhTongNgayLam() {
		System.out.println("Phương thức tính tổng ngày làm");
	}
	
	void tinhTongNgayNghi() {
		System.out.println("Phương thức tính tổng ngày nghỉ");
	}
}
