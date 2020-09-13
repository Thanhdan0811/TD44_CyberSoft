package com.cybersoft.quanlynhansu;

import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	/* properties */
	private String tenCongTy;
	private String maSoThue;
	private double doanhThuThang;
	public ArrayList<NhanSu> dsNhanSu;
	
	/* constructors */
	public CongTy() {
		tenCongTy = "";
		maSoThue = "";
		dsNhanSu = new ArrayList<NhanSu>();
	}
	
	public CongTy(String tenCongTy, String maSoThue) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		dsNhanSu = new ArrayList<NhanSu>();
	}
	
	public CongTy(String tenCongTy, String maSoThue, double doanhThuThang) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
		dsNhanSu = new ArrayList<NhanSu>();
	}
	/* get, set */
	
	

	/* methods */
	public void nhapThongTin(Scanner sc) {
		System.out.print("Tên công ty: ");
		tenCongTy =  sc.nextLine();
		System.out.print("Mã số thuế: ");
		maSoThue = sc.nextLine();
		System.out.print("Doanh thu tháng hiện tại: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());
		
	}
	
	public boolean themNhanSu(NhanSu ns) {
		
		return true;
	}
	
	public boolean xoaNhanSu(String maSo) {
		if(maSo == null)
			return false;
		
		for (NhanSu nhanSu : dsNhanSu) {
			if(maSo.equalsIgnoreCase(nhanSu.getMaSo())) {
				dsNhanSu.remove(nhanSu);
				return true;
			}
		}
		return false;
	}

	public void xuatThongTin() {
		System.out.println();
		System.out.println(String.format("%39s", "") + "THÔNG TIN CÔNG TY" + String.format("%39s", ""));
		System.out.println("Tên công ty: " + tenCongTy);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu: " + String.format("%20.2f", doanhThuThang));
		
		int num = 53;
		System.out.println();
		System.out.println(String.format("%39s", "") + "DANH SÁCH NHÂN SỰ" + String.format("%39s", ""));
		drawLine(num);
		System.out.println();
		System.out.println(
				String.format(" %10s  ", "Mã số")
				+ String.format("%16s  ", "Họ tên")
				+ String.format("%12s  ", "Số điện thoại")
				+ String.format("%12s  ", "Ngày làm")
				+ String.format("%12s  ", "Lương cơ bản")
				+ String.format("%17s  ", "Lương")
				+ String.format("%11s  ", "Thêm")
			);
		drawLine(num);
		System.out.println();
		for (NhanSu nhanSu : dsNhanSu) {
			nhanSu.xuatThongTin();
		}
		drawLine(num);
	}
	
	private void drawLine(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("- ");
		}
	}
	
	
	
	
	
	
	
	
	
}
