/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufbesarhurufkecil;

import java.util.Scanner;

/**
 *
 * @author ASUS A411UF
 */
public class HurufBesarhurufKecil {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        System.out.print("Masukkan Kalimat : ");
		Scanner scanner = new Scanner(System.in);
		String kalimat = scanner.nextLine();
		System.out.println("________Hasil Formatting________");
		System.out.println("Huruf Besar : " + kalimat.toUpperCase() );
		System.out.println("Huruf Kecil : " + kalimat.toLowerCase() );
    }
}

