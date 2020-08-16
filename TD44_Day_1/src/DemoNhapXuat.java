import java.util.Scanner;
public class DemoNhapXuat {
	public static void main(String[] args) {
		/*
		 * Viết chương trình cho phép người dùng nhập vào tên người họ thích
		 * In ra
		 * *tên người bạn thích* đang nhìn bạn kìa! ^^! 
		 */
		 String tenNguoiYeuCuaBan;
		 Scanner scanInput = new Scanner(System.in);
		 System.out.print("Nhập vào tên người yêu của bạn : ");
		 tenNguoiYeuCuaBan = scanInput.nextLine();
		 String noiChuoi = tenNguoiYeuCuaBan + "chuỗi được nối vào";
		 System.out.println(tenNguoiYeuCuaBan + " đang nhìn bạn kìa! ^^!");
		 /*
		  * Nếu dùng nextInt liên tục sẽ dễ gặp lỗi bộ đệm
		  * Ta có thể dùng nhiều lần nextLine 
		  * sau đó dùng chuyển đổi như sau :
		  * int so_1 = Integer.parseInt(chuoiNhap)
		  */
		 System.out.print("Nhập vào số : ");
		 String chuoiNhapCanConvert = scanInput.nextLine();
		 int soDuocNhapVao = Integer.parseInt(chuoiNhapCanConvert);
		 System.out.println("Số vừa nhập là : " + soDuocNhapVao);
	}
}
