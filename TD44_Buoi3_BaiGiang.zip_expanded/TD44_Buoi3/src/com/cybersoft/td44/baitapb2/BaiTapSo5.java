package com.cybersoft.td44.baitapb2;

import java.util.Scanner;

public class BaiTapSo5 {
	public static void main(String[] args) {
		/*
		 * Bài tập 5:
		 * 	Viết chương trình cho người dùng nhập
		 * 	tháng và năm.
		 * 	In ra số ngày trong tháng đó.
		 * 
		 */
		
		// input
		Scanner scanner = new Scanner(System.in);
		int thang, nam;
		
		System.out.print("Nhập tháng: ");
		thang = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhập năm: ");
		nam = Integer.parseInt(scanner.nextLine());
		
		// xử lý logic
		/*if(	thang == 1 
			|| thang == 3
			|| thang == 5
			|| thang == 7
			|| thang == 8
			|| thang == 10
			|| thang == 12) {
			System.out.println("Số ngày trong tháng: 31 ngày.");
		}*/
		
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
			default: 
				System.out.println("Default được chạy.");
				break;
		}
		
		if(	thang == 4 
				|| thang == 6
				|| thang == 9
				|| thang == 11) {
				System.out.println("Số ngày trong tháng: 30 ngày.");
			}
		
		if( thang == 2) {
			if( nam % 4 == 0
				|| (nam % 100 == 0 && nam % 400 == 0) ) {
				System.out.println("Số ngày trong tháng: 29 ngày.");
			} else {
				System.out.println("Số ngày trong tháng: 28 ngày.");
			}
		}
		
	}
}
