package Application;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com dois números inteiros: ");
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for( int j = 0 ; j<n;j++) {
				matrix[m][n] = sc.nextInt();
			}
		}

			
			
			
			System.out.println("Digite o elemento X:");

		int X = sc.nextInt();

		sc.close();

	}

}
