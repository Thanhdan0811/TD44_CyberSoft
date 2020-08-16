import java.util.Scanner;

public class BT_If_Else_TienNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float gioLam, tienLuongTheoGio;
		System.out.print("Số giờ làm : ");
		gioLam = Float.parseFloat(scan.nextLine());
		System.out.print("Số tiền lương theo giờ : ");
		tienLuongTheoGio = Float.parseFloat(scan.nextLine());
		scan.close();
		if(gioLam <= 40) {
			System.out.println("Tiền lương của bạn là : " + gioLam * tienLuongTheoGio);
		} else {
			System.out.println("Tiền lương của bạn là : " + ((gioLam - 40) * tienLuongTheoGio *1.5f + 40 * tienLuongTheoGio));
		}
	}

}
