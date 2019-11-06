package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// how to print numbers from 1 to 20

		int i = 0;

		while (i <= 20) {
			System.out.println(i);
			i++;
		}

		// i want to print numbers from 10 to 30 all in one line
		int y = 10;
		while (y <= 30) {
			System.out.print(y + " ");
			++y;
		}
		// how to print values 10 to 1;
		int a = 10;

		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		// print values from 50 to 20
		System.out.println("#########");
		int b = 50;

		while (b >= 20) {
			System.out.println(b);
			b--;
		}
		System.out.println("#########");
		// I want to print all even numbers from 1 to 20
		// 1 way- increment value by 2
		int x = 2;
		while (x <= 20) {
			System.out.println(x);
			x += 2;
		}
		// 2. way using modulus
		System.out.println("asdasdasdasdadas");
		int q = 1;

		while (q <= 20) {
			if (q % 2 == 0) {
				System.out.println(q);

			}
			q++;
		}
		System.out.println("#############################");
		
		// print only odd numbers from 50 to 100
		//print only even numbers from 100 to 1
		
		int w=51;
		while(w<100) {
			System.out.println(w);
			w+=2;
		}
		System.out.println("##################################");
		int t=100;
		while(t>1) {
			System.out.println(t);
			t-=2;
		}

	}

}
