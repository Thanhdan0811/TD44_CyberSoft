package com.cybersoft.td44.baitapb2;

import java.util.Scanner;

public class BaiTapSo3 {

	public static void main(String[] args) {
		/*
		 * Bài tập 3:
		 * 	Viết chương trình nhập vào số nguyên
		 * 	có ba chữ số. In ra cách đọc của nó.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int soInt, soHangTram, soHangChuc, soDonVi;
		
		System.out.print("Vui lòng nhập số nguyên có 3 chữ số: ");
		soInt = Integer.parseInt(scanner.nextLine());
		
		soHangTram = soInt / 100;
		soHangChuc = soInt % 100 / 10;
		soDonVi = soInt % 10;
		
		System.out.print("Cách đọc số: ");
		
		switch(soInt / 100) {
			case 1:
				System.out.print("Một trăm");
				break;
			case 3:
				System.out.print("Ba trăm");
				//break;
			case 2:
				System.out.print("Hai trăm");
				//break;
			case 4:
				System.out.print("Bốn trăm");
				break;
			case 5:
				System.out.print("Năm trăm");		
				break;
			case 6:
				System.out.print("Sáu trăm");
				break;
			case 7:
				System.out.print("Bảy trăm");
				break;
			case 8:
				System.out.print("Tám trăm");
				break;
			case 9:
				System.out.print("Chín trăm");
				break;
		}
		
		/* đọc số hàng trăm
		if(soHangTram == 1) {
			System.out.print("Một trăm");
		}
		
		if(soHangTram == 2) {
			System.out.print("Hai trăm");
		}
		
		if(soHangTram == 3) {
			System.out.print("Ba trăm");
		} else if(soHangTram == 4) {
			System.out.print("Bốn trăm");
		} else if(soHangTram == 5) {
			System.out.print("Năm trăm");
		} else if(soHangTram == 6) {
			System.out.print("Sáu trăm");
		} else if(soHangTram == 7) {
			System.out.print("Bảy trăm");
		} else if(soHangTram == 8) {
			System.out.print("Tám trăm");
		} else if(soHangTram == 9) {
			System.out.print("Chín trăm");
		} */
		
		
		// đọc số hàng chục
		if(soHangChuc == 1) {
			System.out.print(" mười");
		} else if(soHangChuc == 2) {
			System.out.print(" hai mươi");
		} else if(soHangChuc == 3) {
			System.out.print(" ba mươi");
		} else if(soHangChuc == 4) {
			System.out.print(" bốn mươi");
		} else if(soHangChuc == 5) {
			System.out.print(" năm mươi");
		} else if(soHangChuc == 6) {
			System.out.print(" sáu mươi");
		} else if(soHangChuc == 7) {
			System.out.print(" bảy mươi");
		} else if(soHangChuc == 8) {
			System.out.print(" tám mươi");
		} else if(soHangChuc == 9) {
			System.out.print(" chín mươi");
		} else if(soHangChuc == 0 && soDonVi != 0) {
			System.out.print(" lẻ");
		}
		
		
		
		// đọc số đơn vị
		if(soDonVi == 1) {
			if(soHangChuc == 0 || soHangChuc == 1) {
				System.out.print(" một.");
			} else {
				System.out.print(" mốt.");
			}
		} else if(soDonVi == 2) {
			System.out.print(" hai.");
		} else if(soDonVi == 3) {
			System.out.print(" ba.");
		} else if(soDonVi == 4) {
			System.out.print(" bốn.");
		} else if(soDonVi == 5) {
			if(soHangChuc == 0) {
				System.out.print(" năm.");
			} else {
				System.out.print(" lăm.");
			}
		} else if(soDonVi == 6) {
			System.out.print(" sáu.");
		} else if(soDonVi == 7) {
			System.out.print(" bảy.");
		} else if(soDonVi == 8) {
			System.out.print(" tám.");
		} else if(soDonVi == 9) {
			System.out.print(" chín.");
		} else {
			System.out.print(".");
		}
		
	}

}
