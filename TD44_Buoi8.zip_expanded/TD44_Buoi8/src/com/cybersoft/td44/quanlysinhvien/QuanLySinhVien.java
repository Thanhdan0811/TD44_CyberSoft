package com.cybersoft.td44.quanlysinhvien;

import java.util.ArrayList;

public class QuanLySinhVien {
	private ArrayList<SinhVien> dsSinhVien;
	
	public QuanLySinhVien() {
		dsSinhVien = new ArrayList<SinhVien>();
	}
	
	public boolean them(SinhVien sv) {
		if(sv == null)
			return false;
		
		// cách chánh đạo theo logic
		if(sv.getTen() == null || sv.getTen().equalsIgnoreCase(""))
			return false;
		
		// tà đạo
		if("".equalsIgnoreCase(sv.getTen()))
			return false;
		
		// kiểm tra tên hợp lệ -> về nhà làm
		if(!kiemTraTen(sv.getTen())) 
			return false;
		
		dsSinhVien.add(sv);
		return true;
	}
	
	private boolean kiemTraTen(String ten) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean xoa(String maSv) {
		
		return true;
	}
	
	public SinhVien get(String maSv) {
		
		return null;
	}
	
	public SinhVien get(int index) {
		return dsSinhVien.get(index);
	}
	
	public void xuatThongTin() {
		int num = 53;
		drawLine(num);
		System.out.println();
		System.out.println(
				String.format("*%10s *", "Mã số")
				+ String.format("%16s *", "Tên")
				+ String.format("%12s *", "Điểm Toán")
				+ String.format("%12s *", "Điểm Lý")
				+ String.format("%12s *", "Điểm Hóa")
				+ String.format("%17s *", "Điểm Trung Bình")
				+ String.format("%11s *", "Xếp loại")
			);
		drawLine(num);
		System.out.println();
		for(SinhVien sv : dsSinhVien) {
			sv.xuatThongTin();
		}
		drawLine(num);
	}
	
	private void drawLine(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("- ");
		}
	}
}
