import java.util.Scanner;

public class Bai_7_OanTuTi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		oanTuTi(scan);
	}

	public static void oanTuTi(Scanner scan) {
		final int SO_MAC_DINH = 0;
		final int BAO = 1;
		final int BUA = 2;
		final int KEO = 3;
		int tiSoMay = SO_MAC_DINH;
		int tiSoNguoiChoi = SO_MAC_DINH;
		boolean flag = true;
		while (flag) {
			int lua_chon_cua_may = (int) (Math.random() * KEO + BAO);
			System.out.println("Mời nhập (1 = Bao, 2 = Búa, 3 = Kéo, nhấn 0 để dừng)");
			int nhap = Integer.parseInt(scan.nextLine());
			if (lua_chon_cua_may == nhap) {
				tiSoMay++;
				tiSoNguoiChoi++;
			} else if (lua_chon_cua_may == BAO && nhap == BUA) {
				tiSoMay++;
			} else if (lua_chon_cua_may == BAO && nhap == KEO) {
				tiSoNguoiChoi++;
			} else if (lua_chon_cua_may == BUA && nhap == BAO) {
				tiSoNguoiChoi++;
			} else if (lua_chon_cua_may == BUA && nhap == KEO) {
				tiSoMay++;
			} else if (lua_chon_cua_may == KEO && nhap == BAO) {
				tiSoMay++;
			} else if (lua_chon_cua_may == KEO && nhap == BUA) {
				tiSoNguoiChoi++;
			} else if (nhap == SO_MAC_DINH) {
				flag = false;
			} else {
				System.out.println("Vui lòng nhập lại");
			}
		}
		if (tiSoMay > tiSoNguoiChoi) {
			System.out.println("Máy thắng");
		} else if (tiSoMay < tiSoNguoiChoi) {
			System.out.println("Bạn thắng");
		} else {
			System.out.println("Huề");
		}
		System.out.println("Tỉ số máy : Tỉ số người chơi = " + tiSoMay + ":" + tiSoNguoiChoi);

	}
}
