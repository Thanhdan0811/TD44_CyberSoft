
public class DemoHam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hàm main đã được chạy");
		xuatThongTin();
		int x = 10, y = 20;
		tinhTong(x, 12);
		float luong;
		luong = tinhLuong(21.5f, 500);
		System.out.println("Lương tháng " + luong);
		kiemTraChanLe(15);
		System.out.println("Hàm main đã end game");
	}
	
	public static void xuatThongTin() {
		System.out.println("Xin chào các bạn.");
	}
	
	public static void tinhTong(int so_1, int so_2) {
		System.out.println("Tổng hai số : " + (so_1 + so_2) );
	}
	
	public static float tinhLuong(float soNgayLam, int luongMotNgay) {
		return soNgayLam * luongMotNgay;
	}
	
	public static void timSoLonNhat(int so_1, int so_2, int so_3) {
		if(so_1 > so_2 && so_1 > so_3) 		 System.out.println("Số lớn nhất là : " + so_1);
		else if(so_2 > so_1 && so_2 > so_3)  System.out.println("Số lớn nhất là : " + so_2);
		else if(so_3 > so_1 && so_3 > so_2)  System.out.println("Số lớn nhất là : " + so_3);
		else if(so_1 == so_2 && so_1 > so_3) System.out.println("Có 2 số lớn nhất là : " + so_1 + " và " + so_2);
		else if(so_2 == so_3 && so_2 > so_1) System.out.println("Có 2 số lớn nhất là : " + so_2 + " và " + so_3);
		else if(so_1 == so_3 && so_1 > so_2) System.out.println("Có 2 số lớn nhất là : " + so_1 + " và " + so_3);
		else if(so_1 == so_2 && so_2 == so_3) System.out.println("3 số đều là lớn nhất");
		// int max_1 = a >= b ? a : b;
		// int max_2 = a >= c > a : c;
		// int max = max_1 >= max_2 ? max_1 : max_2; 
	}
	
	public static void kiemTraChanLe(int soChanLe) {
		System.out.println("Số " + soChanLe + " là số " + (soChanLe % 2 == 0 ? "chẵn" : "lẻ"));
		/*
		 * if(soChanLe % 2 == 0) {
		 * 		System.out.println("Số " + soChanLe + " là số " + "chẵn");
		 * 		return;
		 * }
		 * 		System.out.println("Số " + soChanLe + " là số " + "lẻ");
		 * 		Không nên dùng else
		 * 		Hàm thường sẽ được viết để chỉ thực hiện 1 chức năng
		 */
	}
	public static boolean kiemTraSoChan(int a) {
		if(a % 2 == 0) {
			return true;
		}
		return false;
	}
}
