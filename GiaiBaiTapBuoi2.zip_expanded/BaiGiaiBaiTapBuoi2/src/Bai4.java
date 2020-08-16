import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float canhA;
		float canhB;
		float canhC;

		System.out.print("Nhập vào chiều dài cạnh thứ 1: ");
		canhA = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào chiều dài cạnh thứ 2: ");
		canhB = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào chiều dài cạnh thứ 3: ");
		canhC = Float.parseFloat(scan.nextLine());

		// Kiểm tra tam giác
		if (Math.abs(canhA - canhB) < canhC && canhC < (canhA + canhB)) {
			if (canhA == canhB && canhA == canhC && canhB == canhC) {
				System.out.println("Đây là tam giác đều.");
			} else if (canhA == canhB || canhA == canhC || canhB == canhC) {
				if (canhA * canhA + canhB * canhB == canhC * canhC || canhA * canhA + canhC * canhC == canhB * canhB
						|| canhB * canhB + canhC * canhC == canhA * canhA) {
					System.out.println("Đây là tam giác vuông cân.");

				} else {
					System.out.println("Đây là tam giác cân.");
				}
			} else if (canhA * canhA + canhB * canhB == canhC * canhC || canhA * canhA + canhC * canhC == canhB * canhB
					|| canhB * canhB + canhC * canhC == canhA * canhA) {
				System.out.println("Đây là tam giác vuông.");
			} else {
				System.out.println("Đây là tam giác thường.");
			}

		} else {
			System.out.println("Đây không phải hình tam giác.");
		}

	}

}
