import java.util.Scanner;

public class BaiTapXepLoai {

	public static void main(String[] args) {
		/*
		 * Chương trình xếp loại học sinh
		 */
		Scanner scanner = new Scanner(System.in);
		float diemToan, diemLy, diemHoa, diemTb;
		String hoTen, xepLoai;
		
		System.out.print("Họ tên: ");
		hoTen = scanner.nextLine();
		
		System.out.print("Điểm toán: ");
		diemToan = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Điểm lý: ");
		diemLy = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Điểm hóa: ");
		diemHoa = Float.parseFloat(scanner.nextLine());
		
		diemTb = (diemToan + diemLy + diemHoa) / 3;
		// top - down
		if(diemTb >= 8.5) {
			xepLoai = "Giỏi";
		} else if(diemTb >= 6.5) {
			xepLoai = "Khá";
		} else if(diemTb >= 5) {
			xepLoai = "Trung bình";
		} else {
			xepLoai = "Yếu";
		}
		
		// bottom - up
		if(diemTb < 5) {
			xepLoai = "Yếu";
		} else if(diemTb >= 5 && diemTb < 6.5) {
			xepLoai = "Trung bình";
		} else if(diemTb >= 6.5 && diemTb < 8.5) {
			xepLoai = "Khá";
		} else if(diemTb >= 8.5) {
			xepLoai = "Giỏi";
		}
		
		System.out.println("Điểm trung bình: " + String.format("%2.2f", diemTb));
		System.out.println("Xếp loại: " + xepLoai);
	}

}
