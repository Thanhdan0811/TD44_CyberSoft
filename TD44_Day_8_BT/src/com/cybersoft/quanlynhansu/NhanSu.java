package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public class NhanSu {
	protected String hoTen;
	protected String maSo;
	protected String soDt;
	protected float soNgayLamViec;
	protected float luongMotNgay;
	
	// Contrustor 
	public NhanSu(String hoTen, String maSo, String soDt, float soNgayLamViec, float luongMotNgay) {
		this.hoTen = hoTen;
		this.maSo = maSo;
		this.soDt = soDt;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
	}
	
	public NhanSu() {
		this.hoTen = "";
		this.maSo = "";
		this.soDt = "";
	}
	
	// Getter / Setter
	
	
	// Methods
	
	public void nhapThongTin(Scanner scan) {
		System.out.println("Nhapp tt");
	}
	
	public void xuatThongTin() {
		System.out.println(
				String.format("*%10s *", this.maSo)
				+ String.format("%16s *", this.hoTen)
				+ String.format("%12s *", this.soDt)
				+ String.format("%12f *", this.soNgayLamViec)
				+ String.format("%12f *", this.luongMotNgay)
				+ String.format("%17.2f *", this.tinhLuong())
			);
	}
	
	public double tinhLuong() {
		return this.soNgayLamViec * this.luongMotNgay;
	}

	
	
}
