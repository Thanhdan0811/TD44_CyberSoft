
public class ReviewMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soInt;
		int mangInt[]; // Hoặc int[] mangInt;
		// Khởi tạo
		soInt = 5;
		mangInt =  new int[5];
		
		// Truy xuất giá trị
		System.out.println(mangInt[4]);
		mangInt[4] = -4;
		System.out.println(mangInt[4]);
		if(mangInt[4] < 0) {
			System.out.println("Số âm!!!");
		}
	}

}
