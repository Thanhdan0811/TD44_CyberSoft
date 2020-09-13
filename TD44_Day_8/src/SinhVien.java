import java.time.OffsetDateTime;
import java.util.Scanner;

public class SinhVien {
	private String tenSv;
	private String maSv;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTb;
	//id Tự tăng, việc sinh mã Id là bí mật
	private static int soTT = 1;
	
	private static String generateId() {
		return "Sv" + OffsetDateTime.now().getYear() + OffsetDateTime.now().getMonth().getValue() + soTT++;
	}
	
	// Constructor
	public SinhVien() {
		this.tenSv = "";
		this.maSv = generateId();
	}
	
	public SinhVien(String tenSv) {
		this.tenSv = tenSv;
		this.maSv = generateId();
	}
	
	// Getters / Setters
	public String getTenSv() {
		return tenSv;
	}

//	public void setTenSv(String tenSv) {
//		this.tenSv = tenSv;
//	}  Do chỉ tạo 1 lần và không thay đổi

	public String getMaSv() {
		return maSv;
	}

//	public void setMaSv(String maSv) {
//		this.maSv = maSv;
//	} Do chỉ tạo 1 lần và không thay đổi

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		if(diemToan >= 0 && diemToan <= 10) {
			this.diemToan = diemToan;
			return;
		} 
		System.out.println("Điểm ko hợp lệ");
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		if(diemLy >= 0 && diemLy <= 10) {
			this.diemLy = diemLy;
			return;
		} 
		System.out.println("Điểm ko hợp lệ");
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		if(diemHoa >= 0 && diemHoa <= 10) {
			this.diemHoa = diemHoa;
			return;
		} 
		System.out.println("Điểm ko hợp lệ");
	}
	
	
	// Methods
	public float tinhDiemTb() {
		this.diemTb = (this.diemToan + this.diemHoa + this.diemLy) / 3;
		return this.diemTb;
	}
	public String xepLoaiSv() {
		tinhDiemTb();
		if(this.diemTb >= 9) {
			return "Loại xuất xắc";
		} else if(this.diemTb >= 8) {
			return "Loại Giỏi";
		} else if(this.diemTb >= 7) {
			return "Loại Khá";
		} else if(this.diemTb >= 6) {
			return "Loại Trung Bình Khá";
		} else if(this.diemTb >= 5) {
			return "Loại Trung Bình";
		} else {
			return "Loại Yếu";
		}
	}
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhập thông tin Sinh Viên");
		System.out.print("Tên Sv : ");
		this.tenSv = scan.nextLine();	
		System.out.print("điểm Toán : ");
		setDiemToan(Float.parseFloat(scan.nextLine()));
		System.out.print("điểm Lý : ");
		setDiemLy(Float.parseFloat(scan.nextLine()));
		System.out.print("điểm Hóa : ");
		setDiemHoa(Float.parseFloat(scan.nextLine()));
	}
	
	public void xuatThongTin() {
//		System.out.println("****** Thông tin Sinh Viên ****** ");
//		System.out.println("Tên Sv : " + this.tenSv);
//		System.out.println("Mã Sv : " + this.maSv);
//		System.out.println("Điểm Toán : " + this.diemToan);
//		System.out.println("Điểm Lý : " + this.diemLy);
//		System.out.println("Điểm Hóa : " + this.diemHoa);
		System.out.println(
				
				String.format("%10s *", this.maSv) +
				String.format("%16s *", this.tenSv) +
				String.format("%7.2f *", this.diemToan) +
				String.format("%7.2f *", this.diemLy) +
				String.format("%7.2f *", this.diemHoa) +
				String.format("%7.2f *", this.tinhDiemTb()) + 
				String.format("%10s *", this.xepLoaiSv())
				);
		
	}
}
