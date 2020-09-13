import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	QuanLyNhanVien qLNV;
	Scanner scan = new Scanner(System.in);
	public CongTy() {
		qLNV = new QuanLyNhanVien();
	}
	// Methods
	public void nhapNhanVien(Scanner scan) {
		NhanVien nv = new NhanVien();
		nv.nhapThongTin(scan);
		qLNV.them(nv);
	}
	public void xuatNhanVien() {
		qLNV.xuat();
	}
	public void tongLuongNV() {
		qLNV.tinhTongLuongNhanVien();
	}
	public void nhanVienLuongCaoNhat() {
		qLNV.xuatNhanVienLuongCaoNhat();
	}
	public void taoDuLieuGia() {
		qLNV.them(new NhanVien("Dan","nv100",2, 50));
		qLNV.them(new NhanVien("Danh","nv101",2, 110));
		qLNV.them(new NhanVien("Tam","nv102",2, 110));
		qLNV.them(new NhanVien("Tan","nv103",1.5f, 75));
		qLNV.them(new NhanVien("Lan","nv104",1, 120));
		qLNV.them(new NhanVien("Dat","nv105",2, 150));
		qLNV.them(new NhanVien("Do","nv106",3, 180));
		qLNV.them(new NhanVien("Khanh","nv107",3, 180));
		qLNV.them(new NhanVien("Khanh","nv108",0.5f, 150));
		qLNV.them(new NhanVien("Toan","nv109",2, 150));
		qLNV.them(new NhanVien("Tu","nv110",2, 115));
		qLNV.them(new NhanVien("Tuan","nv111",2, 120));
		qLNV.them(new NhanVien("Tinh","nv112",2, 140));
		qLNV.them(new NhanVien("Vy","nv113",2, 175));
		qLNV.them(new NhanVien("Van","nv114",2, 180));
	}
}
