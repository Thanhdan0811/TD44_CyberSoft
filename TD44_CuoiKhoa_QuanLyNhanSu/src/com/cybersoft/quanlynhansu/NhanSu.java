package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public abstract class NhanSu {
	/* properties */
	protected String maSo;
	protected String hoTen;
	protected String soDt;
	protected float soNgayLamViec;
	protected float luongMotNgay;
	private   int stt;
	
	/* constructor */
	public NhanSu() {
		this.maSo = "";
		this.hoTen = "";
		this.soDt = "";
	}
	
	public NhanSu(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.setSoDt(soDt);
		this.setSoNgayLamViec(soNgayLamViec);
		this.setLuongMotNgay(luongMotNgay);
	}
	
	/* Getters, Setters */
	// Số dt
	public String getSoDt() {
		return this.soDt;
	}
	
	public void setSoDt(String soDt) {
		// Mã ascii : từ số 0 => 9 là 48 => 57
		// Kiểm tra số đầu tiên là 0
		if(soDt.codePointAt(0) != 48) return;
		// Không được có chữ
		for(int i = 1; i < soDt.length();i++) { 
			if(!(soDt.codePointAt(i) >= 48 && soDt.codePointAt(i) <= 57))
				return;
		}
		this.soDt = soDt;
	}
	
	// Mã số
	public String getMaSo() {
		return this.maSo;
	}
	
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	
	// Họ Tên
	public String getHoTen() {
		return this.hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	// Số Ngày làm việc
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		if(!(soNgayLamViec >= 0)) return;
		this.soNgayLamViec = soNgayLamViec;
	}

	// Lương 1 ngày
	public float getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(float luongMotNgay) {
		if(!(luongMotNgay >= 0)) return;
		this.luongMotNgay = luongMotNgay;
	}

	/* methods */
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập thông tin.");
	}
	
	public void xuatThongTin() {
		System.out.println(
				String.format(" %3s  |", this.stt)
				+ String.format("%10s |", maSo)
				+ String.format("%16s |", hoTen)
				+ String.format("%16s |", soDt)
				+ String.format("%12.2f |", soNgayLamViec)
				+ String.format("%16.2f |", luongMotNgay)
				+ String.format("%17.2f |", tinhLuong())
				+ String.format("%16s |", getChucVu())
				+ String.format("%25s |", getThongTinThem())
			);
	}
	
	public void nhapSTT(int stt) {
		this.stt = stt;
	}
	
	public double tinhLuong() {
		return soNgayLamViec * luongMotNgay;
	}
	
	public String getChucVu() {
		return "Nhân sự";
	}
	
	public String getThongTinThem() {
		return "";
	}
}
