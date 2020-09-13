import java.util.ArrayList;

public class QuanLyNhanVien {
	private ArrayList<NhanVien> dsNhanVien ;
	private double tongLuong; 
	public QuanLyNhanVien() {
		this.dsNhanVien = new ArrayList<NhanVien>();
	}
	// Methods
	public boolean them(NhanVien nv) {
		if(nv == null) return false;
		if(nv.getHoTen() == null) return false;
		if("".equalsIgnoreCase(nv.getHoTen())) return false;
		this.dsNhanVien.add(nv);
		return true;
	}
	public void xuat() {
		System.out.print("Thông tin nhân viên");
		for(NhanVien nv : dsNhanVien) 
		nv.xuatThongTin();
	}
	public void tinhLuongTungNhanVien() {
		for(NhanVien nv : dsNhanVien) 
			nv.tinhLuong();
	}
	public void xuatLuongTungNhanVien() {
		for(NhanVien nv : dsNhanVien) {
			System.out.println("Tên nhân viên : " + nv.getHoTen());
			System.out.println("Lương : " + nv.tinhLuong());
			System.out.println("*********************");
		}
	}
	public double tinhTongLuongNhanVien() {
		double tongLuongNV = 0;
		for(NhanVien nv : dsNhanVien) 
			tongLuongNV += nv.tinhLuong();
		System.out.println("\nTổng lương là : " + tongLuongNV);
		return this.tongLuong = tongLuongNV;
	}
	public void xuatNhanVienLuongCaoNhat(){
		double maxLuong = 0;
		ArrayList<NhanVien> dsLuongMax = new ArrayList<NhanVien>();
		for(NhanVien nv : dsNhanVien) {
			nv.tinhLuong();
			if(maxLuong < nv.getTongLuong()) {
				maxLuong = nv.getTongLuong();
			}
		}
		for(NhanVien nv : dsNhanVien) {
			if(maxLuong == nv.getTongLuong()) {
				dsLuongMax.add(nv);
			}
		}
		System.out.println("Nhân viên lương cao nhất ");
		for(NhanVien nv : dsLuongMax) {
			System.out.println(nv.getHoTen());
		}
	}
}
