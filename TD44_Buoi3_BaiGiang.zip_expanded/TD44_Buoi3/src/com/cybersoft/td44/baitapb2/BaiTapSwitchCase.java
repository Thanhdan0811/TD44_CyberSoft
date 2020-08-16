package com.cybersoft.td44.baitapb2;

import java.util.Scanner;

public class BaiTapSwitchCase {

	public static void main(String[] args) {
		/*
		 * Bài tập switch case
		 * Viết chương trình cho người dùng nhập vào tháng trong năm
		 * Nếu tháng không hợp lệ in ra "Tháng không hợp lệ!"
		 * Nếu tháng hợp lệ in số ngày trong tháng. (không cần xét năm nhuận)
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int thang;
		
		System.out.print("Nhập tháng: ");
		thang = Integer.parseInt(scanner.nextLine());
		
		switch(thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Số ngày trong tháng: 31 ngày.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Số ngày trong tháng: 30 ngày.");
				break;
			case 2:
				System.out.println("Số ngày trong tháng: 28 ngày.");
				break;
			default:
				System.out.println("Tháng không hợp lệ.");
				break;
		}
	}

}
