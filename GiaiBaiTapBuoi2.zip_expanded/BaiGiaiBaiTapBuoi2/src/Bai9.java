import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TÌM NAM TRẺ NHẤT

		Scanner scan = new Scanner(System.in);

		String ten;
		int gioiTinh;
		int namSinh;

		String tenTreNhat = "";
		int tuoiTreNhat = 0;

		System.out.print("Nhập vào tên cán bộ thứ 1: ");
		ten = scan.nextLine();
		System.out.println("Nhập giới tính cán bộ thứ 1: ");
		System.out.println("1. Nam     2. Nữ");
		gioiTinh = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập năm sinh cán bộ thứ 1: ");
		namSinh = Integer.parseInt(scan.nextLine());

		switch (gioiTinh) {
		case 1:
			tenTreNhat = ten;
			tuoiTreNhat = namSinh;
			break;
		}

		System.out.print("Nhập vào tên cán bộ thứ 2: ");
		ten = scan.nextLine();
		System.out.println("Nhập giới tính cán bộ thứ 2: ");
		System.out.println("1. Nam     2. Nữ");
		gioiTinh = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập năm sinh cán bộ thứ 2: ");
		namSinh = Integer.parseInt(scan.nextLine());

		switch (gioiTinh) {
		case 1:
			if (tuoiTreNhat < namSinh) {
				tenTreNhat = ten;
				tuoiTreNhat = namSinh;
			}
			break;
		}
		System.out.print("Nhập vào tên cán bộ thứ 3: ");
		ten = scan.nextLine();
		System.out.println("Nhập giới tính cán bộ thứ 3: ");
		System.out.println("1. Nam     2. Nữ");
		gioiTinh = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập năm sinh cán bộ thứ 3: ");
		namSinh = Integer.parseInt(scan.nextLine());

		switch (gioiTinh) {
		case 1:
			if (tuoiTreNhat < namSinh) {
				tenTreNhat = ten;
				tuoiTreNhat = namSinh;
			}
			break;
		}
		System.out.println("Cán bộ nam trẻ nhất là: " + tenTreNhat);
	}

}
