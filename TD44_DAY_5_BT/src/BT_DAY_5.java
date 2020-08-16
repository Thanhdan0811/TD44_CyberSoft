import java.util.Scanner;

public class BT_DAY_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// đầu vào
		int soPhanTu, luaChon;
		int mangSoNguyen[];
		System.out.print("số phần tử mảng : " );
		soPhanTu = Integer.parseInt(scan.nextLine());
		while(soPhanTu < 1) {
			System.out.println("Số phần tử cần lớn hơn 2, bạn hãy nhập lại");
			System.out.print("số phần tử mảng : " );
			soPhanTu = Integer.parseInt(scan.nextLine());
		}
		mangSoNguyen = new int[soPhanTu];
		// Nhập mảng
		for(int i = 0; i < mangSoNguyen.length ; i++) {
			System.out.print("Nhập vào mangSoNguyen[" + i + "] : ");
			mangSoNguyen[i] = Integer.parseInt(scan.nextLine());
		}

		System.out.print("Mảng đã nhập mangSoNguyen[] : " );
		for(int i = 0; i < mangSoNguyen.length ; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
		// xửa lý
		// In Menu
		luaChon = inMenu(scan);
		xuLyLuaChon(luaChon, mangSoNguyen, scan);
	}

	private static void xuLyLuaChon(int luaChon, int[] mangSoNguyen, Scanner scan) {
		switch(luaChon) {
		case 1:
			tongSoDuong(mangSoNguyen);
			break;
		case 2:
			demSoDuong(mangSoNguyen);
			break;
		case 3:
			timSoMin(mangSoNguyen);
			break;
		case 4:
			timSoDuongMin(mangSoNguyen);
			break;
		case 5:
			timSoChanCuoiCung(mangSoNguyen);
			break;
		case 6:
			doiCho_2_ViTri(mangSoNguyen, scan);
			break;
		case 7:
			sapXepTangDan(mangSoNguyen);
			break;
		case 8:
			timSoNguyenToDauTien(mangSoNguyen);
			break;
		case 9:
			nhapMangSoThuc(scan);
			break;
		case 10:
			soSanhSoDuongSoAm(mangSoNguyen);
			break;
		}
	}


	private static void tongSoDuong(int[] mangSoNguyen) {
		// Đầu vào 
		int tongSoDuong = 0;
		// Xử lý 		
		for(int i = 0; i < mangSoNguyen.length ; i++)
			tongSoDuong += mangSoNguyen[i] >= 0 ? mangSoNguyen[i] : 0;
		// Đầu Ra
		System.out.println("Tổng số dương : " + tongSoDuong);
	}

	private static void demSoDuong(int[] mangSoNguyen) {
		// Đầu vào
		int demSoDuong = 0;
		// Xử lý
		for(int i = 0; i < mangSoNguyen.length ; i++)
			demSoDuong += mangSoNguyen[i] >= 0 ? 1 : 0;
		// Đầu ra
		System.out.println("số số dương trong mảng : " + demSoDuong);
	}

	private static void timSoMin(int[] mangSoNguyen) {
		// Đầu vào
		int soMin;
		soMin = mangSoNguyen[0];
		// Xử lý
		for(int i = 1; i < mangSoNguyen.length ; i++) {
			soMin = !(soMin >= mangSoNguyen[i]) ? soMin : mangSoNguyen[i];
		}
		// Đầu ra
		System.out.println("Số nhỏ nhất là : " + soMin);
	}

	private static void timSoDuongMin(int[] mangSoNguyen) {
		// Đầu vào
		int soDuongMin = 0;
		boolean check = true;
		// Xử lý
		for(int i = 0; i < mangSoNguyen.length ; i++) {
			if(mangSoNguyen[i] >= 0) {
				if(check) {
					soDuongMin = mangSoNguyen[i];
					check = false;
				} else 
					soDuongMin = !(soDuongMin >= mangSoNguyen[i]) ? soDuongMin : mangSoNguyen[i];
			}
		}
		// Đầu ra
		if(check) System.out.println("Không có số dương nhỏ nhất");
		else	  System.out.println("Số nguyên dương nhỏ nhất là : " + soDuongMin);
	}

	private static void timSoChanCuoiCung(int[] mangSoNguyen) {
		// Đầu vào
		int soChanCuoi = -1;
		// Xử lý
		for(int i = 0; i < mangSoNguyen.length ; i++)
			if(mangSoNguyen[i] % 2 == 0) {
				soChanCuoi = i;
			}
		// Đầu ra
		System.out.println(soChanCuoi);
	}

	private static void doiCho_2_ViTri(int[] mangSoNguyen, Scanner scan) {
		// Đầu vào
		int viTri_1, viTri_2, swapValue;
		boolean kiemTraNhap = true;
		// Kiểm tra nếu mảng chỉ có 1 phần tử
		if(mangSoNguyen.length < 2) {
			System.out.println("Mảng của bạn có ít hơn 2 phần tử, không thể đổi vị trí");
			return;
		}
		// Nhập dữ liệu
		System.out.print("Vị trí thứ nhất : ");
		viTri_1 =  Integer.parseInt(scan.nextLine());
		System.out.print("Vị trí thứ hai : ");
		viTri_2 =  Integer.parseInt(scan.nextLine());
		kiemTraNhap = (viTri_1 >= 0 && viTri_1 < mangSoNguyen.length && viTri_2 >= 0 && viTri_2 < mangSoNguyen.length )
					 ? true : false;
		while(!kiemTraNhap) {
			System.out.println("Bạn đã nhập sai vị trí, hãy nhập lại");
			System.out.print("Vị trí thứ nhất : ");
			viTri_1 =  Integer.parseInt(scan.nextLine());
			System.out.print("Vị trí thứ hai : ");
			viTri_2 =  Integer.parseInt(scan.nextLine());
			kiemTraNhap = (viTri_1 >= 0 && viTri_1 < mangSoNguyen.length && viTri_2 >= 0 && viTri_2 < mangSoNguyen.length )
						 ? true : false;
		}
		// Xử lý
		swapValue = mangSoNguyen[viTri_1];
		mangSoNguyen[viTri_1] = mangSoNguyen[viTri_2];
		mangSoNguyen[viTri_2] = swapValue;
		// Đầu ra
		System.out.print("Mảng sau khi đổi vị trí mangSoNguyen[] : " );
		for(int i = 0; i < mangSoNguyen.length ; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}

	private static void sapXepTangDan(int[] mangSoNguyen) {
		// Đầu vào 
		int higerValue;
		// Xử lý :  sử dụng bubble sort
		for(int i = 0; i < mangSoNguyen.length; i++) {
			for(int j = 0; j < mangSoNguyen.length - 1 - i; j++) {
				if(mangSoNguyen[j] > mangSoNguyen[j+1]) {
					higerValue = mangSoNguyen[j];
					mangSoNguyen[j] = mangSoNguyen[j+1];
					mangSoNguyen[j+1] = higerValue;
				}
			}
		}
		// Đầu ra
		System.out.print("Mảng sau khi sắp xếp mangSoNguyen : " );
		for(int i = 0; i < mangSoNguyen.length ; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}

	private static void timSoNguyenToDauTien(int[] mangSoNguyen) {
		// Đầu vào
		int soNguyenToDauTien = -1;
		// Xử lý
		for(int i = 0; i < mangSoNguyen.length; i++) {
			// Bỏ qua các số <= 1
			if(mangSoNguyen[i] <= 1) continue;
			// Nếu số đầu tiên là 2
			if(mangSoNguyen[i] == 2) {
				soNguyenToDauTien = 2;
				break;
			}
			// Kiểm tra các số khác 
			for(int j = 2; j < mangSoNguyen[i]; j++) {
				if(mangSoNguyen[i] % j == 0) {
					soNguyenToDauTien = -1;
					break;
				} else {
					soNguyenToDauTien = mangSoNguyen[i];
				}
			}
			if(soNguyenToDauTien != -1) break;
			
			
		}
		// Đầu ra
		System.out.println("Số nguyên tố đầu tiên : " +  soNguyenToDauTien);
	}

	private static void nhapMangSoThuc(Scanner scan) {
		// Đầu vào
		int soPhanTu, soSoNguyen = 0;
		float mangSoThuc[];
		// NHập dữ liệu
		System.out.print("số phần tử mảng : " );
		soPhanTu = Integer.parseInt(scan.nextLine());
		while(soPhanTu < 1) {
			System.out.println("Số phần tử cần lớn hơn 2, bạn hãy nhập lại");
			System.out.print("số phần tử mảng : " );
			soPhanTu = Integer.parseInt(scan.nextLine());
		}
		mangSoThuc = new float[soPhanTu];
		// Nhập mảng
		for(int i = 0; i < mangSoThuc.length ; i++) {
			System.out.print("Nhập vào mangSoThuc[" + i + "] : ");
			mangSoThuc[i] = Float.parseFloat(scan.nextLine());
		}
		// Xử lý 
		for(int i = 0; i < mangSoThuc.length; i++) {
			soSoNguyen += mangSoThuc[i] % 1 == 0 ? 1 : 0;
		}
		// Đầu ra
		System.out.print("Mảng đã nhập mangSoThuc[] : " );
		for(int i = 0; i < mangSoThuc.length ; i++) {
			System.out.print(mangSoThuc[i] + " ");
		}
		System.out.println("\nSố số nguyên trong mảng : " + soSoNguyen);
	}

	private static void soSanhSoDuongSoAm(int[] mangSoNguyen) {
		// Đầu vào
		int soSoDuong=0, soSoAm=0;
		// Xử lý
		for(int i = 0; i < mangSoNguyen.length; i++) {
			soSoDuong += mangSoNguyen[i] >= 0 ? 1 : 0; 
		}
		soSoAm = mangSoNguyen.length - soSoDuong;
		// Đầu ra
		if(soSoDuong > soSoAm) {
			System.out.println("Số dương nhiều hơn, với " + soSoDuong + " số");
			return;
		} else if(soSoDuong < soSoAm) {
			System.out.println("Số âm nhiều hơn, với " + soSoAm + " số");
			return;
		} System.out.println("bằng nhau");
	}

	private static int inMenu(Scanner scan) {
		// Đầu vào
		int luaChon;
		// Nhập dữ liệu
		System.out.println("\nMenu : ");
		System.out.println("\t1. TỔng số dương ");
		System.out.println("\t2. Đếm số dương trong mảng ");
		System.out.println("\t3. Tìm số nhỏ nhât ");
		System.out.println("\t4. Tìm số dương nhỏ nhất ");
		System.out.println("\t5. Số chẵn cuối cùng trong mảng ");
		System.out.println("\t6. Đổi 2 giá trị trong mảng theo vị trí ");
		System.out.println("\t7. Sắp xếp theo thứ tự tăng dần ");
		System.out.println("\t8. Tìm số nguyên tố đầu tiên ");
		System.out.println("\t9. Nhập thêm 1 mảng số thực, và tìm xem có bao nhiêu số nguyên ");
		System.out.println("\t10. So sánh số lượng số ầm và số dương ");
		System.out.println("\tLựa chọn : ");
		luaChon = Integer.parseInt(scan.nextLine());
		// Xử lý
		while(10 < luaChon || luaChon < 1  ) {
			System.out.println("Bạn đã nhập sai, hãy nhập lại");
			System.out.println("\tLựa chọn : ");
			luaChon = Integer.parseInt(scan.nextLine());
		}
		// Đầu ra
		return luaChon;
	}
	
}
