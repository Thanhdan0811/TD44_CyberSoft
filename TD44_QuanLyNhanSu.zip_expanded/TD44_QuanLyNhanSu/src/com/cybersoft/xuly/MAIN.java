package com.cybersoft.xuly;

import java.util.ArrayList;
import java.util.Scanner;

import com.cybersoft.quanlynhansu.CongTy;
import com.cybersoft.quanlynhansu.GiamDoc;
import com.cybersoft.quanlynhansu.NhanSu;
import com.cybersoft.quanlynhansu.NhanVien;
import com.cybersoft.quanlynhansu.TruongPhong;

public class MAIN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CongTy congTy = new CongTy("Cyber Group","024000934", 100000000);
		
		congTy.dsNhanSu.add(new NhanVien("MS01", "Tuan", "000001230", 22f, 100f));
		congTy.dsNhanSu.add(new NhanVien("MS02", "Tai", "000001230", 22f, 100f));
		congTy.dsNhanSu.add(new NhanVien("MS03", "Nhan", "000001230", 22f, 100f));
		
		congTy.dsNhanSu.add(new TruongPhong());
		congTy.dsNhanSu.add(new TruongPhong());
		
		congTy.dsNhanSu.add(new GiamDoc());
		
		congTy.xuatThongTin();
		
		String bienNull;
		congTy.xoaNhanSu("MS03");
		
		congTy.xuatThongTin();
		
		
	}
}
