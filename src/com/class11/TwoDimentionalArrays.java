package com.class11;

public class TwoDimentionalArrays {
	public static void main(String[] args) {
		
		//Declare 2D Array
		int[][] array=new int[3][4];
		//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=3;
		array[0][3]=20;
		//2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		//3rd row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=80;
		
		System.out.println(array[0][0]);
		System.out.println(array[1][3]);
		
		/*Task: create 2D array of String with 
		 * 2 raws and 3 columns.
		 */
		
		String [][] x=new String [2][3];
		
		//1st row
		x[0][0]="Ali";
		x[0][1]="Anil";
		x[0][2]="Ozge";

		//2nd row
		x[1][0]="Mehmet";
		x[1][1]="Murat";
		x[1][2]="Ayse";
		
		System.out.println(x[0][2]);
/////////////////////////////////////////////////////////////
		int [][]numbers= {
				{1,2,3,4,5},
				{6,7,8,9,2},
				{9,8,3,1,5},
				
		};
		
		System.out.println(numbers[2][4]);
		
		//To identify the numbers of Rows
		System.out.println("The numbers of Arrays are= "+numbers.length);
		
		//To identify the numbers of Columns/elements in a row
		System.out.println("The numbers of Columns are= "+numbers[1].length);
		System.out.println("--------------------");
		for (int i = 0; i < numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}System.out.println();
		}


		
	}

}
