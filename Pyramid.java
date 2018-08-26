package com.ravidvlpr.piet;

/**
 * 
 * @author Ravi
 * @website WwW.RaviDvlpr.ml
 *
 */

public class Pyramid {

	int i, j, k;

	public void printPyramid() {
		int i, j, k;
		
		
		for (i = 1; i <= 10; i++) {
			for (j = 9; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			for (j = 10; j >= i; j--) {
				System.out.print("  ");
			}

			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		System.out.println("");
		
		
/*..........Reverse............*/
		
		for(i=10; i>=1; i--)
		{
		for(j=9; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.print("  ");
		for(j=9; j>=i; j--)
		{
		System.out.print("  ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		
		

		
	}

	public static void main(String[] args) {
		Pyramid pyramid = new Pyramid();
		pyramid.printPyramid();

	}

}
