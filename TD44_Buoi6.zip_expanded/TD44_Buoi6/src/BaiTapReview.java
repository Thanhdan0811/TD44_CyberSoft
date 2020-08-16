import java.util.Scanner;

public class BaiTapReview {
	public static void main(String[] args) {
		/*
		 * Cho người dùng nhập n số nguyên và lưu trữ trong mảng
		 */
		Scanner scanner = new Scanner(System.in);
		int n, luaChon;
		boolean daNhapMang = false;
		int[] mangInt = {0};
		
		do {
			luaChon = inMenu(scanner);
			switch(luaChon) {
				case 1:
					if(daNhapMang == false) {
						mangInt = nhapMang(mangInt, scanner);
						daNhapMang = true;
						break;
					}
					xuatMang(mangInt);
					
					break;
				case 2:
					if(daNhapMang == false) {
						System.out.println("Vui lòng nhập mảng trước khi thực hiện chức năng này.");
						break;
					}
					
					System.out.println("Tổng các số chẵn: " + tongSoChan(mangInt));
					break;
				case 3:
					if(daNhapMang == false) {
						System.out.println("Vui lòng nhập mảng trước khi thực hiện chức năng này.");
						break;
					}
					
					System.out.println("Số lượng số âm: " + demSoAm(mangInt));
					break;
				case 4:
					if(daNhapMang == false) {
						System.out.println("Vui lòng nhập mảng trước khi thực hiện chức năng này.");
						break;
					}
					
					System.out.println("Tổng các số âm: " + tongSoAm(mangInt));
					break;
				case 0:
					System.out.println("Kết thúc chương trình.");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
			scanner.nextLine();
		}while(luaChon != 0);
	}

	private static int tongSoAm(int[] mangInt) {
		int tong = 0;
		
		for(int i = 0; i < mangInt.length; i++) {
			if(mangInt[i] < 0)
				tong += mangInt[i];
		}
		
		return tong;
	}

	private static int demSoAm(int[] mangInt) {
		int dem = 0;
		
		for(int i = 0; i < mangInt.length; i++) {
			if(mangInt[i] < 0)
				dem++;
		}
		
		return dem;
	}

	private static int tongSoChan(int[] mangInt) {
		int tong = 0;
		
		for(int i = 0; i < mangInt.length; i++) {
			if(mangInt[i] % 2 == 0)
				tong += mangInt[i];
		}
		
		return tong;
	}

	private static void xuatMang(int[] mangInt) {
		// xuất mảng
		System.out.print("Mảng đã nhập: ");
		for(int i = 0; i < mangInt.length ; i++) {
			System.out.print(mangInt[i] + " ");
		}
	}

	private static int[] nhapMang(int[] mangInt, Scanner scanner) {
		int n;
		System.out.print("Nhập số phần tử muốn nhập: ");
		n = Integer.parseInt(scanner.nextLine());
		
		// khai báo mảng
		mangInt = new int[n];
		
		// nhập mảng
		for(int i = 0; i < mangInt.length ; i++) {
			System.out.print("Phần tử thứ " + (i+1) + ": ");
			mangInt[i] = Integer.parseInt(scanner.nextLine());
		}
		
		return mangInt;
	}

	private static int inMenu(Scanner scanner) {
		System.out.println("=====-----0o_MENU_o0-----=====");
		System.out.println("\t0. Thoát.");
		System.out.println("\t1. Nhập/xuất mảng.");
		System.out.println("\t2. Tính tổng các số chẵn.");
		System.out.println("\t3. Đếm số âm.");
		System.out.println("\t4. Tính tổng các số âm.");
		System.out.print("Lựa chọn: ");
		return Integer.parseInt(scanner.nextLine());
	}
	
}
