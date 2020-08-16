import java.util.Scanner;

public class BaiTap_4_PhanLoai_TamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float canh_1, canh_2, canh_3;
		System.out.print("Nhập vào cạnh thứ 1 ");
		canh_1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào cạnh thứ 2 ");
		canh_2 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào cạnh thứ 3 ");
		canh_3 = Float.parseFloat(scan.nextLine());
		scan.close();
		// Điều kiện tạo thành 1 tam giác là tổng 2 cạnh bất kỳ phải lớn hơn cạnh còn lại
		if( canh_1  < canh_2 + canh_3 &&
			canh_2  < canh_1 + canh_3 &&
			canh_3  < canh_2 + canh_1) {
			// Điều kiện tam giác cân là có 2 cạnh bất kỳ bằng nhau			
			if( canh_1 == canh_2 && canh_1 == canh_3 ||
				canh_2 == canh_1 && canh_2 == canh_3 ||
			    canh_3 == canh_1 && canh_3 == canh_2) {
						//	Điều kiện của tam giác cân vuông là 2 cạnh bất kỳ bằng nhau 
						//  và có tổng bình phương 2 cạnh bằng bình phương cạnh còn lại
						if( canh_1 * canh_1 == canh_2 * canh_2 + canh_3 * canh_3 ||
							canh_2 * canh_2 == canh_1 * canh_1 + canh_3 * canh_3 ||
							canh_3 * canh_3 == canh_2 * canh_2 + canh_1 * canh_1) {
							System.out.print("Tam giác vuông cân");
						} else {
							System.out.print("Tam giác cân");
						}
					} 
			 		// Điều kiện của tam giác đều là có 3 cạnh bằng nhau
					else if( canh_1 == canh_2 && canh_1 == canh_3 && canh_2 == canh_3 ) {
						System.out.print("Tam giác đều");
					} 
					// Điều kiện của tam giác vuông là có tông bình phương 2 cạnh bằng bình phương cạnh còn lại
					else if(canh_1 * canh_1 == canh_2 * canh_2 + canh_3 * canh_3 ||
							canh_2 * canh_2 == canh_1 * canh_1 + canh_3 * canh_3	||
							canh_3 * canh_3 == canh_2 * canh_2 + canh_1 * canh_1) {
						System.out.print("Tam giác vuông");
					} else {
						System.out.print("Tam giác thường");
					}
		} else {
			System.out.print("Các cạnh bạn nhập không tạo thành 1 tam giác");
		}
		
	}

}
