import java.util.Scanner;

public class BT_Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int mangSoNguyen[];
//		mangSoNguyen = nhapMangInt(scan);
//		xuatMang(mangSoNguyen);
		// Các giá trị có dạng 3^k
//		inGiaTriBaMuK(mangSoNguyen);
		// Liệt kê các cặp giá trị gần nhau nhất
//		inCapGiaTriGanNhauNhat(mangSoNguyen);
		// Tạo màng số nguyên từ [-100; 100] ,liệt kê số chẵn thuộc [x,y], 
//		lietKeSoChanTrongKhoangXY(scan);
		// Tạo màng số nguyên từ [-1000; 1000] ,liệt kê số tất cả số lẻ
//		lietKeSoLeTrongMang(scan);
		// Liệt kê số nguyên có chữ số đầu là chẵn
		lietKeSoDauLaChan(scan);
	}

	private static void lietKeSoDauLaChan(Scanner scan) {
		int mangNgauNhien[], soSoSanh;
		byte soDauTien = 0;
		boolean ktraSoAm = false;
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
//		xuatMang(mangNgauNhien);
		System.out.print("\nCác số đầu là chẵn trong mảng : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			soSoSanh = 10;
			if(mangNgauNhien[i] < 0) {
				mangNgauNhien[i] = -mangNgauNhien[i];
				ktraSoAm = true;
			}
			while(true) {
				if(mangNgauNhien[i] < soSoSanh) {
					soDauTien = (byte)(mangNgauNhien[i] / (soSoSanh / 10));
					if(ktraSoAm) {
						mangNgauNhien[i] = -mangNgauNhien[i];
						ktraSoAm = false;
					}
					if(soDauTien % 2 == 0)	System.out.print(mangNgauNhien[i] + "  ");
					break;
				}
				soSoSanh *= 10;
			}
		}
	}

	private static void lietKeSoLeTrongMang(Scanner scan) {
		int mangNgauNhien[];
		mangNgauNhien = taoMangNgauNhien(scan, -1000, 1000);
		System.out.print("Các số lẻ trong mảng : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] % 2 != 0)
				System.out.print(mangNgauNhien[i] + "  ");
		}
	}

	private static void lietKeSoChanTrongKhoangXY(Scanner scan) {
		int mangNgauNhien[], x , y;
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		System.out.print("nhập vào số x : ");
		x = Integer.parseInt(scan.nextLine());
		System.out.print("nhập vào số y : ");
		y = Integer.parseInt(scan.nextLine());
		System.out.print("Các số thuộc [" + x + ":" + y + "] : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] >= x && mangNgauNhien[i] <= y && mangNgauNhien[i] % 2 == 0)
				System.out.print(mangNgauNhien[i] + "  ");
		}
	}

	private static int[] taoMangNgauNhien(Scanner scan, int soDuoi, int soTren) {
		int mangNgauNhien[];
		System.out.print("\nNhập vào số phần tử : ");
		mangNgauNhien = new int[Integer.parseInt(scan.nextLine())];
		for(int i = 0; i < mangNgauNhien.length; i++) {
			mangNgauNhien[i] = soDuoi + (int)(Math.random() * ((soTren - soDuoi) + 1));
		}
		return mangNgauNhien;
	}

	private static void inCapGiaTriGanNhauNhat(int[] mangSoNguyen) {
		int soMin = triTuyetDoi(mangSoNguyen[0], mangSoNguyen[1]);
		for(int i = 0; i < mangSoNguyen.length - 1; i++) {
			for(int j = i + 1; j < mangSoNguyen.length; j++ ) {
				soMin = soMin < triTuyetDoi(mangSoNguyen[i], mangSoNguyen[j]) ? soMin  : triTuyetDoi(mangSoNguyen[i], mangSoNguyen[j]);
			}
		}
		System.out.println("\nSố min : " + soMin);
		for(int i = 0; i < mangSoNguyen.length - 1; i++) {
			for(int j = i + 1; j < mangSoNguyen.length; j++ ) {
				if(soMin == triTuyetDoi(mangSoNguyen[i], mangSoNguyen[j])) {
					System.out.print("\ncặp số gần nhau nhất ở vị trí [" + (i + 1) + " : " + (j + 1) +"]" + " có giá trị là : " + "[" + mangSoNguyen[i] + " : " + mangSoNguyen[j] +"]" );
				}
			}
		}
	}

	private static int triTuyetDoi(int i, int j) {
		int kq = i - j;
		kq = kq < 0 ? -kq : kq;
		return kq;
	}

	private static void inGiaTriBaMuK(int[] mangSoNguyen) {
		boolean tonTaiGiaTri = false;
		System.out.print("\ngiá trị có dạng 3^k: ");
		for(int i = 0, soChia; i < mangSoNguyen.length ;i++) {
			if(mangSoNguyen[i] < 3 || mangSoNguyen[i] % 3 != 0 ) {
				continue;
			}
			soChia = 1;
			while(true) {
				soChia *= 3;
				if(mangSoNguyen[i] == soChia) {
					System.out.print(mangSoNguyen[i] + " ");
					tonTaiGiaTri = true;
					break;
				} else if(mangSoNguyen[i] < soChia) {
					break;
				}
			}
			
		}
		if(!tonTaiGiaTri) System.out.print(0);
	}

	private static void xuatMang(int[] mangSoNguyen) {
		// TODO Auto-generated method stub
		System.out.print("\nMảng : ");
		for(int i = 0; i <  mangSoNguyen.length ;i++) {
			System.out.print( mangSoNguyen[i] + " ");
		}
	}

	private static int[] nhapMangInt(Scanner scan) {
		// TODO Auto-generated method stub
		int n, mangInt[];
		
		System.out.print("Nhập vào số phần tử mảng : ");
		n = Integer.parseInt(scan.nextLine());
		
		mangInt = new int[n];
		
		for(int i = 0; i <  mangInt.length ;i++) {
			System.out.print("Nhập mang[" + i + "] : ");
			mangInt[i] = Integer.parseInt(scan.nextLine());
		}
		return mangInt;
	}

}
