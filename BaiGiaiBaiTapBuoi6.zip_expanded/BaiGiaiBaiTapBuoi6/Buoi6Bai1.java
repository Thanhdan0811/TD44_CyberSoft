/*
 * 1. Cho mảng 1 chiều các số nguyên. Hãy viết hàm liệt kê các giá trị trong mảng có dạng 3^k. Nếu mảng không có giá trị đó thì trả về 0
 */
public class Buoi6Bai1 {

	public static void main(String[] args) {
		// TẠO MẢNG 1 CHIỀU CÁC SỐ NGUYÊN
		int[] arr = { 0, 1, 2, 6, 9, 16, 27, -9, 0, 243, 247, 123, 729, -729 };
		// GỌI HÀM KIỂM TRA
		kiemTra(arr);
	}

	public static void kiemTra(int[] arr) {
		final int SO_KHONG = 0;
		final int SO_MOT = 1;
		final int SO_TRU_MOT = -1;
		final int SO_BA = 3;
		int viTri = SO_TRU_MOT;
		
		for (int i = SO_KHONG; i < arr.length; i++) {
			
			if (arr[i] == SO_MOT) {
				viTri = i;
				System.out.println("arr[" + viTri + "]= " + arr[viTri]);
				continue;
			}

			float soChia = (float) arr[i] / SO_BA;
			
			while (soChia >= SO_MOT) {
				if (soChia == SO_MOT) {
					viTri = i;
					System.out.println("arr[" + viTri + "]= " + arr[viTri]);
					break;
				}
				soChia /= SO_BA;
			}
		}
		if (viTri == SO_TRU_MOT) {
			System.out.println("Mảng không có số thỏa yêu cầu");
		}
	}
}
