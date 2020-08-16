import java.util.Scanner;

public class BT_Switch_Case_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Viết chương trình in menu như sau
		 * 1. Chức năng 1
		 * 2. Chức năng 2
		 * 3. Chức năng 3
		 * 4. Chức năng 4
		 * Lựa chọn : 
		 * 
		 * Cho phép người dùng nhập lựa chọn là chức năng muốn thực hiện.
		 * 
		 * Nếu lựa chọn không nằm trong menu thì in ra thông báo "Lựa chọn không hợp lệ"
		 * 
		 * Thực hiện các chức năng tương ứng theo lựa chọn của người dùng
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int luaChon;
		System.out.print("Menu : \n\t 1. Chức năng 1\n\t 2. Chức năng 2\n\t 3. Chức năng 3\n\t 4. Chức năng 4\n\t 0. Thoát \nLựa chọn :\t");
		luaChon = Integer.parseInt(scan.nextLine());
		scan.close();
		switch(luaChon) {
			case 0:
				System.out.println("Đã thoát");
				break;
			case 1:
				System.out.println("Thực hiện chức năng 1");
				break;
			case 2:
				System.out.println("Thực hiện chức năng 2");
				break;
			case 3:
				System.out.println("Thực hiện chức năng 3");
				break;
			case 4:
				System.out.println("Thực hiện chức năng 4");
				break;
			default: 
				System.out.println("Lựa chọn không hợp lệ");
				break;
		}
		// Chú ý Java 14 và java 13 trở xuống
	}

}
