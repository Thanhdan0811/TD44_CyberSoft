package com.cybersoft.td44.baitapb2;

import java.util.Scanner;

public class BaiTapInMenu {

	public static void main(String[] args) {
		/*
		 * Viết chương trình in menu như sau:
		 * 	Menu:
		 * 		1. Chức năng 1
		 * 		2. Chức năng 2
		 * 		3. Chức năng 3
		 *		4. Chức năng 4
		 *		0. Thoát
		 *	Lựa chọn: 
		 *
		 *	Cho phép người dùng nhập lựa chọn 
		 *	là chức năng muốn thực hiện.
		 *	
		 *	Nếu lựa chọn không nằm trong menu thì
		 *	in ra thông báo "Lựa chọn không hợp lệ."
		 *
		 *	Thực hiện các chức năng tương ứng theo
		 *	theo lựa chọn của người dùng
		 */
		Scanner scanner = new Scanner(System.in);
		int luaChon;
		// tìm số ngày trong tháng
		int thang, nam;
		
		
		System.out.println("Menu:");
		System.out.println("\t1.In ra số ngày trong tháng");
		System.out.println("\t2.Chức năng 2");
		System.out.println("\t3.Chức năng 3");
		System.out.println("\t4.Chức năng 4");
		System.out.println("\t0.Thoát");
		System.out.print("Lựa chọn: ");
		
		luaChon = Integer.parseInt(scanner.nextLine());
		
		switch(luaChon) {
			case 1:
				System.out.print("Nhập tháng: ");
				thang = Integer.parseInt(scanner.nextLine());
				
				System.out.print("Nhập năm: ");
				nam = Integer.parseInt(scanner.nextLine());
				
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
						if( nam % 4 == 0 ) {
							System.out.println("Số ngày trong tháng: 29 ngày.");
						} else {
							System.out.println("Số ngày trong tháng: 28 ngày.");
						}
						break;
					default:
						System.out.println("Tháng không hợp lệ.");
						break;
				}
				break;
			case 2:
				System.out.println("Chức năng 2 đã được thực hiện.");
				break;
			case 3:
				System.out.println("Chức năng 3 đã được thực hiện.");
				break;
			case 4:
				System.out.println("Chức năng 4 đã được thực hiện.");
				break;
			case 0:
				System.out.println("Kết thúc chương trình.\nHẹn gặp lại!");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
				break;
		}

	}

}
