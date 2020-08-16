import java.util.Scanner;

public class BT_vongLap_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int luaChon = 0, soA, soB;
		System.out.print("nhập số nguyên thứ nhất : ");
		soA = Integer.parseInt(scan.nextLine());
		System.out.print("nhập số nguyên thứ hai : ");
		soB = Integer.parseInt(scan.nextLine());
		boolean tiepTucChay = false;
		do {
			luaChon = inMenu(scan);
			tiepTucChay = xuLyMenu(luaChon, soA, soB);
			scan.nextLine(); // Dùng khống có tác dụng là ngưng màn hình
		} while(tiepTucChay);
		System.out.println("Kết thúc chương trình");
	}

	private static boolean xuLyMenu(int luaChon, int soA, int soB) {
		// TODO Auto-generated method stub
		boolean tiepTucChay = true;
		switch(luaChon) {
		case 1:
			System.out.println("Tổng 2 số là : " + (soA + soB));
			break;
		case 2:
			System.out.println("Hiệu 2 số là : " + (soA - soB));
			break;
		case 3:
			System.out.println("Tích 2 số là : " + (soA * soB));
			break;
		case 4:
			System.out.println("Chia 2 số là : " + (soA / soB));
			break;
		case 0:
			tiepTucChay = false;
			break;
		default:
			System.out.println("Nhập lại lựa chọn. ");
			break;
		}
		return tiepTucChay;
	}

	private static int inMenu(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("Menu: ");
		System.out.println("\t1. Tính tổng.");
		System.out.println("\t2. Tính hiệu.");
		System.out.println("\t1. Tính nhân.");
		System.out.println("\t4. Tính chia.");
		System.out.println("\t0. Thoát.");
		System.out.println("Lựa chọn : ");
		return Integer.parseInt(scan.nextLine());
	}

}
