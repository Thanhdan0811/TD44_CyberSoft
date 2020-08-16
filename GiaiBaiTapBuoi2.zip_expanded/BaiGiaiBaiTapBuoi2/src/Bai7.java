import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sinhVien_1, sinhVien_2, sinhVien_3;
		String tenTre;
		int namSinh_1 = 0;
		int namSinh_2 = 0;
		int namSinh_3 = 0;
		int tuoiTre;

		System.out.print("Nhập tên sinh viên thứ 1: ");
		sinhVien_1 = scan.nextLine();
		System.out.print("Nhập năm sinh sinh viên thứ 1: ");
		namSinh_1 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tên sinh viên thứ 2: ");
		sinhVien_2 = scan.nextLine();
		System.out.print("Nhập năm sinh sinh viên thứ 2: ");
		namSinh_2 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tên sinh viên thứ 3: ");
		sinhVien_3 = scan.nextLine();
		System.out.print("Nhập năm sinh sinh viên thứ 3: ");
		namSinh_3 = Integer.parseInt(scan.nextLine());

		tuoiTre = namSinh_1;
		tenTre = sinhVien_1;
		
		if (tuoiTre < namSinh_2) {
			tenTre = sinhVien_2;
			tuoiTre = namSinh_2;

		} else if (tuoiTre < namSinh_3) {
			tenTre = sinhVien_3;
			tuoiTre = namSinh_3;
		}
		System.out.print("Sinh viên trẻ nhất là: " + tenTre + "; Sinh năm: " + tuoiTre);

	}

}
