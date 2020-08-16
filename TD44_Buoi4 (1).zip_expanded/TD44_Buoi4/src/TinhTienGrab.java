import java.util.Scanner;

public class TinhTienGrab {
	public static void main(String[] args) {
		
		/*
		 * Input của bài toán
		 * 	- loại xe
		 * 	- số km đi được
		 * 	- thời gian chờ
		 */
		Scanner scanner = new Scanner(System.in);
		int loaiXe, thoiGianCho;
		float soKm, tongTien;
		System.out.println("Danh sách xe:");
		System.out.println("\t1. Grab Car");
		System.out.println("\t2. Grab Suv");
		System.out.println("\t3. Grab Black");
		System.out.print("Loại xe: ");
		loaiXe = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Số KM đã đi: ");
		soKm = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Thời gian chờ: ");
		thoiGianCho = Integer.parseInt(scanner.nextLine());
		
		/*
		 * Phần xử lý nghiệp vụ
		 * Tính tiền
		 */
		
		tinhTienXeGrab(loaiXe, soKm, thoiGianCho);
		
		
	}

	private static void tinhTienXeGrab(int loaiXe, float soKm, int thoiGianCho) {
		float tongTien, soTienKm1Den19 = 0, soTienKmTren19 = 0;
		
		switch(loaiXe) {
			case 1: // grab car
				if(soKm <= 1) {
					tongTien = 8000;
				} else if(soKm < 1 && soKm < 19) {
					soTienKm1Den19 = (soKm - 1) * 7500;
					tongTien = 8000 + soTienKm1Den19;
					
				} else {
					soTienKmTren19 = (soKm - 18) * 7000;
					soTienKm1Den19 = 7500 * 17;
					tongTien = 8000 + soTienKm1Den19 + soTienKmTren19;
 				}
				
				tongTien += thoiGianCho / 3 * 2000;
				break;
			case 2: // grab suv
				if(soKm <= 1) {
					tongTien = 9000;
				} else if(soKm < 1 && soKm < 19) {
					soTienKm1Den19 = (soKm - 1) * 8500;
					tongTien = 9000 + soTienKm1Den19;
					
				} else {
					soTienKmTren19 = (soKm - 18) * 8000;
					soTienKm1Den19 = 8500 * 17;
					tongTien = 9000 + soTienKm1Den19 + soTienKmTren19;
 				}
				
				tongTien += thoiGianCho / 3 * 3000;
				break;
			case 3: // grab black
				if(soKm <= 1) {
					tongTien = 10000;
				} else if(soKm < 1 && soKm < 19) {
					soTienKm1Den19 = (soKm - 1) * 9500;
					tongTien = 10000 + soTienKm1Den19;
					
				} else {
					soTienKmTren19 = (soKm - 18) * 9000;
					soTienKm1Den19 = 9500 * 17;
					tongTien = 10000 + soTienKm1Den19 + soTienKmTren19;
 				}
				
				tongTien += thoiGianCho / 3 * 3500;
				break;
		}
		
		/*
		 * In kết quả
		 */
		String row = "********************************************************************************";
		System.out.println(row);
		System.out.println("*" + String.format("%" + ((row.length()-17)/2) + "s", "")+ String.format("%15s", "CHI TIẾT HÓA ĐƠN") + String.format("%" + ((row.length()-17)/2) + "s", "") + "*");
		System.out.println(row);
		System.out.println(
					"*" + String.format("%" + ((row.length()/4 - 8 - 2)/2) + "s", "") + String.format("%8s", "CHI TIẾT") + String.format("%" + ((row.length()/4 - 8 - 2)/2) + "s", "") + "*"
					+ ""
				);
	}
	
	/*
		String row = "*************************************************************************************";
		System.out.println(row);
		System.out.println("*" + String.format("%" + ((row.length()-17)/2) + "s", "")+ String.format("%15s", "CHI TIẾT HÓA ĐƠN") + String.format("%" + ((row.length()-17)/2) + "s", "") + "*");
		System.out.println(row);
		System.out.println(
					"*   " + String.format("%" + ((row.length()/4 - 8 - 2)/2) + "s", "") + String.format("%8s", "CHI TIẾT") + String.format("%" + ((row.length()/4 - 8 - 2)/2) + "s", "")
					+ "*" + String.format("%" + ((row.length()/4 - 7 - 2)/2) + "s", "") + String.format("%7s", "SỬ DỤNG") + String.format("%" + ((row.length()/4 - 7 - 2)/2) + "s", "")
					+ "*" + String.format("%" + ((row.length()/4 - 15 - 2)/2) + "s", "") + String.format("%15s", "ĐƠN GIÁ (1000Đ)") + String.format("%" + ((row.length()/4 - 15 - 2)/2) + "s", "")
					+ "*" + String.format("%" + ((row.length()/4 - 10 - 2)/2) + "s", "") + String.format("%10s", "THÀNH TIỀN") + String.format("%" + ((row.length()/4 - 10 - 2)/2) + "s", "")
					+ "  *"
				);
		System.out.println(row);
		
	 */
}
