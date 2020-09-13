package com.cybesoft.xuly;

import java.util.ArrayList;
import java.util.Scanner;

import com.cybersoft.quanlynhansu.CongTy;
import com.cybersoft.quanlynhansu.GiamDoc;
import com.cybersoft.quanlynhansu.NhanSu;
import com.cybersoft.quanlynhansu.NhanVien;
import com.cybersoft.quanlynhansu.TruongPhong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		ỉnt luaChon;
//		ArrayList<NhanSu> dsNhanSu = new ArrayList<NhanSu>();
//		NhanSu ns = new NhanVien(); 
//		NhanSu ns_2 = new TruongPhong();
//		NhanSu ns_3 = new GiamDoc();
//		// Tạo Instances 
//		dsNhanSu.add(ns);
//		dsNhanSu.add(ns_2);
//		dsNhanSu.add(ns_3);
//			
//		System.out.println(dsNhanSu.toString());
//	
//		for(NhanSu nhanSu : dsNhanSu) {
//			if(nhanSu instanceof NhanVien)
//				System.out.println("Nhân Vien");
//			else if(nhanSu instanceof TruongPhong)
//				System.out.println("Truong phong");
//			else if(nhanSu instanceof GiamDoc)
//				System.out.println("Giám đốc");	
//		}
//		CongTy congTy = new CongTy();
//		congTy.nhapThongTin(scan);
//		congTy.xuatThongTin();
		
//		do {
//			luaChon = inMenu(scan);
//			switch(luaChon) {
//				case 1:
//					break;
//				case 2:
//					break;
//				case 3:
//					break;
//				case 4:
//					break;
//				case 5:
//					break;
//				case 6:
//					break;
//				case 7:
//					break;
//				case 8:
//					break;
//				case 9:
//					break;
//				case 10:
//					break;
//				case 11:
//					break;
//				case 0:
//					System.out.println("Kết thúc chương Trình");
//					break;
//				default :
//					System.out.println("Lựa chọn không hợp lệ");
//					break;
//			}
//		} while (luaChon != 0);
		CongTy cty = new CongTy();
		cty.generateId();
	}
	static int inMenu(Scanner scan) {
		int spaceNum = 20;
		System.out.println(String.format("%" + spaceNum + "s", "") + "Quản lý nhân sự" + String.format("%" + spaceNum + "s", ""));
		System.out.println("Menu : ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\t1. ");
		System.out.println("\tLựa chọn: ");
		return Integer.parseInt(scan.nextLine());
	}
}
