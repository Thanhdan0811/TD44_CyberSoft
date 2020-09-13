import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TaiKhoan tk = new TaiKhoan();
		tk.nhapThongTinTK(scan);
		tk.xuatThongTinTK();
		tk.napTien(scan);
		tk.xuatThongTinTK();
	}

}
