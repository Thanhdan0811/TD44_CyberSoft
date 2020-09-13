package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public class TruongPhong extends NhanSu{
	private int soNhanVien;
	
	
	@Override
	public double tinhLuong() {
		double luong = luongMotNgay * soNgayLamViec + 100*soNhanVien; 
		return luong;
	}
}
