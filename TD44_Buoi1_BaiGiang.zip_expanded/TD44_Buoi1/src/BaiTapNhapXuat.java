import java.util.Scanner;

public class BaiTapNhapXuat {

	public static void main(String[] args) {
		/*
		 * Viết chương trình cho người dùng
		 * nhập lần lượt họ, tên, tuổi
		 * 
		 * In ra màn hình thông tin người dùng dưới
		 * dạng sau:
		 * *họ* *tên* - *tuổi* tuổi
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời nhập họ: ");
		String ho = scanner.nextLine();
		System.out.print("Mời nhập tên: ");
		String ten = scanner.nextLine();
		System.out.print("Mời nhập tuổi: ");
		String tuoi = scanner.nextLine();
		
		String ketQua = ho + " " + ten + " - " + tuoi + " tuổi";
		System.out.println(ketQua);
	}

}
