package sach;

public class SachGiaoKhoa extends Sach{
	// Properties
	public boolean tinhTrang;
	// Constructor
	public SachGiaoKhoa() {
		super();
	}
	public SachGiaoKhoa(String maSach, String ngayNhap, String nhaXuatBan, float donGia, int soLuong, boolean tinhTrang) {
		super(maSach, ngayNhap, nhaXuatBan, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}
	// Getters / Setters 
	
	// Methods
	@Override
	public double thanhTien() {
		double thanhTien = 0;
		thanhTien = this.donGia * this.soLuong;
		if(this.tinhTrang)	return thanhTien;
		thanhTien *= 0.5;
		return thanhTien;
	}
}
