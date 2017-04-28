package fiftyQuestionsArray;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] arrnum = new int[2][5];// 2D integer array with 2 rows and 5
										// columns
		// you must specify 1st dimension

		{
			arrnum[0][0] = 10;
			arrnum[0][1] = 20;
			arrnum[0][2] = 30;
			arrnum[0][3] = 40;
			arrnum[0][4] = 50;

			arrnum[1][0] = 5;
			arrnum[1][1] = 15;
			arrnum[1][2] = 25;
			arrnum[1][3] = 25;
			arrnum[1][4] = 45;
			int rows = 2;
			int columns = 5;

			int i, j;
			for (i = 0; i < rows; i++) {
				for (j = 0; j < columns; j++) {

					System.out.println(arrnum[i][j] + " ");

				}
			}
		}
	}
}
