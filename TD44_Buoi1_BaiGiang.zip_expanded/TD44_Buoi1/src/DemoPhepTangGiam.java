
public class DemoPhepTangGiam {

	public static void main(String[] args) {
		/*
		 * Demo tăng - giảm
		 */
		int soA = 5;
		int soB = 4;
		int soC = soA++;
		
		soB += soA; // soB = 10
		soC--; // soC = 4
		soA = soC--; // soA = 4, soC = 3
		
		System.out.println(soA);
		System.out.println(soB);
		System.out.println(soC);
	}

}
