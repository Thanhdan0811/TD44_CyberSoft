
import java.util.ArrayList;

public class QuanLySinhVien {
	private ArrayList<SinhVien> dsSinhVien;
	public QuanLySinhVien() {
		dsSinhVien = new ArrayList<SinhVien>();
	}
	
	public boolean them(SinhVien sv) {
		// id
		// Tên rỗng
		// Tên bắt đầu bằng số
		if(sv == null) return false;
		
		if("".equalsIgnoreCase(sv.getTenSv())) return false;
			
		if(!kiemTraTen(sv.getTenSv())) return false;
		
		// Kiểm tra tên hợp lệ 
	
		
//		dsSinhVien.add(sv);
		
		return true;
	}

	private boolean kiemTraTen(String tenSv) {
		// TODO Auto-generated method stub
		return false;
	}
}
