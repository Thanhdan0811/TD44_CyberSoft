package com.cybersoft.quanlynhansu;

public class GiamDoc extends NhanSu {
	private float soCoPhan;

	public GiamDoc(String hoTen, String maSo, String soDt, float soNgayLamViec, float luongMotNgay, float soCoPhan) {
		super(hoTen, maSo, soDt, soNgayLamViec, luongMotNgay);
		this.soCoPhan = soCoPhan;
	}
	@Override 
	public double tinhLuong() {
		
	}
}
