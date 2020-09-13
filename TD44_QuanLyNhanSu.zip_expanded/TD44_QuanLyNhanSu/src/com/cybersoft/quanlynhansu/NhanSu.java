package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public class NhanSu {
	/* properties */
	protected String maSo;
	protected String hoTen;
	protected String soDt;
	protected float soNgayLamViec;
	protected float luongMotNgay;
	
	/* constructor */
	public NhanSu(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDt = soDt;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
	}

	public NhanSu() {
		this.maSo = "";
		this.hoTen = "";
		this.soDt = "";
	}
	
	/* getters, setters */
	
	/* methods */
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập thông tin.");
	}
	
	public void xuatThongTin() {
		System.out.println(
				String.format("| %10s |", maSo)
				+ String.format("%16s |", hoTen)
				+ String.format("%12s |", soDt)
				+ String.format("%12.2f |", soNgayLamViec)
				+ String.format("%12.2f |", luongMotNgay)
				+ String.format("%17.2f |", tinhLuong())
			);
	}
	
	public double tinhLuong() {
		return soNgayLamViec * luongMotNgay;
	}

	public String getMaSo() {
		// TODO Auto-generated method stub
		return this.maSo;
	}
	
	
	
}
