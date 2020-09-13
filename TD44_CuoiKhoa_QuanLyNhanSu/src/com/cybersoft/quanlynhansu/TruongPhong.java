package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public class TruongPhong extends NhanSu {
	/* properties */
	private int soNhanVien;
	// Constructor
	public TruongPhong() {
		super();
		luongMotNgay = 200;
	}
	public TruongPhong(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay,
			int soNhanVien) {
		super(maSo, hoTen, soDt, soNgayLamViec, luongMotNgay);
		this.soNhanVien = soNhanVien;
	}
	// Getters / Setters
	public int getSoNhanVien() {
		return this.soNhanVien;
	}
	// Methods
	@Override 
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhập Thông tin Trưởng Phòng : ");
		System.out.print("Tên");
		this.hoTen = scan.nextLine();
		System.out.print("Số điện thoại");
		this.soDt = scan.nextLine();
		System.out.print("Số ngày làm : ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.print("lương 1 ngày");
		this.luongMotNgay = Float.parseFloat(scan.nextLine());
	}
	@Override
	public void callMe() {
		
	}

	@Override
	public double tinhLuong() {
		double luong = luongMotNgay * soNgayLamViec + 100 * soNhanVien;
		return luong;
	}
	
	@Override
	public String getChucVu() {
		return "Trưởng phòng";
	}
	
	@Override
	public String getThongTinThem() {
		return String.valueOf(soNhanVien);
	}

	@Override
	public double tinhPhuCap() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void tangNhanVien() {
		this.soNhanVien++;
	}
	
	public void giamNhanVien() {
		this.soNhanVien--;
	}
}
