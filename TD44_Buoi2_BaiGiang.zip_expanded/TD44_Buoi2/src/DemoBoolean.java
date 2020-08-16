
public class DemoBoolean {

	public static void main(String[] args) {
		/*
		 * Demo Boolean Variable
		 */
		
		// khai báo biến
		boolean homNayDaySom;
		boolean troiMua;
		
		int veTrai = 15, vePhai = 15;
		boolean soSanhSo = veTrai != vePhai;
		
		String s1 = "Tuan", s2 = "Tuan";
		s1 = "Tuan2";
		boolean soSanhChuoi = s1 == s2;
		System.out.println(soSanhChuoi);
	}

}
