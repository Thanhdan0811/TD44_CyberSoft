import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TÌM TRỊ TUYỆT ĐỐI
		Scanner scan = new Scanner(System.in);
		int soThu_1, soThu_2, soThu_3;

		System.out.println("Mời nhập vào số thứ 1: ");
		soThu_1 = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập vào số thứ 2: ");
		soThu_2 = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập vào số thứ 3: ");
		soThu_3 = Integer.parseInt(scan.nextLine());

		if (soThu_1 < 0) {
			soThu_1 = -soThu_1;
		}
		if (soThu_2 < 0) {
			soThu_2 = -soThu_2;
		}
		if (soThu_3 < 0) {
			soThu_3 = -soThu_3;
		}
		System.out.println("Trị tuyệt đối của ba số bạn vừa nhập là:");
		System.out.println("Số thứ nhất: " + soThu_1 + "; Số thứ hai: " + soThu_2 + "; Số thứ ba: " + soThu_3);

	}

}
