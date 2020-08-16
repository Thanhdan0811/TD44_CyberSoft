package com.cybersoft.td44.baitapb2;

import java.util.Scanner;

public class BaiTapSo1 {
	public static void main(String[] args) {
		/*
		 * Bài tập 1:
		 * 	Viết chương trình nhập 3 số thực
		 * 	thay tất cả các số âm bằng trị tuyệt
		 * 	đối của chúng
		 */
		// input
		Scanner scanner = new Scanner(System.in);
		float so1, so2, so3;
		
		System.out.print("Nhập số thứ nhất:\t");
		so1 = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Nhập số thứ hai:\t");
		so2 = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Nhập số thứ ba:\t");
		so3 = Float.parseFloat(scanner.nextLine());
		
		// xử lý logic
		if(so1 < 0) {
			so1 = Math.abs(so1);
		}
		
		if(so2 < 0) {
			so2 = Math.abs(so2);
		}
		
		if(so3 < 0) {
			so3 = Math.abs(so3);
		}
		
		// output
		System.out.print("Ba số vừa nhập: ");
		System.out.print(so1 + " ");
		System.out.print(so2 + " ");
		System.out.print(so3 + " ");
	}
	
	

}
