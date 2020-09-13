package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public class NhanVien extends NhanSu {
	/* properties */
	private String truongPhong;
	
	// Constructor
	public NhanVien() {
		super();
		this.truongPhong = "";
		this.luongMotNgay = 100;
	}
	
	public NhanVien(String maSo, String hoTen, String soDt, float soNgayLam, float luongMotNgay) {
		super(maSo, hoTen, soDt, soNgayLam, luongMotNgay);
		this.truongPhong = "";
	}
	
	// Getter / Setters
	public String getTruongPhong() {
		return this.truongPhong;
	}
	
	public void setTruongPhong(String truongPhong) {
		if(truongPhong == null) return;
		this.truongPhong = truongPhong;
	}
	
	// Methods
	@Override 
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhập Thông tin Nhân viên : ");
		System.out.print("Tên : ");
		this.hoTen = scan.nextLine();
		System.out.print("Số điện thoại : ");
		this.setSoDt(scan.nextLine());
		System.out.print("Số ngày làm : ");
		this.setSoNgayLamViec(Float.parseFloat(scan.nextLine()));
		System.out.print("lương 1 ngày : ");
		this.setLuongMotNgay(Float.parseFloat(scan.nextLine()));
	}

	@Override
	public String getChucVu() {
		return "Nhân viên";
	}

	@Override
	public String getThongTinThem() {
		return this.truongPhong;
	}
}
