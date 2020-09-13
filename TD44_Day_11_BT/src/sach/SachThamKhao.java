package sach;

public class SachThamKhao extends Sach {
	private float thue;
	public SachThamKhao() {
		super();
	}
	public SachThamKhao(String maSach, String ngayNhap, String nhaXuatBan, float donGia, int soLuong, float thue) {
		super(maSach, ngayNhap, nhaXuatBan, donGia, soLuong);
		this.thue = thue;
	}
	// Getters / Setters 
	
	// Methods
	@Override
	public double thanhTien() {
		double thanhTien = 0;
		thanhTien = this.donGia * this.soLuong + thue;
		return thanhTien;
	}
}
