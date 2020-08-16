import java.util.Scanner;

public class DemoNhapXuat {

	public static void main(String[] args) {
		/*
		 * Viết chương trình cho phép người dùng
		 * nhập vào tên người họ thích.
		 * 
		 * Chương trình in ra màn hình câu:
		 * *tên người bạn thích* đang nhìn bạn kìa! ^^!
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tên người bạn thích: ");
		
		String tenCrush = scanner.nextLine();
		
		String ketQua = tenCrush + " đang nhìn bạn kìa! ^^!";
		
		System.out.println(ketQua);
		
	}

}
