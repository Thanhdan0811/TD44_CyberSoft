package com.cybersoft.quanlynhansu;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	/* properties */
	private String tenCongTy;
	private String tenVietTat; //CG -> CG20200001
	private String maSoThue;
	private double doanhThuThang;
	private ArrayList<NhanSu> dsNhanSu;
	
	private int STT = 999;
	private Helper helper;
	
	/* constructors */
	public CongTy() {
		tenCongTy = "";
		maSoThue = "";
		dsNhanSu = new ArrayList<NhanSu>();
		helper = new Helper();
	}
	
	public CongTy(String tenCongTy, String maSoThue) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		dsNhanSu = new ArrayList<NhanSu>();
		helper = new Helper();
	}
	
	public CongTy(String tenCongTy, String tenVietTat, String maSoThue, double doanhThuThang) {
		this.tenCongTy = tenCongTy;
		this.tenVietTat = tenVietTat;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
		dsNhanSu = new ArrayList<NhanSu>();
		helper = new Helper();
	}
	/* get, set */
	

	/* methods */
	public void nhapThongTin(Scanner sc) {
		System.out.print("Tên công ty: ");
		tenCongTy =  sc.nextLine();
		System.out.print("Tên viết tắt: ");
		tenVietTat =  sc.nextLine();
		System.out.print("Mã số thuế: ");
		maSoThue = sc.nextLine();
		System.out.print("Doanh thu tháng hiện tại: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());
		
	}
	
	public boolean themNhanSu(NhanSu ns) {
		// 1. kiểm tra null
		// 2. kiểm tra tên rỗng
		// 3. kiểm tra trùng lặp
		// 4. thêm 
		if(ns == null)
			return false;
		
		if("".equals(ns.getHoTen()))
			return false;
		
		if(helper.daTonTaiNhanSu(ns))
			return false;
		
		ns.setMaSo(helper.generateId());
		dsNhanSu.add(ns);
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
		int num = 72;
		String ttCongTy = "THÔNG TIN CÔNG TY";
		String ttNhanSu = "DANH SÁCH NHÂN SỰ";
		
		System.out.println();
		System.out.println(String.format("%" + (num*2 - ttCongTy.length())/2 + "s", "") + ttCongTy + String.format("%" + (num*2 - ttCongTy.length())/2 + "s", ""));
		System.out.println("Tên công ty: " + tenCongTy);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu: " + String.format("%20.2f", doanhThuThang));
		
		
		System.out.println();
		System.out.println(String.format("%" + (num*2 - ttNhanSu.length())/2 + "s", "") + ttNhanSu + String.format("%" + (num*2 - ttNhanSu.length())/2 + "s", ""));
		helper.drawLine(num);
		System.out.println();
		System.out.println(
				String.format(" %10s  ", "Mã số")
				+ String.format("%16s  ", "Họ tên")
				+ String.format("%16s  ", "Số điện thoại")
				+ String.format("%12s  ", "Ngày làm")
				+ String.format("%16s  ", "Lương cơ bản")
				+ String.format("%17s  ", "Lương")
				+ String.format("%16s", "Chức vụ")
				+ String.format("%25s  ", "Số nhân viên/Cổ phần")
			);
		helper.drawLine(num);
		System.out.println();
		for (NhanSu nhanSu : dsNhanSu) {
			nhanSu.xuatThongTin();
		}
		helper.drawLine(num);
		System.out.println();
		System.out.println(
				String.format(" %10s  ", "")
				+ String.format("%16s  ", "")
				+ String.format("%16s  ", "")
				+ String.format("%30s  ", "Tổng lương")
				+ String.format("%17.2f  ", tinhTongLuong())
				+ String.format("%16s", "")
				+ String.format("%25s  |", "")
			);
		helper.drawLine(num);
	}
	
	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NhanSu nhanSu : dsNhanSu) {
			tongLuong += nhanSu.tinhLuong();
		}
		
		return tongLuong;
	}
	
	
	// nested class
	private class Helper{
		public String generateId() {
			return tenVietTat 
					+ OffsetDateTime.now().getYear()
					+ getStt(4);
		}
		
		public String getStt(int length) {
			String result = "";
			int i = 1;
			
			while(STT / (int)Math.pow(10, length-i) == 0) {
				result += "0";
				i++;
			}
			result += STT;
			STT++;
			
			return result;
		}
		
		public boolean daTonTaiNhanSu(NhanSu ns) {
			for (NhanSu nhanSu : dsNhanSu) {
				if(nhanSu.getSoDt().equalsIgnoreCase(ns.getSoDt()))
					return true;
			}
			return false;
		}
		
		private void drawLine(int num) {
			for(int i = 0; i < num; i++) {
				System.out.print("- ");
			}
		}
	}
}
