import java.util.Scanner;

public class BT_DAY_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timSoNguyenNhoNhat();
//		tinhTongSoNhap(scan);
//		tinhGiaThua(scan);
//		thucHienMenu(scan);
//		doanSo(scan);
//		choiOanTuTi(scan);
	}
	
	public static void timSoNguyenNhoNhat() {
		// Đầu vào
		int n = 1;
		// xử lý 
		// 1 + 2 + 3 + ... + n > 5000
		// ta có 1 + 2 + 3 + .. + n = (n *( n + 1)) / 2
		//  n * ( n + 1 ) > 10000
		while( (n * (n + 1)) <= 10000 ) {
			n++;
		}
		// đầu ra
		System.out.println("Số n : " + n);
	}
	
	public static void tinhTongSoNhap(Scanner scan) {
		// đầu vào 
		float soNhapVao, tongSoNhapVao = 0;
		boolean kiemTraSoNhap = true;
		// Xử lý
		while(kiemTraSoNhap) {
			// nhập vào
			System.out.print("Nhập vào số : ");
			soNhapVao = Float.parseFloat(scan.nextLine());
			// kiểm tra
			kiemTraSoNhap = soNhapVao == 0 ? false : true;
			tongSoNhapVao += soNhapVao;
		}
//		do {
//			// nhập vào
//			System.out.print("Nhập vào số : ");
//			soNhapVao = Float.parseFloat(scan.nextLine());
//			// kiểm tra
//			kiemTraSoNhap = soNhapVao == 0 ? false : true;
//			tongSoNhapVao += soNhapVao;
//		} while(kiemTraSoNhap);
		// đàu ra
		System.out.println("Tổng số nhập vào là : " + tongSoNhapVao);
	}
	
	public static void tinhTongSoNhapChan(Scanner scan) {
		// đầu vào 
		float soNhapVao, tongSoNhapVao = 0;
		boolean kiemTraSoNhap = false;
		// Xử lý
		do {
			// nhập vào
			System.out.print("Nhập vào số : ");
			soNhapVao = Float.parseFloat(scan.nextLine());
			// kiểm tra
			kiemTraSoNhap = soNhapVao == 0 ? false : true;
			tongSoNhapVao += soNhapVao % 2 == 0 ? soNhapVao : 0 ;
		} while(kiemTraSoNhap);
		// đàu ra
		System.out.println("Tổng số nhập vào là : " + tongSoNhapVao);
	}
	
	public static void tinhGiaThua(Scanner scan) {
		// đầu vào
		int n, giaiThua = 1;
		boolean kiemTraLonHon_0 = true;
		// Nhập dữ liệu
		System.out.print("Nhập vào số n : ");
		n = Integer.parseInt(scan.nextLine());
		// Xử lý
		while(kiemTraLonHon_0) {
			n = n <= 0 ? 1 : n; // điều kiện nếu n nhỏ hơn hoặc = 0 thì giai thừa bằng 1
			giaiThua *= n;
			n--;
			kiemTraLonHon_0 = n <= 0 ? false : true;
		}
		System.out.println("kết quả : " + giaiThua);
	}
	
	public static void thucHienMenu(Scanner scan) {
		int luaChon;
		float so_1, so_2;
		boolean kiemTraLuaChon =  false;
		// nhập dữ liệu
		System.out.print("Nhập vào số thứ nhất : ");
		so_1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào số thứ hai : ");
		so_2 = Float.parseFloat(scan.nextLine());
		// Xử lý
		do {
			luaChon = inMenu(scan);
			kiemTraLuaChon = xuLyMenu(luaChon, so_1, so_2);
			if(kiemTraLuaChon) scan.nextLine();
		} while(kiemTraLuaChon);
		// đầu ra
		System.out.println("Chương trình đã kết thúc");
	}
	private static boolean xuLyMenu(int luaChon, float so_1, float so_2) {
		switch(luaChon) {
			case 1:
				System.out.println("Tổng hai số : " + (so_1 + so_2));
				break;
			case 2:
				System.out.println("Hiệu hai số : " + (so_1 - so_2));
				break;
			case 3:
				System.out.println("Thương hai số : " + so_1 / so_2);
				break;
			case 4:
				System.out.println("Tích hai số : " + so_1 * so_2);
				break;
			case 0:
				return false;
			default: 
				System.out.println("Bạn đã nhập sai lựa chọn");
				break;
		}
		return true;
	}
	private static int inMenu(Scanner scan) {
		int luaChon;
		System.out.println("Menu : ");
		System.out.println("\t1. Tính tổng ");
		System.out.println("\t2. Tính hiệu ");
		System.out.println("\t3. Tính thương ");
		System.out.println("\t4. Tính tích ");
		System.out.println("\t0. Kết thúc chương trình");
		System.out.print("Lựa chọn : ");
		luaChon = Integer.parseInt(scan.nextLine());
		return luaChon;
	}
	
	public static void doanSo(Scanner scan) {
		// Đầu vào
		int soNgauNhien, soNguoiDungDoan, soLanDoan = 0 ;
		boolean doanSai = true;
		// xử lý
		soNgauNhien = (int) (Math.random() * 999 +1);
		do {
			soLanDoan++;
			// nhập dữ liệu
			System.out.print("Nhập vào số dự đoán của bạn : ");
			soNguoiDungDoan = Integer.parseInt(scan.nextLine());
			// kiểm tra
			doanSai = soNguoiDungDoan != soNgauNhien ? true : false; // nếu đoán sai sẽ là true và cho nhập tiếp
			if(doanSai) {
				System.out.println("Bạn đã nhập " + (soNguoiDungDoan > soNgauNhien ? "lớn hơn " : "nhỏ hơn ") + "số bí mật\n" );
			}
		} while(doanSai);
		System.out.println("bạn đã đoán đúng, số bạn nhập là : " + soNguoiDungDoan);
		System.out.println("Số lần đoán của bạn là : " + soLanDoan);
	}
	
	public static void choiOanTuTi(Scanner scan) {
		/*
		 * Phân tích : kéo = 3; búa = 2; bao = 1 :
		 * kéo thắng bao : 3 > 1
		 * kéo thua búa :  3 < 2
		 * bao thắng búa : 1 > 2
		 */
		// Đầu vào
		int luaChonCuaMay;
		int luaChonCuaNguoiDung, soLanNgThang = 0, soLanMayThang = 0;
		boolean oanTuTiTiep = true;
		// xử lý
		do {
			luaChonCuaNguoiDung = layLuaChonCua("nguoi",scan);
			luaChonCuaMay = layLuaChonCua("may", scan);
			soLanNgThang  += xuLyTroChoi(luaChonCuaMay, luaChonCuaNguoiDung, "nguoi") ? 1 : 0 ;
			soLanMayThang += xuLyTroChoi(luaChonCuaMay, luaChonCuaNguoiDung, "may") ? 1 : 0 ;
			oanTuTiTiep = xuLyTroChoi(luaChonCuaMay, luaChonCuaNguoiDung, "oanTuTiTiep");
		} while(oanTuTiTiep);
		// đầu ra
		inKetQua(soLanNgThang, soLanMayThang);
	}
	private static void inKetQua(int soLanNgThang, int soLanMayThang) {
		System.out.println("\n**********************************************");
		if(soLanNgThang > soLanMayThang) System.out.println("Kết quả : Người thắng nhiều nhất");			
		else if(soLanNgThang < soLanMayThang) System.out.println("Kết quả : Máy thắng nhiều nhất");			
		else System.out.println("Kết quả hòa");
		
		System.out.println("Tỉ số : Người = " + soLanNgThang + "; Máy = " + soLanMayThang);
	}
	private static boolean xuLyTroChoi(int lua_Chon_Cua_May, int soCuaNguoiDung, String doiTuong) {
		// đầu vào
		boolean nguoiThangMay = false, mayThangNguoi = false;
		// xử lý
		if(doiTuong.equals("oanTuTiTiep")) { // trả về kq nếu là oanTuTiTiep
			return soCuaNguoiDung != 0 ? true : false; 
		} else { // Trả về kq nếu là máy hoặc người
			if (soCuaNguoiDung == 0) return false; // kiểm tra người dùng có ngừng chơi không, có thì không cần so sánh nữa
			else if(lua_Chon_Cua_May == soCuaNguoiDung) { // kiểm tra có hòa nhau không
				if(doiTuong.equals("may")) System.out.println("Hòa nhau"); // tránh in ra 2 lần , do bị gọi 2 lần vói số lần của ng và máy
				return false;
			} 
		}
		// Nếu người dùng chơi tiếp, người và máy không hòa nhau
		// kiểm tra ai thắng
		switch(soCuaNguoiDung) {
			case 1: // lựa chọn của người là Bao
				switch(lua_Chon_Cua_May) { 
					case 2: // lựa chọn của máy là Búa
					//  System.out.println("Ng thắng máy");
						nguoiThangMay = true;
						mayThangNguoi = false;
						break;
					case 3: // lựa chọn của máy là Kéo
					//  System.out.println("Ng thua máy");
						nguoiThangMay = false;
						mayThangNguoi = true;
						break;
					default: 
						break;
				}
				break;
			case 2: // lựa chọn của người là Búa
				switch(lua_Chon_Cua_May) {
					case 1: // lựa chọn của máy là Bao
					//  System.out.println("Ng thua máy");
						nguoiThangMay = false;
						mayThangNguoi = true;
						break;
					case 3: // lựa chọn của máy là Kéo
					//  System.out.println("Ng thắng máy");
						nguoiThangMay = true;
						mayThangNguoi = false;
						break;
					default:
						break;
				}
				break;
			case 3: // lựa chọn của người là Kéo
				switch(lua_Chon_Cua_May) {
					case 1:
					//  System.out.println("Ng thắng máy");
						nguoiThangMay = true;
						mayThangNguoi = false;
						break;
					case 2: // lựa chọn của máy là Búa
					//  System.out.println("Ng thua máy");
						nguoiThangMay = false;
						mayThangNguoi = true;
						break;
					default: 
						break;
				}
				break;
			default :
				break;
		}
		// trả về nếu là soLanNgThang gọi hàm
		if(doiTuong.equals("nguoi")) return nguoiThangMay;
		// Chỉ in 1 lần ra xem ai thắng, 
		if(mayThangNguoi) System.out.println("Máy Thắng");
		else System.out.println("Người thắng");
		// trả về nếu là soLanMayThang gọi hàm
		return mayThangNguoi;
	}
	private static int layLuaChonCua(String doiTuong, Scanner scan) {
		int luaChon;
		boolean kiemTraLuaChon = true;
		if(doiTuong.equals("nguoi")) { // Khi người chơi chọn
			do {
				// nhập dữ liệu
				System.out.println("\nQuy ước : 1 = Bao; 2 = Búa; 3 = Kéo; 0 : Dừng choi");
				System.out.print("Nhập vào lựa chọn của bạn :   ");
				luaChon = Integer.parseInt(scan.nextLine());
				// kiểm tra
				kiemTraLuaChon =  (luaChon < 0 || luaChon > 3) ? true : false;
				if(kiemTraLuaChon) {
					System.out.println("Bạn đã nhập sai lựa chọn");
				}
			} while(kiemTraLuaChon);
			// trả về
			return luaChon;
		}
		// khi máy chọn
		luaChon = (int) (Math.random() * 3 + 1 ); 
		System.out.println("lựa chọn của máy " + luaChon);
		return luaChon;
	}
}





