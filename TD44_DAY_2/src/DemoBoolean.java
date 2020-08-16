
public class DemoBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Khai báo biến Boolean trong java 
		 */
		// khai báo biến 
		boolean homNayDaySom;
		boolean troiMua;
		int veTrai = 15, vePhai = 14;
		boolean soSanhSo = veTrai == vePhai++;
		String s1 = "Tuan", s2 = new String("Tuan");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// Với kiểu tham chiếu nó sẽ so sánh theo địa chỉ ô nhớ, với new sẽ tạo 1 ô nhớ mới.
		// Khi gán hẳn giá trị cho String Java sẽ dùng cơ chế s1 = "Tuan", nếu gán s2 = "Tuan" 
		// thì java sẽ tìm xem đã có chuỗi này hay chưa, do đã có nên sẽ gán luôn cho s2
		// Lúc này, nếu thay đổi giá trị s1 thì java sẽ tạo 1 vùng nhớ mới để lưu lại giá trị String mới và 
		// gán cho s1
		System.out.println(soSanhSo);
	}

}
