public class Testing {
	
	public static void main(String[] args) {
		int[][] a = {
			{99,85,98, 0},
			{98,57,78, 0}, 
			{92,77,76, 0}, 
			{94,32,11, 0}, 
			{99,34,22, 0}, 
			{90,46,54, 0}, 
			{76,59,88, 0}, 
			{92,66,89, 0}, 
			{97,71,24, 0}, 
			{89,29,38, 0}, 
			{ 0, 0, 0, 0}
		};
		//row-major average (student average)
		
		for (int i = 0; i < a.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length - 1; j++) 
				sum += a[i][j];
			System.out.println(i + "th student average: " + (sum / a[i].length));
		}

		//column-major average (test average)

		int col = a[0].length;
		for (int i = 0; i < col - 1; i++) {
			int sum = 0;
			for (int j = 0; j < a.length - 1; j++)
				sum += a[j][i];
			System.out.println(i + "th test average: " + (sum / a.length));
		}
	}
}