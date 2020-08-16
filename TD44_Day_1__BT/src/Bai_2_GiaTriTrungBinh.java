import java.util.Scanner;

public class Bai_2_GiaTriTrungBinh {
	public static void main(String[] args) {
		float trungBinh_5_So = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 1; i <= 5; i++ ) {
			System.out.print("Nhập vào số thứ " + i + " : ");
			trungBinh_5_So += Float.parseFloat(scan.nextLine());
		}
		scan.close();
		System.out.println("GIá trị trung bình của 5 số là : " + trungBinh_5_So / 5);
	}
}
