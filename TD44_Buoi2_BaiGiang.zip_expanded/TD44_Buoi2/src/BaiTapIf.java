import java.util.Scanner;

public class BaiTapIf {

	public static void main(String[] args) {
		/*
		 * Viết chương trình cho người dùng nhập vào
		 * một số nguyên
		 * Nếu người dùng nhập số âm thì chuyển thành
		 * số dương và in ra lại màn hình
		 * 
		 * Vd: 	nhập -5 -> in ra màn hình 5	
		 * 		nhập 10 -> in ra màn hình 10
		 */
		Scanner scanner = new Scanner(System.in);
		int soInt;
		
		System.out.print("Nhập số: ");
		soInt = Integer.parseInt(scanner.nextLine());
		
		// kiểm tra số vừa nhập có âm hay không
		if(soInt < 0) {
			// Khử số âm
			soInt *= -1; // soInt = soInt * -1;
		}
		
		System.out.println("Số vừa nhập (đã khử số âm): " + soInt);
	}

}
