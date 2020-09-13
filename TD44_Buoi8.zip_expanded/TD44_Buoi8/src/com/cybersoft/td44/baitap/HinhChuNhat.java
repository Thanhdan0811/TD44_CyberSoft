package com.cybersoft.td44.baitap;

import java.util.Scanner;

public class HinhChuNhat {
	// properties
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;
	
	// constructor
	public HinhChuNhat() {
		
	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	// getters, setters
	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
		tinhChuVi();
		tinhDienTich();
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
		tinhChuVi();
		tinhDienTich();
	}
	
	public float getChuVi() {
		return chuVi;
	}

	public float getDienTich() {
		return dienTich;
	}

	// methods
	public void nhapThongTin(Scanner scanner) {
		System.out.println("***** H I N H  C H U  N H A T *****");
		System.out.print("Chiều dài: ");
		chieuDai = Float.parseFloat(scanner.nextLine());
		System.out.print("Chiều rộng: ");
		chieuRong = Float.parseFloat(scanner.nextLine());
	}

	public void xuatThongTin(Scanner scanner) {
		System.out.println("***** H I N H  C H U  N H A T *****");
		System.out.println("Dài:\t" + chieuDai + "\tRộng:\t" + chieuRong);
		for(int i = 0; i < chieuDai; i++) {
			for(int j = 0; j < chieuRong; j++)
				System.out.print(" * ");
			System.out.println();
		}
	}
	
	public float tinhChuVi() {
		chuVi = chieuDai * 2 + chieuRong * 2;
		return chuVi;
	}
	
	public float tinhDienTich() {
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
}
