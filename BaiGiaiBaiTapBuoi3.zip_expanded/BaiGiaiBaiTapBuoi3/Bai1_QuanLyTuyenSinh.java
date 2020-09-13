import java.util.Scanner;

/*
 * Nhập điểm môn 1, môn 2, môn 3, điểm chuẩn, đối tượng, khu vực
 * 
 * Khu Vực A=2, B=1, C=0.5, X=0 khu vực không thuộc diện ưu tiên
 * Đối tượng 1= 2.5; Đối tượng 2= 1.5; Đối tượng 3= 1 Đối tượng 0= 0 không thuộc diện ưu tiên
 * Hàm tinhDiemKhuVuc(int khuVuc)
 * Hàm tinhDiemUuTien(int doiTuong)
 * Hàm xetDiemLiet(float mon1, float mon2, float mon3)
 * Hàm tinhTongDiem
 * Xet (tổng điểm >= điểm chuẩn) và (không có điểm 0) thì đậu, ngược lại là rớt
 * 
 * In ra thí sinh đó đậu hay rớt và tổng số điểm đạt được
 * */

public class Bai1_QuanLyTuyenSinh {
	static final float KHU_VUC_A = 2;
	static final float KHU_VUC_B = 1;
	static final float KHU_VUC_C = 0.5f;
	static final float DOI_TUONG_1 = 2.5f;
	static final float DOI_TUONG_2 = 1.5f;
	static final float DOI_TUONG_3 = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nhapKhuVuc, nhapDoiTuong;
		float mon1, mon2, mon3, diemChuan, diem3Mon, tongDiem, diemKV, diemDT;
		
		System.out.print("Nhập điểm chuẩn: ");
		diemChuan = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhập điểm môn 1: ");
		mon1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm môn 2: ");
		mon2 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm môn 3: ");
		mon3 = Float.parseFloat(scan.nextLine());
		
		if(!tinhDiemLiet(mon1, mon2, mon3)){
			System.out.print("Nhập khu vực A hoặc B hoặc C hoặc X (không thuộc khu vực ưu tiên) : ");
			nhapKhuVuc = scan.nextLine();
			System.out.print("Nhập đối tượng 1 hoặc 2 hoặc 3 hoặc 0 (không thuộc khu vực ưu tiên) : ");
			nhapDoiTuong = scan.nextLine();

			diem3Mon = mon1 + mon2 + mon3;
			diemKV = tinhDiemKhuVuc(nhapKhuVuc);
			diemDT = tinhDiemDoiTuong(nhapDoiTuong);
			tongDiem = diem3Mon + diemKV + diemDT;
		
			if ((tongDiem >= diemChuan)) {
				System.out.println("Tổng điểm: " + tongDiem + "\t Đậu");
			} else {
				System.out.println("Tổng điểm: " + tongDiem + "\t Rớt");
			}
		} else {
			System.out.println("Bạn có điểm liệt nên đừng tính nữa, rớt chắc rồi !.");
		}
		
		scan.close();
	}

	public static float tinhDiemKhuVuc(String khuVuc) {
		float diemKhuVuc;

		if (khuVuc.toUpperCase().charAt(0) == 'A') {
			diemKhuVuc = KHU_VUC_A;
		} else if (khuVuc.toUpperCase().charAt(0) == 'B') {
			diemKhuVuc = KHU_VUC_B;
		} else if (khuVuc.toUpperCase().charAt(0) == 'C') {
			diemKhuVuc = KHU_VUC_C;
		} else {
			diemKhuVuc = 0;
		}
		return diemKhuVuc;
	}

	public static float tinhDiemDoiTuong(String doiTuong) {
		float diemDoiTuong;
		if (doiTuong.charAt(0) == '1') {
			diemDoiTuong = DOI_TUONG_1;
		} else if (doiTuong.charAt(0) == '2') {
			diemDoiTuong = DOI_TUONG_2;
		} else if (doiTuong.charAt(0) == '3') {
			diemDoiTuong = DOI_TUONG_3;
		} else {
			diemDoiTuong = 0;
		}
		return diemDoiTuong;
	}

	public static boolean tinhDiemLiet(float diemMon1, float diemMon2, float diemMon3) {
		boolean flag = false;
		if (diemMon1 == 0 || diemMon2 == 0 || diemMon3 == 0) {
			flag = true;
		}
		return flag;
	}

}
