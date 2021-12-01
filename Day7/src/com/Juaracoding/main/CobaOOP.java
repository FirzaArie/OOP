package com.Juaracoding.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CobaOOP {

		public static void main(String[] args) {
			Bidangruang bidang1 = new Bidangruang();
			bidang1.setNama("Kotak");
			Bidangruang bidang2 = new Bidangruang();
			bidang2.setNama("Segitiga");
			Scanner input = new Scanner(System.in);
			System.out.println("Masukkan bentuk yang diinginkan :");
			System.out.println("1. Kotak");
			System.out.println("2. Segitiga");
			int bentuk = input.nextInt();
				if(bentuk == 1) {
				Kotak3 kotak = new Kotak3();
				System.out.println("Masukkan nilai sisi pada kotak :");
				int sisi = input.nextInt();
				kotak.setNilaiSisi(sisi);
				System.out.println("Luas kotak adalah :" +kotak.luas());
				System.out.println("keliling kotak adalah :" +kotak.keliling());
				System.out.println("Berikut tinggi # :");
				kotak.gambarruang();
				
				
				}
			else if(bentuk == 2) {
				Segitiga2 segitiga = new Segitiga2();
				System.out.println("Masukkan nilai alas pada segitiga :");
				int alas = input.nextInt();
				System.out.println("Masukkan nilai tinggi pada segitiga :");
				int tinggi = input.nextInt();
				segitiga.setAlas(alas);
				segitiga.setTinggi(tinggi);
				System.out.println("Luas kotak adalah :" +segitiga.luas());
				System.out.println("keliling kotak adalah :" +segitiga.keliling());
				System.out.println("Berikut tinggi bintang :");
				segitiga.gambarruang();
				}
			else {
				System.out.println("Perintah tidak ditemukan");
				
				}
			
			
		}
}
