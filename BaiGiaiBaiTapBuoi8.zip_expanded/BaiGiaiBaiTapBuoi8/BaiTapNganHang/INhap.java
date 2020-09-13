package BaiTapNganHang;

import java.util.Scanner;

public interface INhap {
	Scanner scan = new Scanner(System.in);

	default double validationDouble(String thongBao) {
		do {
			try {
				System.out.print(thongBao);
				double soDouble = Double.parseDouble(scan.nextLine());
				return soDouble;
			} catch (Exception e) {
				System.out.println("Sai định dạng vui lòng nhập số thực!");
			}
		} while (true);
	}

	default int validationInt(String thongBao) {
		do {
			try {
				System.out.print(thongBao);
				int soInt = Integer.parseInt(scan.nextLine());
				return soInt;
			} catch (Exception e) {
				System.out.println("Sai định dạng vui lòng nhập số nguyên!");
			}
		} while (true);
	}
}
