import java.util.Scanner;

public class Case_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float chieuDaiCp, chieuRongCp, chieuCaoCp, soCanhCua, soCuaSo, chieuDaiCanhCua, chieuRongCanhCua, chieuDaiCuaSo, chieuRongCuaSo;
		float dienTichTuong, diennTichCanhCua, dienTichCuaSo, luongSonCanPhu;
		System.out.print("Chiều dài căn phòng : ");
		chieuDaiCp = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều rộng căn phòng : ");
		chieuRongCp = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều cao căn phòng : ");
		chieuCaoCp = Float.parseFloat(scan.nextLine());
		System.out.print("Số cánh cửa của căn phòng: ");
		soCanhCua = Float.parseFloat(scan.nextLine());
		System.out.print("Số cửa sổ của căn phòng : ");
		soCuaSo = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều dài cánh cửa : ");
		chieuDaiCanhCua = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều rộng cánh cửa : ");
		chieuRongCanhCua = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều dài cửa sổ : ");
		chieuDaiCuaSo = Float.parseFloat(scan.nextLine());
		System.out.print("Chiều rộng cửa sổ : ");
		chieuRongCuaSo = Float.parseFloat(scan.nextLine());
		System.out.print("Lượng Sơn cần phủ : ");
		luongSonCanPhu = Float.parseFloat(scan.nextLine());
		scan.close();
		// Phân tích bài toán : giả sử các cánh cửa giống nhau, các cửa sổ giống nhau
		// tổng lượng sơn tường sẽ là bằng tổng diện tích tường trừ đi tổng diện tích tất cả cửa sổ và cánh cửa * lượng sơn cần phủ .
		// giả sử phòng có dạng là hình khối chữ nhật hoặc vuông
		// Khi đó tổng diện tích tường sẽ là tổng diện tích 4 mặt trong đó 2 mặt đối diện sẽ bằng nhau
		// 2 mặt có cạnh là chiều cao và chiều rộng phòng, 2 mặt có cạnh là chiều cao và chiều dài phòng
		// Tổng lượng sơn trần nhà sẽ là chiều dài * chiều rộng * lượng sơn cần phủ
		dienTichTuong = chieuRongCp * chieuCaoCp * 2 + chieuDaiCp * chieuCaoCp * 2;
		diennTichCanhCua = chieuRongCanhCua * chieuDaiCanhCua;
		dienTichCuaSo = chieuDaiCuaSo * chieuRongCuaSo;
		System.out.println("Tổng lượng sơn cho tường : " + 
				(dienTichTuong - diennTichCanhCua * soCanhCua - dienTichCuaSo * soCuaSo) * luongSonCanPhu + " lít");
		System.out.println("Tổng lượng sơn trần nhà : " + 
				(chieuRongCp * chieuDaiCp * luongSonCanPhu) + " lít");
		
	}

}
