package com.Juaracoding.main;

import java.util.ArrayList;
import java.util.List;

public class OOP {
	
	public static void main(String[] args) {
//		Bidangruang bidang1 = new Bidangruang();
//
//		bidang1.setNama("Lingkaran");
//		
//		Bidangruang bidang2 = new Bidangruang();
//
//		bidang2.setNama("Segitiga");
//		
//		System.out.println("Bentuk pada bidang1 : " +bidang1.getNama());
//		
//		System.out.println("Bentuk pada bidang2 : " +bidang2.getNama());
//	
//		Segitiga2 segitiga = new Segitiga2();
//		segitiga.setNama("Segitiga Sama Sisi");
//		segitiga.gambarruang();
//		
//		Kotak kotak = new Kotak();
//		kotak.setNama("Kotak");
//		kotak.gambarruang();
//		
//		Bidangruang [] ruang = new Bidangruang[2];
//		
//		ruang[0] = segitiga;
//		ruang[1] = kotak;
//
//		for (int i = 0; i < ruang.length; i++) {
//			
//			ruang[1].gambarruang();
//		}
//		
//		Blox blox = new Blox();
//		
//		Mainanbalok mainan = new Mainanbalok();
//		
//		mainan.add(kotak);
//		mainan.add(segitiga);
//		mainan.add(blox);
//		
//		mainan.mainkanSemua();
//	}
	List<Ruang2d> lstRuang = new ArrayList<Ruang2d>();
		
	lstRuang.add(new Kotak(10));
	lstRuang.add(new Segitiga2(5,10));
	lstRuang.add(new Kotak2(5));
	
	
	for (Ruang2d ruang2d : lstRuang) {
		
		if(ruang2d instanceof Ruang3d) {
		System.out.println("Volumenya adalah " +((Ruang3d)ruang2d).volume());
		}	
	System.out.println("Luasnya adalah "+ruang2d.luas());
	}
   }
}
