import java.util.Scanner;
import java.util.Arrays;
public class BT_Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 1. Các giá trị có dạng 3^k
//		inGiaTriBaMuK(scan);
		// 2. Liệt kê các cặp giá trị gần nhau nhất
//		inCapGiaTriGanNhauNhat(mangSoNguyen);
		// 3. Tạo màng số nguyên từ [-100; 100] ,liệt kê số chẵn thuộc [x,y], 
//		lietKeSoChanTrongKhoangXY(scan);
		// 4. Tạo màng số nguyên từ [-1000; 1000] ,liệt kê số tất cả số lẻ
//		lietKeSoLeTrongMang(scan);
		// 5. Liệt kê số nguyên có chữ số đầu là chẵn
//		lietKeSoDauLaChan(scan);
		// 6. Tính tổng các số dương trong mảng 1 chiều
//		tinhTongSoDuong(scan);
		// 7. Tính tổng các số có số hàng chục là 5 trong mảng
//		tinhTongSoHangChucLa_5(scan);
		// 8. Tính Tổng các số lớn hơn trị tuyệt đối số tiếp theo
//		tinhTongSoLonHonTriTuyetDoi(scan);
		// 9. Tính Trung bình các số nguyên tố trong mảng
//		tinhTBSoNguyenTo(scan);
		// 10. Tính Trung bình các số lớn hơn x do ng dùng nhập
//		tinhTBSoLonHonX(scan);
		// 11. Xóa tất cả số lớn nhất trong mảng số thực
//		xoaSoLonNhatTrongMang(scan);
		// 12. Xóa tất cả số âm trong mảng;
//		xoaSoAmTrongMang(scan);
		// 13. Xóa tất cả số chẵn trong mảng;
//		xoaSoChanTrongMang(scan); 
		// 14. Xóa tất cả số chính phương trong mảng;
//		xoaSoChinhPhongTrongMang(scan);
		// 15. dịch phải mảng k lần
//		dichPhaiMangKLan(scan);
		// 16. Mảng nhập từ bàn phím, xuất phần tử xuất hiện nhiều nhât, ít nhất được tìm thấy đầu tiên
		xuatHienNhieuItNhat(scan);
		// 17. Đạo ngược mảng ban đầu
