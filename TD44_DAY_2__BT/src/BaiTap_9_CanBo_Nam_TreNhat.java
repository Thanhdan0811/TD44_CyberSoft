import java.util.Scanner;

public class BaiTap_9_CanBo_Nam_TreNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String tenCb_1, tenCb_2, tenCb_3, gioiTinhCb_1, gioiTinhCb_2,gioiTinhCb_3;
		int namSinhCb_1, namSinhCb_2, namSinhCb_3;
		System.out.print("Tên cán bộ 1 : ");
		tenCb_1 = scan.nextLine();
		System.out.print("Giới tính cán bộ 1 : ");
		gioiTinhCb_1 = scan.nextLine();
		System.out.print("Năm sinh cán bộ 1 : ");
		namSinhCb_1 = Integer.parseInt(scan.nextLine());
		System.out.print("Tên cán bộ 2 :");
		tenCb_2 = scan.nextLine();
		System.out.print("Giới tính cán bộ 2 : ");
		gioiTinhCb_2 = scan.nextLine();
		System.out.print("Năm sinh cán bộ 2 : ");
		namSinhCb_2 = Integer.parseInt(scan.nextLine());
		System.out.print("Tên cán bộ 3 : ");
		tenCb_3 = scan.nextLine();
		System.out.print("Giới tính cán bộ 3 : ");
		gioiTinhCb_3 = scan.nextLine();
		System.out.print("Năm sinh cán bộ 3 : ");
		namSinhCb_3 = Integer.parseInt(scan.nextLine());
		scan.close();
		
		if(gioiTinhCb_1.equals("nu")) { // Trường hợp cán bộ 1 là nữ
			if(gioiTinhCb_2.equals("nu")) { // cán bộ 1 là nữ, cán bộ 2 là nữ
				if(gioiTinhCb_3.equals("nam")) { // cán bộ 1 là nữ, cán bộ 2 là nữ , cán bộ 3 là nam
					System.out.println("tên CB trẻ nhât là " + tenCb_3);
				} 
				else {
					System.out.println("Không có CB trẻ nhât là nam");
				}
			} 
			else { // cán bộ 1 là nữ, cán bộ 2 là nam
				if(gioiTinhCb_3.equals("nam")) { // cán bộ 1 là nữ, cán bộ 2 là nam , cán bộ 3 là nam
					if(namSinhCb_2 > namSinhCb_3) {
						System.out.println("tên CB trẻ nhât là " + tenCb_2);
					} 
					else {
						System.out.println("tên CB trẻ nhât là " + tenCb_3);
					}
				} 
				else { // cán bộ 1 là nữ, cán bộ 2 là nam , cán bộ 3 là nữ
					System.out.println("tên CB trẻ nhât là " + tenCb_2);
				}
			}
		} 
		else {  // Trường hợp cán bộ 1 là nam
			if(gioiTinhCb_2.equals("nu")) {  // cán bộ 1 là nam, cán bộ 2 là nữ
				if(gioiTinhCb_3.equals("nam")) { // cán bộ 1 là nam, cán bộ 2 là nữ , cán bộ 3 là nam
					if(namSinhCb_1 > namSinhCb_3) {
						System.out.println("tên CB trẻ nhât là " + tenCb_1);
					} else {
						System.out.println("tên CB trẻ nhât là " + tenCb_3);
					}
				} else {  // cán bộ 1 là nam, cán bộ 2 là nữ , cán bộ 3 là nữ
					System.out.println("tên CB trẻ nhât là " + tenCb_1);
				}
			} else { // cán bộ 1 là nam, cán bộ 2 là nam
				if(gioiTinhCb_3.equals("nam")) { // cán bộ 1 là nam, cán bộ 2 là nam , cán bộ 3 là nam
					if(namSinhCb_1 > namSinhCb_2 && namSinhCb_1 > namSinhCb_3 ) {
						System.out.println("tên CB trẻ nhât " + tenCb_1);
					} 
					else if(namSinhCb_2 > namSinhCb_1 && namSinhCb_2 > namSinhCb_3) {
						System.out.println("tên CB trẻ nhât là " + tenCb_2);
					}
					else {
						System.out.println("tên CB trẻ nhât là " + tenCb_3);
					}
				} else { // cán bộ 1 là nam, cán bộ 2 là nam , cán bộ 3 là nữ
					if(namSinhCb_1 > namSinhCb_2) {
						System.out.println("tên CB trẻ nhât là " + tenCb_1);
					} else {
						System.out.println("tên CB trẻ nhât là " + tenCb_2);
					}
				}
			}
		}
	}

}
