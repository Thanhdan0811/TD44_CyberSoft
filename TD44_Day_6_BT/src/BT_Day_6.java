import java.util.Scanner;
import java.util.Arrays;
public class BT_Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 1. Các giá trị có dạng 3^k
//		inGiaTriBaMuK(scan);
		
		// 2. Liệt kê các cặp giá trị gần nhau nhất
//		inCapGiaTriGanNhauNhat(scan);
		
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
//		xuatHienNhieuItNhat(scan);
		
		// 17. Đạo ngược mảng ban đầu
//		daoNguocMangBanDau(scan);
		
		// 18. Mảng nhập từ bàn phím, xuất phần tử có số lần xuất hiện như nhau, và nhiều nhất.
//		xuatHienNhieuNhatVaNhuNhau(scan);
		
	}
		

	// 1. 
	private static void inGiaTriBaMuK(Scanner scan) {
		// Đầu vào
		int mangNgauNhien[];
		boolean tonTaiGiaTri = false;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Xử lý và đầu ra
		System.out.print("\ngiá trị có dạng 3^k: ");
		for(int i = 0, soChia; i < mangNgauNhien.length ;i++) {
			if(mangNgauNhien[i] == 1) System.out.print(mangNgauNhien[i] + " "); // 3^0
			if(mangNgauNhien[i] < 3 || mangNgauNhien[i] % 3 != 0 ) {
				continue;
			}
			soChia = 1;
			while(true) { // nhân lần lượt soChia cho 3 và so sánh
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
		if(!tonTaiGiaTri) System.out.print(0);  // Nếu không có sẽ in ra 0
	}
	
	// 2.
	private static void inCapGiaTriGanNhauNhat(Scanner scan) {
		// Tìm khoảng cách ngắn nhất của 2 số bất kỳ 
		// Sau đó ta sẽ lọc lại các cặp có khoảng cách ngắn nhất và in ra.
		// Đầu vào
		int mangSoNguyen[],soMin;
		// tạo mảng ngẫu nhiên
		mangSoNguyen = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangSoNguyen);
		// xử lý
		soMin = triTuyetDoi(mangSoNguyen[0], mangSoNguyen[1]); // Trả về trị tuyệt đối hiệu 2 số
		
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
	
	// 3.
	private static void lietKeSoChanTrongKhoangXY(Scanner scan) {
		// Đầu vào
		int mangNgauNhien[], x , y;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Nhập dữ liệu
		System.out.print("nhập vào số x : ");
		x = Integer.parseInt(scan.nextLine());
		System.out.print("nhập vào số y : ");
		y = Integer.parseInt(scan.nextLine());
		// Xử lý và đầu ra
		System.out.print("Các số thuộc [" + x + ":" + y + "] : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] >= x && mangNgauNhien[i] <= y && mangNgauNhien[i] % 2 == 0)
				System.out.print(mangNgauNhien[i] + "  ");
		}
	}
	
	// 4.
	private static void lietKeSoLeTrongMang(Scanner scan) {
		/*
		 * Ý Tưởng : Ta sẽ lấy các mốc cần so sánh lần lượt là 10, 100, 1000, 10000, ....
		 * Ktra xem phần tử sẽ nhỏ hơn mốc nào : vd 55 < 100 => ta sẽ chia cho 10 ; 125 < 1000 => chia cho 100
		 * Nếu nhỏ hơn 10 ta sẽ xuất luôn kết quả, nếu lớn hơn 10 ta sẽ phải tách số ktra chẵn lẻ
		 */
		// Đầu vào
		int mangNgauNhien[], soSoSanh, soTam , soKtra = 0;
		boolean ktraSoAm = false, ktrSoLe = false;
		// tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -1000, 1000);
		xuatMang(mangNgauNhien);
		// xử lý
		System.out.print("\nCác số có tất cả số là số lẻ trong mảng : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			ktrSoLe = true;  // Ktra số lẻ
			ktraSoAm = false; // Ktra số chẵn
			if(mangNgauNhien[i] < 0) { // Nếu nhỏ hơn 0 thì đảo dấu
				mangNgauNhien[i] = -mangNgauNhien[i];
				ktraSoAm = true;
			}
			if(mangNgauNhien[i] < 10) { // Nếu nhỏ hơn 10 thì kiểm tra luôn cho nhanh
				if(ktraSoAm) mangNgauNhien[i] = -mangNgauNhien[i];
				if(mangNgauNhien[i] % 2 != 0) {
					System.out.print(mangNgauNhien[i] + " ");
					continue;
				} else continue;
			}
			soSoSanh = 100; // Vì đã ktra số nhỏ hơn 10, nên t sẽ kiểm tra tiếp số lớn hơn hoặc = 10 và nhỏ hơn 100
			while(mangNgauNhien[i] > soSoSanh) { // so sánh xem phần tử nhỏ hơn ở mốc nào : 100 hay 1000
				soSoSanh *= 10;
			}
			soSoSanh /= 10; // Trả về 10 lần so với so sánh vd phần tủ  = 45, soSoSanh = 100 => soSosanh = 10 ==> 45 / 10 = 4.;
			// Lúc này tách và kiếm tra các số
			do {
				soKtra = mangNgauNhien[i] / soSoSanh; // vd 125 ; soSosanh = 100, soKtra = 1 => soSosanh = 10, soKtra = 12 => soSosanh = 1, soKtra = 125
				if(soKtra % 2 == 0) {
					ktrSoLe = false;
					break;  // Ktr chẵn lẻ, ko cần gán lại biến boolean do đã set mặc định false
				}
				if(soSoSanh != 1) soSoSanh /= 10;
				else break;
			} while(true);
			// đầu ra
			if(ktraSoAm) mangNgauNhien[i] = -mangNgauNhien[i];
			if(ktrSoLe) System.out.print(mangNgauNhien[i] + " ");
			else continue;
		}
	}
	
	// 5.
	private static void lietKeSoDauLaChan(Scanner scan) {
		// Gán 10 cho biến soSoSanh (số so sánh)
		// kiếm tra phần tử có < 10 nếu có lấy phần tử chia cho 1( soSoSanh chia 10 )
		// Nếu lớn hơn soSoSanh(lúc này = 10) thì tăng soSoSanh lên 10 lần tức = 100
		// kiếm tra phần tử có < 100 nếu có lấy phần tử chia cho 10 (soSoSanh chia 10)
		// Nếu ko tiếp tục cho đến khi nhỏ hơn bội của 10
		
		// Đầu vào
		int mangNgauNhien[], soSoSanh;
		byte soDauTien = 0;
		boolean ktraSoAm = false;
		// tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Xử lý
		System.out.print("\nCác số đầu là chẵn trong mảng : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			soSoSanh = 10;
			if(mangNgauNhien[i] < 0) { // Nếu phần tử mảng là số âm ta chuyển thành dương và gán biến boolean thành true
				mangNgauNhien[i] = -mangNgauNhien[i];
				ktraSoAm = true;
			}
			while(true) {
				if(mangNgauNhien[i] < soSoSanh) {
					soDauTien = (byte)(mangNgauNhien[i] / (soSoSanh / 10));  // Lấy số đầu tiên
					if(ktraSoAm) {  // Kiểm tra lúc đầu có phải là số âm ko , nếu có thì trả lại và gán lại false cho boolean
						mangNgauNhien[i] = -mangNgauNhien[i];
						ktraSoAm = false;
					}
					if(soDauTien % 2 == 0)	System.out.print(mangNgauNhien[i] + "  ");
					break;
				}
				soSoSanh *= 10; // Nếu ko đúng tăng soSoSanh lên 10 lần
			}
		}
	}
	
	
	// 6.
	private static void tinhTongSoDuong(Scanner scan) {
		// Đầu vào
		int mangNgauNhien[], tongSoDuong = 0;
		// tọa mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -1000, 1000);
		xuatMang(mangNgauNhien);
		// Xử lý
		for(int i = 0; i  < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] >= 0)
				tongSoDuong += mangNgauNhien[i];
		}
		// đầu ra
		System.out.println("\nTổng số dương : " + tongSoDuong);
	}
	

	// 7.
	private static void tinhTongSoHangChucLa_5(Scanner scan) {
		// Đầu vào
		int mangNgauNhien[], tongSo = 0;
		// tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Xử lý
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] / 10 == 5 || mangNgauNhien[i] / 10 == -5)
				tongSo += mangNgauNhien[i];
		}
		// Đầu ra
		System.out.println("\nTống các số hàng chục là 5 : " + tongSo);
	}
	
	
	// 8.
	private static void tinhTongSoLonHonTriTuyetDoi(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		float mangNgauNhien[], tongSo = 0;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhienFloat(scan, -1000, 1000);
		xuatMang(mangNgauNhien);
		// XỬ lý
		for(int i = 0; i < mangNgauNhien.length - 1; i++) {
			if(mangNgauNhien[i] > Math.abs(mangNgauNhien[i+1])) {
				System.out.println("Số lớn hơn : " + mangNgauNhien[i]);
				tongSo += mangNgauNhien[i];
			}
		}
		// Đầu ra
		System.out.println("Tống các số lớn hơn trị tuyệt đối số tiếp theo : " + tongSo);
	}
	
	
	// 9.
	private static void tinhTBSoNguyenTo(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNgauNhien[], trungBinhCong = 0, soLan = 0;
		boolean  laSoNguyenTo = false;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// XỬ lý
		for(int i = 0; i < mangNgauNhien.length; i++) {
			laSoNguyenTo = ktraSoNguyenTo(mangNgauNhien[i]);
			if(laSoNguyenTo) {
				System.out.println("Số nguyên tố : " + mangNgauNhien[i]);
				trungBinhCong += mangNgauNhien[i];
				soLan++;
			}
		}
		// Đầu ra
		if(soLan != 0)
		System.out.println("Trung bình số nguyên tố : " + (trungBinhCong / soLan));
		else System.out.println("Trung bình số nguyên tố là 0 ");
	}
	
	private static boolean ktraSoNguyenTo(int soNguyen) {
		// TODO Auto-generated method stub
		// Xử lý
		if(soNguyen <= 1) return false;
		if(soNguyen == 2) return true;
		if(soNguyen % 2 == 0) return false;
		if(soNguyen == 3) return true;
		if(soNguyen % 3 == 0) return false;
		for(int i = 4; i < soNguyen; i++) {
			if(soNguyen % i == 0) return false;
		}
		// Đầu ra
		return true; 
	}
	
	
	// 10.
	private static void tinhTBSoLonHonX(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		float mangNgauNhien[], trungBinhCong = 0,  soX;
		int soLan = 0;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhienFloat(scan, -1000, 1000);
		xuatMang(mangNgauNhien);
		// Nhập dữ liệu
		System.out.print("Nhập vào số x : ");
		soX = Float.parseFloat(scan.nextLine());
		// Xử lý
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] > soX) {
				System.out.println("Số lớn hơn " + soX + " : " + mangNgauNhien[i]);
				trungBinhCong += mangNgauNhien[i];
				soLan++;
			}
		}
		// Đầu ra
		if(soLan != 0)
		System.out.println("Trung bình số lớn hơn " + soX + " : " + (trungBinhCong / soLan));
		else System.out.println("Trung bình số là 0 ");  // Nếu không có số nào lớn hơn X
	}
	
	
	// 11.
	private static void xoaSoLonNhatTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		float mangNgauNhien[], soLonNhat = 0, mangClone[] ;
		int soLan = 0;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhienFloat(scan, -1000, 1000);
		soLonNhat = mangNgauNhien[0];
		xuatMang(mangNgauNhien);
		// xử lý
		for(int i = 0; i < mangNgauNhien.length; i++) {
			soLonNhat = soLonNhat > mangNgauNhien[i] ? soLonNhat : mangNgauNhien[i]; 
		}
		for(int i = 0; i < mangNgauNhien.length; i++) {
			soLan += soLonNhat == mangNgauNhien[i] ? 1 : 0; 
		}
		mangClone = new float[mangNgauNhien.length - soLan];
		System.out.println("Số lớn nhất là : " + soLonNhat + " Số lần xuất hiện : "+ soLan);
		for(int i = 0, j = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] != soLonNhat) {
				mangClone[j] = mangNgauNhien[i];
				j++;
			}
		}
		// Đầu ra
		System.out.print("Mảng sau khi xóa : " );
		xuatMang(mangClone);
	}
	
	
	// 12.
	private static void xoaSoAmTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNgauNhien[], soLanSoAm = 0, mangClone[];
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Xử lý
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
		// Đầu ra
		System.out.print("Mảng sau khi xóa : ");
		xuatMang(mangClone);
	}
	
	
	// 13.
	private static void xoaSoChanTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNgauNhien[], soLanSoChan = 0, mangClone[];
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// xử lý 
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
		// Đầu ra
		System.out.print("Mảng sau khi xóa : ");
		xuatMang(mangClone);
	}
	
	
	// 14.
	private static void xoaSoChinhPhongTrongMang(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNgauNhien[], soLanChinhPhuong = 0, mangClone[];
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Xử lý
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] == 0) continue;
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
		// Đầu vào
		System.out.print("Mảng sau khi xóa : ");
		xuatMang(mangClone);
	}
	
	
	// 15. 
	private static void dichPhaiMangKLan(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNgauNhien[], k = 0, mangClone[], indexMangClone = 0;
		// Mảng đầu vào
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Nhập dữ liệu
		System.out.print("Nhập vào số k : ");
		k = Integer.parseInt(scan.nextLine());
		// xử lý
		mangClone = new int[mangNgauNhien.length];
		for(int i = mangNgauNhien.length - k; i < mangNgauNhien.length; i++) { // clone k phần tử lên đầu mảng
			mangClone[indexMangClone] = mangNgauNhien[i];
			indexMangClone++;
		}
		for(int i = 0; i < mangNgauNhien.length - k ; i++) { // clone các phần tử còn lại vào mảng
			mangClone[indexMangClone] = mangNgauNhien[i];
			indexMangClone++;
		}
		// Đầu ra
		System.out.println("Mảng sau khi dịch : ");
		xuatMang(mangClone);
	}
	
	
	// 16.
	private static void xuatHienNhieuItNhat(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNhap[], mangSoLanXuatHien[], mangCacSoKhacNhau[];
		int soNhieu = 0, soIt;
		// Tạo mảng ngẫu nhiên
		mangNhap = nhapMangInt(scan);
		xuatMang(mangNhap);
		// Xử lý
		mangCacSoKhacNhau = mangKhacNhau(mangNhap);
		mangSoLanXuatHien = demSoCacSoKhacNhau(mangCacSoKhacNhau,mangNhap);
		//******
		soNhieu = mangSoLanXuatHien[0];
		soIt = mangSoLanXuatHien[0];
		for(int i = 0; i < mangSoLanXuatHien.length; i++) {
				soNhieu = soNhieu >= mangSoLanXuatHien[i] ? soNhieu : mangSoLanXuatHien[i] ;
				soIt = soIt <= mangSoLanXuatHien[i] ? soIt : mangSoLanXuatHien[i] ;
		}
		// Đầu ra
		if(soIt == soNhieu ) System.out.println("số phần tử xuất hiện nhiều nhất và ít nhất là như nhau.");
		for(int i = 0; i < mangSoLanXuatHien.length; i++) {
			if(mangSoLanXuatHien[i] ==  soNhieu) {
				System.out.println("Phần tử xuất hiện nhiều nhất :\t" + mangCacSoKhacNhau[i] + " [" + soNhieu + " lần]");
				break;
			}
		}
		for(int i = 0; i < mangSoLanXuatHien.length; i++) {
			if(mangSoLanXuatHien[i] == soIt) {
				System.out.println("Phần tử xuất hiện ít nhất :\t" + mangCacSoKhacNhau[i] + " [" + soIt + " lần]");
				break;
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
	
	
	// 17.
	private static void daoNguocMangBanDau(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangNgauNhien[], mangClone[], indexMangClone = 0;
		// Tạo mảng ngẫu nhiên
		mangNgauNhien = taoMangNgauNhien(scan, -100, 100);
		xuatMang(mangNgauNhien);
		// Xử lý
		mangClone = new int[mangNgauNhien.length];
		for(int i = 0; i < mangNgauNhien.length; i++) {
			mangClone[i] = mangNgauNhien[mangNgauNhien.length - 1 - i];
		}
		// Đầu ra
		System.out.println("Mảng sau khi đảo : ");
		xuatMang(mangClone);
	}
	
	// 18.
	private static void xuatHienNhieuNhatVaNhuNhau(Scanner scan) {
		// TODO Auto-generated method stub
		// Đầu vào
			int mangNhap[], mangClone[], mangChuaCacSoKhacNhau[];
			int soNhieu = 0;
			// Tạo mảng ngẫu nhiên
			mangNhap = nhapMangInt(scan);
			xuatMang(mangNhap);
			// Xử lý
			mangChuaCacSoKhacNhau = mangKhacNhau(mangNhap);
			mangClone = demSoCacSoKhacNhau(mangChuaCacSoKhacNhau,mangNhap);
			// ********* 
			soNhieu = mangClone[0];
			for(int i = 0; i < mangClone.length; i++) {
					soNhieu = soNhieu >= mangClone[i] ? soNhieu : mangClone[i] ;
			}
			// Đầu ra
			if(soNhieu == 1 ) {
				System.out.println("Các phần tử đều xuất hiện chỉ 1 lần");
				return;
			}
			for(int i = 0; i < mangClone.length; i++) {
				if(mangClone[i] ==  soNhieu) {
					System.out.println("Phần tử xuất hiện nhiều nhất :\t" + mangChuaCacSoKhacNhau[i] + " [" + soNhieu + " lần]");
				}
			}
	}
	
	

	// Các hàm chức năng khác
	
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
		System.out.print("Mảng : ");
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
