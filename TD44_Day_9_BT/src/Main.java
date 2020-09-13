import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CongTy cty = new CongTy();
		Scanner scan = new Scanner(System.in);
		int luaChon=0;
		cty.taoDuLieuGia();
		do {
			luaChon = inMenu(scan);
			switch(luaChon) {
			case 1:
				cty.nhapNhanVien(scan);
				break;
			case 2:
				cty.xuatNhanVien();
				break;
			case 3:
				cty.tongLuongNV();
				break;
			case 4:
				cty.nhanVienLuongCaoNhat();
				break;
			case 0:
				System.out.println("Thoát chương trình");
				break;
			default : 
				System.out.println("Lựa chọn không hợp lệ");
				break;
			}
			scan.nextLine();
		} while(luaChon != 0);
	}
	
	private static int inMenu(Scanner scan) {
		int luaChon = 0;
		System.out.println("Menu : ");
		System.out.println("\t1. nhập nhân viên");
		System.out.println("\t2. xuất danh sách nhân viên");
		System.out.println("\t3. Tổng lương nhân viên");
		System.out.println("\t4. nhân viên lương cao nhất");
		System.out.println("\t0. Thoát");
		System.out.print("\tLựa chọn : ");
		luaChon = Integer.parseInt(scan.nextLine());
		return luaChon;
	}
}
