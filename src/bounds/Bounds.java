package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		int starting_num, upper_bound, step_size;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a starting number");
		starting_num = keyboard.nextInt();
		System.out.println("Enter an upper bound");
		upper_bound = keyboard.nextInt();
		System.out.println("Enter a step size");
		step_size = keyboard.nextInt();
		System.out.println("starting number = " + starting_num + " upper bound = " 
		+ upper_bound + " step size = " + step_size + " should generate the numbers:");
		for(int i = starting_num; i < upper_bound; i += step_size) {
			System.out.print(i + " ");
		}
	}
}
