import java.util.Scanner;

public class BaiTapNhapXuat {
	public static void main(String[] args) {
		/*
		 * Viết chương trình cho người dùng nhập lần lượt họ, tên, tuổi 
		 * 
		 * In ra như sau :
		 * *họ* *tên* - *tuổi* tuổi
		 */
		String tenNguoiDung, hoNguoiDung;
		byte tuoiNguoiDung;
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Họ của người dùng : ");
		hoNguoiDung = scanInput.nextLine();
		System.out.print("Tên của người dùng : ");
		tenNguoiDung = scanInput.nextLine();
		System.out.print("Tuổi của người dùng : ");
		tuoiNguoiDung = Byte.parseByte(scanInput.nextLine());
		scanInput.close();
		System.out.println(hoNguoiDung + " " + tenNguoiDung + " - " + tuoiNguoiDung + "tuổi");
		
	}
}
