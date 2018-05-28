package tartalyos.fut;

import java.util.Scanner;

import tartalyos.Tartaly;

public class Proba {
	
	public static void main(String[] args) {
		int tartalyok_szama = 5;
		Tartaly tartalyok[] = new Tartaly[tartalyok_szama];
		
		Scanner beolvasas = new Scanner (System.in);
		
		for (int i = 0; i < tartalyok.length; i++) {
			System.out.println("Kerem a(z) " + (i + 1) + ". tartaly nyomasat!");
			System.out.println("nyomas:");
			int nyomas = beolvasas.nextInt();
			beolvasas.nextLine();
			
			System.out.println("Kerem a(z) " + (i + 1) + ". tartaly terfogatat!");
			System.out.println("terfogat:");
			int terfogat = beolvasas.nextInt();
			beolvasas.nextLine();
			
			tartalyok[i]= new Tartaly(nyomas, terfogat);
		}
		for (Tartaly tartaly : tartalyok) {
			System.out.println(tartaly);
		}

		int maxnyomas = 0;
		for (int i = 0; i < tartalyok.length; i++) {
			if (tartalyok[i].getNyomas() > tartalyok[maxnyomas].getNyomas()) {
				maxnyomas = i;
			}
		}
		
		int maxterfogat = 0;
		for (int i = 0; i < tartalyok.length; i++) {
			if (tartalyok[i].getTerfogat() > tartalyok[maxterfogat].getTerfogat()) {
				maxterfogat = i;
			}
		}
		
		System.out.println("Legnagyobb terfogatu tartaly szama:\n");
		System.out.println(maxterfogat);
		System.out.println("Legnagyobb nyomasu tartaly szama:\n");
		System.out.println(maxnyomas);
		
		beolvasas.close();
	}

}
