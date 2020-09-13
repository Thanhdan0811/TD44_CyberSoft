package sach;

public class  Sach {
	// Properties
	protected String maSach;
	protected String ngayNhap;
	protected String nhaXuatBan;
	protected float donGia;
	protected int soLuong;
	// Constructor
	public Sach() {
		this.maSach = "";
		this.ngayNhap = "";
		this.nhaXuatBan = "";
	}
	public Sach(String maSach, String ngayNhap, String nhaXuatBan) {
		this();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.nhaXuatBan = nhaXuatBan;
	}
	public Sach(String maSach, String nhaXuatBan,  float donGia, int soLuong) {
		this(maSach, "", nhaXuatBan);
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	public Sach(String maSach, String ngayNhap, String nhaXuatBan, float donGia, int soLuong) {
		this(maSach, ngayNhap, nhaXuatBan);
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	// Getters / Setters
	
	// Methods
	public double thanhTien() {
		double thanhTien = 0;
		thanhTien = this.donGia * this.soLuong;
		return thanhTien;
	}
}
