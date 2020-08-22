
public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	private int chuVi = 0;
	private int dienTich = 0;
	
	// Constructor
	public HinhChuNhat() {
		chieuDai = 0;
		chieuRong = 0;
	}
	public HinhChuNhat(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	// Getter / Setter
	public int getChieuDai() {
		return this.chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return this.chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	// Method chuVi + dienTich
	public int getChuVi() {
		return this.chuVi =  2 * ( this.chieuDai + this.chieuRong );
	}
	public int getDienTich() {
		return this.dienTich = this.chieuDai * this.chieuRong;
	}
	public String loaiHinhChuNhat() {
		if(this.chieuDai == this.chieuRong) return "hình vuông";
		else return "Hình chữ nhật thường";
	}
}