//		daoNguocMangBanDau(scan);
		// 18. Mảng nhập từ bàn phím, xuất phần tử có số lần xuất hiện như nhau, và nhiều nhất.
	}
		

	private static void xuatHienNhieuItNhat(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNhap[], mangClone[], mangChuaCacSoKhacNhau[];
		int soNhieu = 0, soIt;
		mangNhap = nhapMangInt(scan);
		xuatMang(mangNhap);
		mangChuaCacSoKhacNhau = mangKhacNhau(mangNhap);
		mangClone = demSoCacSoKhacNhau(mangChuaCacSoKhacNhau,mangNhap);
		System.out.println("Mảng chứa khác nhau : ");
		xuatMang(mangChuaCacSoKhacNhau);
		System.out.println("Mảng đếm các số khác nhau : ");
		xuatMang(mangClone);
		soNhieu = mangClone[0];
		soIt = mangClone[0];
		for(int i = 0; i < mangClone.length; i++) {
//			if(soNhieu >= mangClone[i])
				soNhieu = soNhieu >= mangClone[i] ? soNhieu : mangClone[i] ;
				soIt = soIt <= mangClone[i] ? soIt : mangClone[i] ;
		}
		System.out.println(" số nhiều nhất " + soNhieu + " " + "số ít nhất : " + soIt);
		if(soIt == soNhieu ) System.out.println("số phần tử xuất hiện nhiều nhất và ít nhất là như nhau.");
		for(int i = 0; i < mangClone.length; i++) {
			if(mangClone[i] ==  soNhieu) {
				System.out.println("Phần tử xuất hiện nhiều nhất :\t" + mangChuaCacSoKhacNhau[i] + " [" + soNhieu + " lần]");
			}
			if(mangClone[i] == soIt) {
				System.out.println("Phần tử xuất hiện ít nhất :\t" + mangChuaCacSoKhacNhau[i] + " [" + soIt + " lần]");
			}
		}
	}


	private static int[] demSoCacSoKhacNhau(int[] mangChuaCacSoKhacNhau, int[] mangNhap) {
		// TODO Auto-generated method stub
		int mangClone[], soSoKhacNhau = 0;
		mangClone = new int[mangChuaCacSoKhacNhau.length];
		for(int i = 0; i < mangChuaCacSoKhacNhau.length; i++) {
			for(int j = 0; j < mangNhap.length; j++) {
				if(mangChuaCacSoKhacNhau[i] == mangNhap[j])
					mangClone[i]++;
			}
		}
		return mangClone;
	}


	private static int[] mangKhacNhau(int[] mangNhap) {
		// TODO Auto-generated method stub
		int mangClone[], soSoKhacNhau = 0;
		boolean trungNhau = false;
		for(int i = 0; i < mangNhap.length; i++) {
			trungNhau = false;
			if(i == 0) soSoKhacNhau++;
			if(i != 0) {
				for(int j = i - 1; j >= 0; j--) {
					if(mangNhap[i] == mangNhap[j]) {
						trungNhau = true;
						break;
					}
				}
				if(!trungNhau) soSoKhacNhau++;
			}	
		}
		System.out.println("Số số khác nhau : " + soSoKhacNhau);
		mangClone = new int[soSoKhacNhau];
		for(int i = 0, z = 0; i < mangNhap.length; i++) {
			trungNhau = false;
			if(i == 0) {
				mangClone[z] = mangNhap[i];
				z++;
			}
			if(i != 0) {
				for(int j = i - 1; j >= 0; j--) {
					if(mangNhap[i] == mangNhap[j]) {
						trungNhau = true;
						break;
					}
				}
				if(!trungNhau) {
					mangClone[z] = mangNhap[i];
					z++;
				}
			}	
		}
		return mangClone;
	}


	private static int[] xoaPhanTuMang(int[] mangNhap, int valDelete) {
		// TODO Auto-generated method stub
		int soLan = 0, mangClone[];
		for(int i = 0; i < mangNhap.length; i++ ) {
			if(mangNhap[i] != valDelete) soLan++;
		}
		mangClone = new int[soLan];
		for(int i = 0, j = 0; i < mangNhap.length; i++ ) {
			if(mangNhap[i] != valDelete) {
				mangClone[j] = mangNhap[i];
				j++;
			}
		}
		return mangClone;
	}


	private static void daoNguocMangBanDau(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNgauNhien[], mangClone[], indexMangClone = 0;
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		mangClone = new int[mangNgauNhien.length];
		for(int i = 0; i < mangNgauNhien.length; i++) {
			mangClone[i] = mangNgauNhien[mangNgauNhien.length - 1 - i];
		}
		System.out.println("Mảng sau khi đảo : ");
		xuatMang(mangClone);
	}


	private static void dichPhaiMangKLan(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNgauNhien[], k = 0, mangClone[], indexMangClone = 0;
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		System.out.print("Nhập vào số k : ");
		k = Integer.parseInt(scan.nextLine());
		mangClone = new int[mangNgauNhien.length];
		for(int i = mangNgauNhien.length - k; i < mangNgauNhien.length; i++) {
			mangClone[indexMangClone] = mangNgauNhien[i];
			indexMangClone++;
		}
		for(int i = 0; i < mangNgauNhien.length - k ; i++) {
			mangClone[indexMangClone] = mangNgauNhien[i];
			indexMangClone++;
		}
		System.out.println("Mảng sau khi dịch : ");
		xuatMang(mangClone);
	}


	private static void xoaSoChinhPhongTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNgauNhien[], soLanChinhPhuong = 0, mangClone[];
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length; i++) {
			int temp = (int)Math.sqrt(mangNgauNhien[i]);
			if(temp * temp == mangNgauNhien[i]) {
				System.out.println("Số chính phương : " + mangNgauNhien[i]);
				soLanChinhPhuong++;
			}
		}
		mangClone = new int[mangNgauNhien.length - soLanChinhPhuong];
		for(int i = 0, j = 0; i < mangNgauNhien.length; i++) {
			int temp = (int)Math.sqrt(mangNgauNhien[i]);
			if(!(temp * temp == mangNgauNhien[i])){
				mangClone[j] = mangNgauNhien[i];
				j++;
			}
		}
		System.out.print("Mảng sau khi xóa : ");
		xuatMang(mangClone);
	}


	private static void xoaSoChanTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNgauNhien[], soLanSoChan = 0, mangClone[];
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] % 2 == 0) {
				soLanSoChan++;
			}
		}
		mangClone = new int[mangNgauNhien.length - soLanSoChan];
		for(int i = 0, j = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] % 2 != 0) {
				mangClone[j] = mangNgauNhien[i];
				j++;
			}
		}
		System.out.print("Mảng sau khi xóa : ");
		xuatMang(mangClone);
	}


	private static void xoaSoAmTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNgauNhien[], soLanSoAm = 0, mangClone[];
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] < 0) {
				soLanSoAm++;
			}
		}
		mangClone = new int[mangNgauNhien.length - soLanSoAm];
		for(int i = 0, j = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] >= 0) {
				mangClone[j] = mangNgauNhien[i];
				j++;
			}
		}
		System.out.print("Mảng sau khi xóa : ");
		xuatMang(mangClone);
	}


	private static void xoaSoLonNhatTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		float mangNgauNhien[], soLonNhat = 0, mangClone[] ;
		int soLan = 0;
		mangNgauNhien = taoMangNgauNhienFloat(scan, -1000, 1000);
		soLonNhat = mangNgauNhien[0];
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length; i++) {
			soLonNhat = soLonNhat > mangNgauNhien[i] ? soLonNhat : mangNgauNhien[i]; 
		}
		for(int i = 0; i < mangNgauNhien.length; i++) {
			soLan += soLonNhat == mangNgauNhien[i] ? 1 : 0; 
		}
		mangClone = new float[mangNgauNhien.length - soLan];
		System.out.println("Số lớn nhất là : " + soLonNhat + " : "+ soLan);
		for(int i = 0, j = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] != soLonNhat) {
				mangClone[j] = mangNgauNhien[i];
				j++;
			}
		}
		System.out.print("Mảng sau khi xóa : " );
		xuatMang(mangClone);
	}


	private static void tinhTongSoLonHonTriTuyetDoi(Scanner scan) {
		// TODO Auto-generated method stub
		float mangNgauNhien[], tongSo = 0;
		mangNgauNhien = taoMangNgauNhienFloat(scan, -1000, 1000);
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length - 1; i++) {
			if(mangNgauNhien[i] > Math.abs(mangNgauNhien[i+1])) {
				System.out.println("Số lớn hơn : " + mangNgauNhien[i]);
				tongSo += mangNgauNhien[i];
			}
		}
		System.out.println("Tống các số lớn hơn trị tuyệt đối số tiếp theo : " + tongSo);
	}


	private static void tinhTBSoLonHonX(Scanner scan) {
		// TODO Auto-generated method stub
		float mangNgauNhien[], trungBinhCong = 0,  soX;
		int soLan = 0;
		mangNgauNhien = taoMangNgauNhienFloat(scan, -1000, 1000);
		xuatMang(mangNgauNhien);
		System.out.print("Nhập vào số x : ");
		soX = Float.parseFloat(scan.nextLine());
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] > soX) {
				System.out.println("Số lớn hơn " + soX + " : " + mangNgauNhien[i]);
				trungBinhCong += mangNgauNhien[i];
				soLan++;
			}
		}
		if(soLan != 0)
