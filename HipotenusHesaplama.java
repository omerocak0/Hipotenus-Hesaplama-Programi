package javaProject;

import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double dik1, dik2, hipotenus;
		
		System.out.println("Birinci dik kenari girin: ");
		dik1 = scan.nextDouble();
		
		System.out.println("Ikinci dik kenari girin: ");
		dik2 = scan.nextDouble();

		hipotenus = (dik1*dik1) + (dik2*dik2);
		
		System.out.println("Hipotenus: " + hipotenus);

	}

}
