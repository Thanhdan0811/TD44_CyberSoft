package com.cybersoft.quanlynhansu;

public class NhanVien extends NhanSu {
	/* properties */
	private String truongPhong;
	
	public NhanVien(String maSo, String hoTen, String soDt, float soNgayLam, float luongMotNgay) {
		super(maSo, hoTen, soDt, soNgayLam, luongMotNgay);
	}
	
	public NhanVien() {
		super();
	}

	public void testAccessModifier() {
		maSo = "I am here.";
		System.out.println(maSo);
		hoTen = "Tuan";
		soDt = "0369296613";
	}
}
