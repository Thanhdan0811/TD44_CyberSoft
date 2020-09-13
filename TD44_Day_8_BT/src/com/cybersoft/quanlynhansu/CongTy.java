package com.cybersoft.quanlynhansu;

import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private double doanhThuThang;
	private ArrayList<NhanSu> dsNhanSu;
	
	public CongTy() {
		this.tenCongTy ="";
		this.maSoThue = "";
		this.dsNhanSu = new ArrayList<NhanSu>();
	}
	
	public CongTy(String tenCongTy, String maSoThue) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		dsNhanSu = new ArrayList<NhanSu>();
	}
	
	// Getters / Setters
	
	// Methods
	public void nhapThongTin(Scanner scan) {
		System.out.print("Tên công ty : ");
		this.tenCongTy = scan.nextLine();
		System.out.print("Mã số thuế : ");
		this.maSoThue = scan.nextLine();
		System.out.print("Doanh thu tháng hiện tại : ");
		this.doanhThuThang = Double.parseDouble(scan.nextLine());
	}
	
	public boolean themNhanSu(NhanSu ns) {
		return true;
	}
	
	public boolean xoaNhanSu(String maSo) {
		return true;
	}

	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println("Thông tin công ty");
		System.out.println("Tên công ty : " + this.tenCongTy);
		System.out.println("Mã số thuế : " + this.maSoThue);
		System.out.println("Doanh thu tháng hiện tại : " + String.format("%20.2f", this.doanhThuThang));
	}
	public String generateId() {
//		int i = 2;
//		String temp = "" + i; 
//		switch(temp.length()) {
//			case 1:
//				temp = "000" + temp;
//				break;
//			case 2:
//				temp = "00" + temp;
//				break;
//			case 3:
//				temp = "0" + temp;
//				break;
//			case 4:
//				temp = temp;
//				break;
//			default: 
//				break;
//		}	
//		System.out.println("akjsd : " + temp);
		String result = "";
//		while()
		return "";
	}
}
