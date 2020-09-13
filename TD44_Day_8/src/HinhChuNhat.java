import java.util.Scanner;

public class HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	private float chuVi = 0;
	private float dienTich = 0;
	
	// Constructor
	public HinhChuNhat() {
		chieuDai = 0;
		chieuRong = 0;
	}
	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	// Getter / Setter
	public float getChieuDai() {
		return this.chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return this.chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	// Method chuVi + dienTich
	public float getChuVi() {
		return this.chuVi =  2 * ( this.chieuDai + this.chieuRong );
	}
	public float getDienTich() {
		return this.dienTich = this.chieuDai * this.chieuRong;
	}
	public String loaiHinhChuNhat() {
		if(this.chieuDai == this.chieuRong) return "hình vuông";
		else return "Hình chữ nhật thường";
	}
	public void nhapThongTin(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("******** H I N H C H U N H A T ***********");
		System.out.print("Chiều dài : ");
		this.chieuDai = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều rộng : ");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}
	public void xuatThongTin(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("******** H I N H C H U N H A T ***********");
		System.out.println("Chiều dài :\t " + this.chieuDai +"\tChieu Rong:\t" + this.chieuRong);
		for(int i = 0; i < this.chieuDai; i++) {
			for(int j = 0; j < this.chieuRong; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
