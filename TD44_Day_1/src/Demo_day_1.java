
public class Demo_day_1 {

	public static void main(String[] args) {
		// scope : vùng giá trị, 1 vùng { là 1 scope };
		/*
		 * Đây là comment;
		 * 
		 */
		// TODO Auto-generated method stub;
		System.out.print("Chúc các bạn buổi tối vui vẻ!!! \n2020/07/28");
		System.out.println("xuống dòng");
		// gõ nhanh sout sau đó nhấn giữ ctrl + space
		System.out.println(2020);
		System.out.println("***************************************************");
		String loiChaoMung = "chúc buổi tối again";
		System.out.println(loiChaoMung);
		System.out.println("*************************Kiểu Dữ Liệu********************");
		// Kiểu byte chiếm 1 byte 
		// kiểu char chứa bảng mã ascii
		// Kiểu short bộ nhớ 2 byte -32.768 => 32.768
		// Kiểu int bộ nhớ 4 byte -2147483647  ... Interger.MAX_VALUE
		// Kiểu float 
		// Kiểu double
		// Kiểu boolean
		/*
		 * Cú pháp khai báo biến ;
		 * [Kiểu-dữ-liệu] tên-biến;
		 * */
		byte bienByte;
		/*
		 * Cách đặt tên biến:
		 * -> theo kiểu camelCase
		 * bienNayDatTheoKieuCamelCase
		 * -> Tên biến sẽ mô tả dữ liệu biến sẽ chứa
		 * Không đặt tên biến là chữ cái : x, c, b
		 * -> tên biến bắt đầu bằng : chữ cái, dấu gạch dưới_ , hoặc biểu tượng $;
		 * Bài tập đặt tên biến 
		 * 1. tạo 1 biến kiểu byte lưu tuổi học sinh
		 * 2. tạo 1 biến int lưu số lượng bến xe bus
		 * 3. tạo 1 biến kiểu long lưu số lượng xã/phường trong cả nước
		 * 4. tạo 1 biến kiểu float lưu điểm môn toán
		 * 5. tạo 1 biến kiểu float lưu điểm trung bình tất cả các môn
		 * 6. tạo 1 biến kiểu double lưu doang thu của công ty
		 */
		// 1.
		byte tuoiHocSinh = 18;
		// 2.
		int soLuongBenXeBus = 2000;
		// 3.
		long soLuongXaPhuong = 15000;
		// 4.
		// Khi dùng số thập phân sẽ tự động hiểu là kiểu double
		// nên khi định dạng kiểu float thấp hơn double => báo lỗi
		float diemToan = 8.5f;
		// 5.
		float diemTrungBinh = 9.3f;
		// 6.
		// dấu gạch chỉ dùng cho phép gán
		double doanhThuCty = 2_000_000_000;
		// Kiểu char chỉ chứa 1 ký tự nên dùng dấu ngoặc đơn
		// kiểu string sẽ dùng dầu ngoặc kép ""
		System.out.println(doanhThuCty + ' ' + diemToan);
	}

}
