package com.cybersoft.td44.baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		HinhChuNhat hcn = new HinhChuNhat();
		
		hcn.nhapThongTin(scanner);
		
		hcn.xuatThongTin(scanner);
		
		ArrayList<HinhChuNhat> dsHinhChuNhat;
		
		dsHinhChuNhat = new ArrayList<HinhChuNhat>();
		*/
		
		// ví dụ tạo 1 array list lưu danh sách tên sinh viên
		ArrayList<String> dsTenSv = new ArrayList<String>();
		
		dsTenSv.add("Tuấn");
		dsTenSv.add("Thanh");
		System.out.println(dsTenSv.toString());
		
		dsTenSv.set(0, "Trần");
		System.out.println(dsTenSv.toString());
		
		System.out.println(dsTenSv.size());
		
		dsTenSv.stream().filter(name -> !name.equals("Tuấn")).toArray();
		//System.out.println(Arrays.toString(dsTenSv.stream().filter(name -> !name.equals("Tuấn")).toArray()));
	}
	
	
	
	
	
	
	
	
	
	
	
}
