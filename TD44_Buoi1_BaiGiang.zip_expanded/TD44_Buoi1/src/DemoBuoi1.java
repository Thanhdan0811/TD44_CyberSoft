
public class DemoBuoi1 {

	public static void main(String[] args) {
		String loiChaoMung = "Chúc buổi tối vui vẻ.";
		short bienShort = 20;
		
		/*
		 * Cú pháp khai báo biến
		 * [kiểu-dữ-liệu] tên-biến;
		 */
		byte bienByte;
		/*
		 * Cách đặt tên biến: 
		 * -> theo kiểu camelCase
		 * bienNayDatTheoKieuCamelCase
		 * hocSinh
		 * diemHocSinh
		 * diemTrungBinh
		 * 
		 * -> tên biến phải mô tả dữ liệu biến sẽ chứa
		 * không đặt tên biến là chữ cái: x, c , b 
		 * 
		 * -> tên biến phải bắt đầu bằng: chữ cái, dấu gạch dưới_ hoặc biểu tượng $
		 * 
		 */
		
		/*
		 * Bài tập đặt tên biến
		 * 1. tạo 1 biến kiểu byte lưu tuổi học sinh
		 * 2. tạo 1 biến kiểu int số lượng bến xe bus
		 * 3. tạo 1 biến kiểu long lưu số lượng xã/phường trong cả nước
		 * 4. tạo 1 biến kiểu float lưu điểm môn toán
		 * 5. tạo 1 biến kiểu float lưu điểm trung bình tất cả các môn
		 * 6. tạo 1 biến kiểu double lưu doanh thu của công ty
		 */
		
		byte tuoiHocSinh = 18;
		int soLuongBenXeBus = 2000;
		long soLuongXaPhuong = 15000;
		float diemToan = 8.5f;
		float diemTb = 9.3f;
		double doanhThuCty = 10_000_000;
		
		char kyTu = 'c';
		
		String loiChao = "Kieu String";
		
		System.out.println(doanhThuCty);
		System.out.println(doanhThuCty);
		System.out.println(doanhThuCty);
		System.out.println(doanhThuCty);
		System.out.println(doanhThuCty);
	}

}
