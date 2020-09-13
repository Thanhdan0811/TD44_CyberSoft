package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public class GiamDoc extends NhanSu {
	/* properties */
	private float soCoPhan;
	// Constructor
	public GiamDoc() {
		super();
		luongMotNgay = 300;
	}
	
	public GiamDoc(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay, float soCoPhan) {
		super(maSo, hoTen, soDt, soNgayLamViec, luongMotNgay);
		setSoCoPhan(soCoPhan);
	}
	// Getters / Setters
	public float getSoCoPhan() {
		return this.soCoPhan;
	}
	
	public void setSoCoPhan(float soCoPhan) {
		if(0 < soCoPhan && soCoPhan < 100)
			this.soCoPhan = soCoPhan;
	}
	// Methods
	@Override 
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhập Thông tin Giám đốc : ");
		System.out.print("Tên");
		this.hoTen = scan.nextLine();
		System.out.print("Số điện thoại");
		this.soDt = scan.nextLine();
		System.out.print("Số ngày làm : ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.print("lương 1 ngày");
		this.luongMotNgay = Float.parseFloat(scan.nextLine());
		System.out.print("số cổ phần");
		this.soCoPhan = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public double tinhLuong() {
		/*
		 * lương giám đốc bao gồm phần cổ tức theo doanh thu
		 */
		double luong = super.tinhLuong();
		
		return luong;
	}
	
	@Override
	public String getChucVu() {
		return "Giám đốc";
	}
	
	@Override
	public String getThongTinThem() {
		return String.valueOf(soCoPhan);
	}

	@Override
	public double tinhPhuCap() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
