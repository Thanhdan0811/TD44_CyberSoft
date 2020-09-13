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
		this.truongPhong = truongPhong;
	}
	
	// Methods
	@Override 
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhập Thông tin Nhân viên : ");
		System.out.print("Tên : ");
		this.hoTen = scan.nextLine();
		System.out.print("Số điện thoại : ");
		this.soDt = scan.nextLine();
		System.out.print("Số ngày làm : ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.print("lương 1 ngày : ");
		this.luongMotNgay = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void callMe() {
		System.out.println("Call me by NhanVien class.");
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
