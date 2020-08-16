
public class DemoOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Khi thực hiện toán tử : kiểu trả về sẽ là kiểu có vùng nhớ lớn hơn
		 * String : sẽ là kiểu lớn hơn tất cả các kiểu cơ bản
		 */
		int soInt = 10;
		float soFloat = 20.5f;
		float tong = soInt + soFloat;
		String kieuChuoi = "250";
		String ketQua = kieuChuoi + soFloat;
		System.out.println(tong);
		System.out.println(ketQua);
	}

}
