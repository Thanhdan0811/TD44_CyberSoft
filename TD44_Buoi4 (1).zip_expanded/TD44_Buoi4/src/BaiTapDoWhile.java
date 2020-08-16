import java.util.Scanner;

public class BaiTapDoWhile {
	public static void main(String[] args) {
		/*
		 * Luyện tập do while
		 */
		/*
		 * Coding style
		 * - clean code: -> ngay hàng thẳng lối, cách đặt tên biến, hàm, lớp...
		 * - code flow: 
		 * - abstract level: 
		 */
		Scanner scanner = new Scanner(System.in);
		boolean tiepTucChay = false;
		int luaChon, soA, soB;
		
		System.out.print("Nhập số nguyên thứ nhất: ");
		soA = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhập số nguyên thứ hai: ");
		soB = Integer.parseInt(scanner.nextLine());
		
		do {
			luaChon = inMenu(scanner);
			tiepTucChay = xuLyMenu(luaChon, soA, soB);
		scanner.nextLine();
		} while (tiepTucChay);
		
		System.out.println("Kết thúc chương trình.");
	}

	private static boolean xuLyMenu(int luaChon, int soA, int soB) {
		boolean tiepTucChay = true;
		switch(luaChon) {
			case 1:
				System.out.println("Tổng hai số: " + (soA + soB));
				break;
			case 2:
				System.out.println("Hiệu hai số: " + (soA - soB));
				break;
			case 3: 
				System.out.println("Tích hai số: " + (soA * soB));
				break;
			case 4:
				System.out.println("Thương của hai số: " + (soA / soB));
				break;
			case 0:
				tiepTucChay = false;
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
		}
		return tiepTucChay;
	}

	private static int inMenu(Scanner scanner) {
		System.out.println("Menu: ");
		System.out.println("\t1. Tính tổng.");
		System.out.println("\t2. Tính hiệu.");
		System.out.println("\t3. Tính nhân.");
		System.out.println("\t4. Tính chia.");
		System.out.println("\t0. Thoát.");
		System.out.print("Lựa chọn: ");
		int luaChon = Integer.parseInt(scanner.nextLine());
		return luaChon;
	}
}
