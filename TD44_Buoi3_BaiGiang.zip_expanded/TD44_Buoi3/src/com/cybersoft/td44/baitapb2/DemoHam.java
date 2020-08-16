package com.cybersoft.td44.baitapb2;

public class DemoHam {
	
	public static void main(String[] args) {
		timSoLonNhat(15, 15, 12);
		
		kiemTraChanLe(20);
		
		if(kiemTraSoChan(18))
			System.out.println("Số chẵn.");
	}
	
	public static void xuatThongTin() {
		System.out.println("Xin chào các bạn. Chúc buổi tối tốt lành.");
	}
	
	public static void tinhTong(int soMot, int soHai) {
		System.out.println("Tổng hai số: " + (soMot + soHai));
	}
	
	public static float tinhLuong(float soNgayLam, int luongMotNgay) {
		float luong = soNgayLam * luongMotNgay;
		return luong;
	}
	
	public static void timSoLonNhat(int a, int b, int c) {
		int max1 = a >= b ? a : b;
		int max2 = a >= c ? a : c;
		int max = max1 >= max2 ? max1 : max2;
		
		System.out.println("Số lớn nhất: " + max);
	}
	
	public static void kiemTraChanLe(int soInt) {
		if(soInt % 2 == 0) {
			System.out.println(soInt + " là số chẵn.");
			return;
		}
		System.out.println(soInt + " là số lẻ.");
	}
	
	public static boolean kiemTraSoChan(int soInt) {
		if(soInt % 2 == 0) {
			return true;
		}
		return false;
	}
}
