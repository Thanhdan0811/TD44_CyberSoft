import java.util.Scanner;
/*
 * Cho người dùng nhập vào n số nguyên và lưu trữ trong mảng.
Làm menu cho người dùng chọn thực hiện các chức năng bên dưới: 

1. Tổng các số dương  trong mảng.
2. Đếm có bao nhiêu số dương trong mảng.
3. Tìm số nhỏ nhất trong mảng.
4. Tìm số dương nhỏ nhất trong mảng.
5. Tìm số chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1.
6. Đổi chỗ 2 giá trị trong mảng theo vị trí (Cho nhập vào 2 vị trí muốn đổi chỗ giá trị).
7. Sắp xếp mảng theo thứ tự tăng dần.
8. Tìm số nguyên tố đầu tiên trong mảng. Nếu mảng không có số nguyên tố thì trả về – 1.
9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên?
10. So sánh số lượng số dương và số lượng số âm xem số nào nhiều hơn.
 */

public class BaiTapBuoi5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = nhapMang(scan);
		xuLy(scan, a);
	}

	// HÀM YÊU CẦU NHẬP MỘT SỐ NGUYÊN LỚN HƠN 1
	public static int nhapSoLonHon1(Scanner scan) {
		int n;
		do {
			System.out.println("Mời nhập vào một SỐ NGUYÊN lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}

	// HÀM NHẬP MẢNG CÓ GIÁ TRỊ LÀ SỐ NGUYÊN
	public static int[] nhapMang(Scanner scan) {
		System.out.println("Bạn muốn tạo mảng có bao nhiêu phần tử?");
		int n = nhapSoLonHon1(scan);
		int[] a = new int[n];
		System.out.println("Mời nhập vào các giá trị SỐ NGUYÊN cho mảng");
		for (int i = 0; i < n; i++) {
			System.out.print("a [" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	// HÀM IN MENU CÁC LỰA CHỌN
	public static void inMeNu() {
		System.out.println("MENU\n1. Tổng các số dương trong mảng.");
		System.out.println("2. Đếm có bao nhiêu số dương trong mảng.");
		System.out.println("3. Tìm số nhỏ nhất trong mảng.");
		System.out.println("4. Tìm số dương nhỏ nhất trong mảng.");
		System.out.println("5. Tìm số chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1.");
		System.out.println("6. Đổi chỗ 2 giá trị trong mảng theo vị trí (Cho nhập vào 2 vị trí muốn đổi chỗ giá trị)");
		System.out.println("7. Sắp xếp mảng theo thứ tự tăng dần.");
		System.out.println("8. Tìm số nguyên tố đầu tiên trong mảng. Nếu mảng không có số nguyên tố thì trả về – 1");
		System.out.println("9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên?");
		System.out.println("10. So sánh số lượng số dương và số lượng số âm xem số nào nhiều hơn.");
		System.out.println("0. THOÁT");
	}

	// HÀM GỌI MENU ĐỂ LỰA CHỌN
	public static void xuLy(Scanner scan, int a[]) {
		int nhapLuaChon;
		inMeNu();
		do {
			System.out.println("Mời chọn >>");
			nhapLuaChon = Integer.parseInt(scan.nextLine());
			switch (nhapLuaChon) {
			case 1:
				tinhTongDuong(a);
				break;
			case 2:
				demSoDuong(a);
				break;
			case 3:
				timNhoNhat(a);
				break;
			case 4:
				timDuongNhoNhat(a);
				break;
			case 5:
				timSoChanCuoiCung(a);
				break;
			case 6:
				doiCho(a, scan);
				break;
			case 7:
				sapXepMang(a);
				break;
			case 8:
				timSoNguyenToDauTien(a);
				break;
			case 9:
				timSoNguyen(scan);
				break;
			case 10:
				soSanhDuongAm(a);
				break;
			case 0:
				System.out.println("Chương trình ĐÃ DỪNG!");
				break;
			default:
				System.out.println("Chỉ chọn từ 0 đến 10! Please---->>");
			}
		} while (nhapLuaChon != 0);
	}

	// HÀM 1: TÍNH TỔNG CÁC SỐ DƯƠNG
	public static void tinhTongDuong(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				tong += a[i];
			}
		}
		if (tong == 0) {
			System.out.println("Mảng không có số dương");
		} else {
			System.out.println("Tổng các số dương trong mảng là: " + tong);
		}
	}

	// HÀM 2: ĐẾM CÓ BAO NHIÊU SỐ DƯƠNG
	public static void demSoDuong(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Mảng không có số dương");
		} else {
			System.out.println("Mảng có " + count + " số dương");
		}
	}

	// HÀM 3: TÌM SỐ NHỎ NHẤT TRONG MẢNG
	public static void timNhoNhat(int a[]) {
		int indexMin = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[indexMin]) {
				indexMin = i;
			}
		}
		System.out.println("Số nhỏ nhất trong mảng là: " + a[indexMin]);
	}

	// HÀM 4: TÌM SỐ DƯƠNG NHỎ NHẤT TRONG MẢNG
	public static void timDuongNhoNhat(int a[]) {
		// Xử lý 1: Tìm vị trí số dương đầu tiên
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				index = i;
				break;
			}
		}

		// Xử lý 2: Tìm số dương nhỏ nhất
		if (index >= 0) {
			for (int i = index + 1; i < a.length; i++) {
				if ((a[i] < a[index]) && (a[i] > 0)) {
					index = i;
				}
			}
			System.out.println("Số dương nhỏ nhất là: " + a[index]);
		} else {
			System.out.println("Mảng không có số dương");
		}
	}

	// HÀM 5: TÌM SỐ CHẴN CUỐI CÙNG
	public static void timSoChanCuoiCung(int a[]) {
		int soChanCuoiCung = -1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				soChanCuoiCung = a[i];
				break;
			}
		}
		if (soChanCuoiCung == -1) {
			System.out.println("Mảng không có số chẵn");
		} else {
			System.out.println("Số chẵn cuối cùng của mảng là: " + soChanCuoiCung);
		}
	}

	// HÀM 6: ĐỔI CHỖ 2 GIÁ TRỊ TRONG MẢNG
	public static void doiCho(int a[], Scanner scan) {
		// Xử lý 1: Yêu cầu nhập 2 số nguyên trong khoảng 0-a.length
		int viTri_1 = 0;
		int viTri_2 = 0;
		do {
			System.out.println("Mời nhập vị trí thứ 1 muốn đổi chỗ. Giá trị từ 0 đến " + (a.length - 1));
			viTri_1 = Integer.parseInt(scan.nextLine());
		} while ((viTri_1 < 0) || (viTri_1 >= a.length));

		do {
			System.out.println("Mời nhập vị trí thứ 2 muốn đổi chỗ. Giá trị từ 0 đến " + (a.length - 1)
					+ " và phải khác vị trí thứ 1");
			viTri_2 = Integer.parseInt(scan.nextLine());
		} while ((viTri_2 < 0) || (viTri_2 >= a.length) || (viTri_2 == viTri_1));

		// Xử lý 2: Dùng biến tạm để hoán vị 2 giá trị
		int temp = a[viTri_1];
		a[viTri_1] = a[viTri_2];
		a[viTri_2] = temp;
		System.out.println("Giá trị 2 vị trí đã đổi chỗ là\na [" + viTri_1 + "] = " + a[viTri_1] + "\na [" + viTri_2
				+ "] = " + a[viTri_2]);
	}

	// HÀM 7: SẮP XẾP MẢNG THEO THỨ TỰ TĂNG DẦN
	public static void sapXepMang(int a[]) {
		// Xử lý 1: Sắp xếp mảng theo thứ tự tăng dần
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Xử lý 2: In ra mảng đã sắp xếp
		System.out.println("Mảng đã sắp xếp là");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	// HÀM CHECK MỘT SỐ CÓ PHẢI LÀ SỐ NGUYÊN TỐ KHÔNG
	public static boolean checkSoNguyenTo(int n) {
		/*
		 * nếu n<2 thì không phải nếu n>=2 thì tính căn bậc 2 của n sau đó cho i chạy từ
		 * 2 đến căn, nếu n chia hết i thì n không phải số nguyên tố
		 */
		if (n < 2) {
			return false;
		}
		int temp = (int) (Math.sqrt(n));
		for (int i = 2; i <= temp; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// HÀM 8: TÌM SỐ NGUYÊN TỐ ĐẦU TIÊN
	public static void timSoNguyenToDauTien(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (checkSoNguyenTo(a[i])) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Mảng không có số nguyên tố");
		} else {
			System.out.println("Số nguyên tố đầu tiên là: " + a[index]);
		}
	}

	// HÀM KIỂM TRA 1 SỐ THỰC CÓ PHẢI LÀ SỐ NGUYÊN KHÔNG
	public static boolean checkSoNguyen(float n) {
		n = Math.abs(n);
		int giaTriNguyen = (int) n;
		if (n - giaTriNguyen == 0) {
			return true;
		} else {
			return false;
		}
	}

	// HÀM NHẬP MẢNG CÓ GIÁ TRỊ LÀ SỐ THỰC
	public static float[] nhapMangSoThuc(Scanner scan) {
		System.out.println("Bạn muốn tạo mảng có bao nhiêu phần tử?");
		int n = nhapSoLonHon1(scan);
		float[] a = new float[n];
		System.out.println("Mời nhập vào các giá trị SỐ THỰC cho mảng");
		for (int i = 0; i < n; i++) {
			System.out.println("a [" + i + "] = ");
			a[i] = Float.parseFloat(scan.nextLine());
		}
		return a;
	}

	// HÀM 9: TÌM TRONG MẢNG SỐ THỰC CÓ BAO NHIÊU SỐ NGUYÊN
	public static void timSoNguyen(Scanner scan) {
		// Xử lý 1: Tạo và cho nhập giá trị của mảng số thực mới
		System.out.println("Tạo mảng số thực mới");
		float[] a = nhapMangSoThuc(scan);

		// Xử lý 2: Check số nguyên trong mảng
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (checkSoNguyen(a[i])) {
				count++;
			}
		}
		System.out.println("Trong mảng có " + count + " số nguyên");
	}

	// HÀM 10: SO SÁNH SỐ LƯỢNG SỐ DƯƠNG & ÂM
	public static void soSanhDuongAm(int a[]) {
		int soDuong = 0;
		int soAm = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				soDuong++;
			else if (a[i] < 0)
				soAm++;
		}
		if (soDuong > soAm) {
			System.out.println("Mảng có nhiều số Dương hơn số Âm");
		} else if (soDuong < soAm) {
			System.out.println("Mảng có nhiều số Âm hơn số Dương");
		} else {
			System.out.println("Số số Âm và số Dương trong mảng bằng nhau");
		}
	}
}
