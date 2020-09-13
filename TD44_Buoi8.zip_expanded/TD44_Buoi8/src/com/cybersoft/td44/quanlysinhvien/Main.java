package com.cybersoft.td44.quanlysinhvien;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		QuanLySinhVien qlSinhVien = new QuanLySinhVien();
		
		for(int i = 0; i < 10; i++) {
			qlSinhVien.them(new SinhVien("Bla BLa"));
		}
		qlSinhVien.xuatThongTin();
		
		SinhVien sv = qlSinhVien.get(1);
		
		sv.setDiemLy(9);
		
		qlSinhVien.xuatThongTin();
		
		
	}
}
