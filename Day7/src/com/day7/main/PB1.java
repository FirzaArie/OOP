package com.day7.main;

import java.util.Scanner;

public class PB1 {
public static void main(String[] args) {
	PB1 main = new PB1();
	String[]huruf = {"A","B","C","D","E"};
	
	System.out.println("Berikut banyaknya huruf :" + huruf.length);
	System.out.println(huruf[0]);
	System.out.println(huruf[1]);
	System.out.println(huruf[2]);
	System.out.println(huruf[3]);
	System.out.println(huruf[4]);
	
	main.rekursi();
}
public void rekursi (){

	Scanner scan = new Scanner(System.in);
	System.out.println("Masukkan nilai yang dihitung");
	int nilai = scan.nextInt();
	
	System.out.println("Nilainya adalah : " +totalSemua(nilai));
	System.out.println(" Dan nilai yang dimasukkan sebanyak : ");
}
public int totalSemua(int nilai) {
	
	System.out.println(nilai +" ");
	if(nilai > -1) {	
		if(nilai %2==1) {	
			return nilai+totalSemua(nilai-1);
		}else {
			return totalSemua(nilai-1);
		} 
}else {
	System.out.println("");
	
	return 0;
}
}
}