//		System.out.println("Trung bình số lớn hơn " + soX + " : " + (trungBinhCong / soLan) + " so lan : " + soLan);
		System.out.println("Trung bình số lớn hơn " + soX + " : " + (trungBinhCong / soLan));
		else System.out.println("Trung bình số là 0 ");
	}


	private static void tinhTBSoNguyenTo(Scanner scan) {
		// TODO Auto-generated method stub
		int mangNgauNhien[], trungBinhCong = 0, soLan = 0;
		boolean  laSoNguyenTo = false;
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length; i++) {
			laSoNguyenTo = ktraSoNguyenTo(mangNgauNhien[i]);
			if(laSoNguyenTo) {
				System.out.println("Số nguyên tố : " + mangNgauNhien[i]);
				trungBinhCong += mangNgauNhien[i];
				soLan++;
			}
		}
		if(soLan != 0)
//		System.out.println("Trung bình số nguyên tố : " + (trungBinhCong / soLan) + " so lan : " + soLan);
		System.out.println("Trung bình số nguyên tố : " + (trungBinhCong / soLan));
		else System.out.println("Trung bình số nguyên tố là 0 ");
	}

	private static boolean ktraSoNguyenTo(int soNguyen) {
		// TODO Auto-generated method stub
//		boolean  laSoNguyenTo = false;
		if(soNguyen <= 1) return false;
		if(soNguyen == 2) return true;
		if(soNguyen % 2 == 0) return false;
		if(soNguyen == 3) return true;
		if(soNguyen % 3 == 0) return false;
		for(int i = 4; i < soNguyen; i++) {
			if(soNguyen % i == 0) return false;
		}
		return true; 
	}

	private static void tinhTongSoHangChucLa_5(Scanner scan) {
		int mangNgauNhien[], tongSo = 0;
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] / 10 == 5 || mangNgauNhien[i] / 10 == -5)
				tongSo += mangNgauNhien[i];
		}
		System.out.println("\nTống các số hàng chục là 5 : " + tongSo);
	}

	private static void tinhTongSoDuong(Scanner scan) {
		int mangNgauNhien[], tongSoDuong = 0;
		mangNgauNhien = taoMangNgauNhien(scan, -1000, 1000);
		for(int i = 0; i  < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] >= 0)
				tongSoDuong += mangNgauNhien[i];
		}
		System.out.println("Tổng số dương : " + tongSoDuong);
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
	
	private static float[] taoMangNgauNhienFloat(Scanner scan, float soDuoi, float soTren) {
		float mangNgauNhien[];
		System.out.print("\nNhập vào số phần tử : ");
		mangNgauNhien = new float[Integer.parseInt(scan.nextLine())];
		for(int i = 0; i < mangNgauNhien.length; i++) {
			mangNgauNhien[i] = soDuoi + ((float)Math.random() * ((soTren - soDuoi) + 1));
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

	private static void inGiaTriBaMuK(Scanner scan) {
		int mangNgauNhien[];
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		boolean tonTaiGiaTri = false;
		System.out.print("\ngiá trị có dạng 3^k: ");
		for(int i = 0, soChia; i < mangNgauNhien.length ;i++) {
			if(mangNgauNhien[i] == 1) System.out.print(mangNgauNhien[i] + " ");
			if(mangNgauNhien[i] < 3 || mangNgauNhien[i] % 3 != 0 ) {
				continue;
			}
			soChia = 1;
			while(true) {
				soChia *= 3;
				if(mangNgauNhien[i] == soChia) {
					System.out.print(mangNgauNhien[i] + " ");
					tonTaiGiaTri = true;
					break;
				} else if(mangNgauNhien[i] < soChia) {
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
		System.out.print("\n");
	}
	
	private static void xuatMang(float[] mangSoFloat) {
		// TODO Auto-generated method stub
		System.out.print("\nMảng : ");
		for(int i = 0; i <  mangSoFloat.length ;i++) {
			System.out.print( mangSoFloat[i] + " ");
		}
		System.out.print("\n");
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
