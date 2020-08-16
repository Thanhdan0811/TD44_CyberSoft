
public class BaiTapFor1 {
	public static void main(String[] args) {
		/*
		 * In ra các số nguyên dương chẵn và lẻ nhỏ hơn 100
		 */
		System.out.println("Các số nguyên dương chẵn (nhỏ hơn 100): ");
		for(int i = 2; i < 100; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("Các số nguyên dương lẻ (nhỏ hơn 100): ");
		for(int i = 1; i < 100; i += 2) {
			System.out.print(i + " ");
		}
	}
}
