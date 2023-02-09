package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Max number: ");
		int num = in.nextInt();
		boolean[] arr1 = new boolean[num];
		for (int index = 0; index < arr1.length;index++) {
			arr1[index] = true;
			//System.out.print(arr1[index]);
			}
		for (int i=2; i< Math.sqrt(num); i++) {
			if (arr1[i] == true) {
				for (int j = i*i; j < num; j=j+i) {
					arr1[j]=false;
				}
			}
		}
		for (boolean value : arr1) {
			//System.out.println(value);
		}
		for (int index = 0; index < num; index++) {
			if (arr1[index]==true && index !=0 && index!=1) {
				System.out.println(index);
			}
		}
		
		
		//for (int index = 0; index < num; index ++) {
			//arr1[index] = index+2;
			//System.out.print(arr1[index]);}
		
		
	}

}
