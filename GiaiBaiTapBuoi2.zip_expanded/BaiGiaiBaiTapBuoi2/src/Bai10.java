import java.util.Scanner;

public class Bai10 {

	static final float toaDoTruong_x = 0;
	static final float toaDoTruong_y = 0;

	static float toaDoSV_x;
	static float toaDoSV_y;

	static float khoangCach;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ten;
		float khoangCachXaNhat;
		String sinhVienXaNhat;

		System.out.print("Nhập tên sinh viên thứ 1: ");
		ten = scan.nextLine();
		System.out.println("Nhập tọa độ của sinh viên thứ 1: ");
		System.out.print("x = ");
		toaDoSV_x = Float.parseFloat(scan.nextLine());
		System.out.print("y = ");
		toaDoSV_y = Float.parseFloat(scan.nextLine());

		khoangCach = tinhKhoangCachTuNhaToiTruong(toaDoSV_x, toaDoSV_y);

		khoangCachXaNhat = khoangCach;
		sinhVienXaNhat = ten;

		System.out.println(sinhVienXaNhat);
		System.out.println(khoangCachXaNhat);

		System.out.print("Nhập tên sinh viên thứ 2: ");
		ten = scan.nextLine();
		System.out.println("Nhập tọa độ của sinh viên thứ 2: ");
		System.out.print("x = ");
		toaDoSV_x = Float.parseFloat(scan.nextLine());
		System.out.print("y = ");
		toaDoSV_y = Float.parseFloat(scan.nextLine());

		khoangCach = tinhKhoangCachTuNhaToiTruong(toaDoSV_x, toaDoSV_y);

		if (khoangCachXaNhat < khoangCach) {
			khoangCachXaNhat = khoangCach;
			sinhVienXaNhat = ten;
		}

		System.out.println(sinhVienXaNhat);
		System.out.println(khoangCachXaNhat);

		System.out.print("Nhập tên sinh viên thứ 3: ");
		ten = scan.nextLine();
		System.out.println("Nhập tọa độ của sinh viên thứ 3: ");
		System.out.print("x = ");
		toaDoSV_x = Float.parseFloat(scan.nextLine());
		System.out.print("y = ");
		toaDoSV_y = Float.parseFloat(scan.nextLine());

		khoangCach = tinhKhoangCachTuNhaToiTruong(toaDoSV_x, toaDoSV_y);

		if (khoangCachXaNhat < khoangCach) {
			khoangCachXaNhat = khoangCach;
			sinhVienXaNhat = ten;
		}

		System.out.println(sinhVienXaNhat);
		System.out.println(khoangCachXaNhat);

		System.out.println("Sinh viên ở xa trường nhất là: " + sinhVienXaNhat);
	}

	// TÍNH KHOẢNG CÁCH TỪ NHÀ TỚI TRƯỜNG
	public static float tinhKhoangCachTuNhaToiTruong(float toaDoSV_x, float toaDoSV_y) {
		khoangCach = (float) Math.sqrt(Math.pow(toaDoSV_x - toaDoTruong_x, 2) + Math.pow(toaDoSV_y - toaDoTruong_y, 2));
		return khoangCach;
	}

}
