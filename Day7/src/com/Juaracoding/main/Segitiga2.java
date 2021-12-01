package com.Juaracoding.main;

public class Segitiga2 extends Bidangruang implements Ruang2d {

	private float alas = 0;
	private float tinggi = 0;
	
	public Segitiga2() {
		
	}
	
	public Segitiga2(float alas, float tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	@Override
	public void gambarruang() {
		for (int i = 0; i <= tinggi; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}


		}
		public float luas() {
		// TODO Auto-generated method stub
			return 0.5f*alas*tinggi;
		}

		public float keliling() {
			// TODO Auto-generated method stub
			return 3*alas;
		}
		public float getAlas() {
			return alas;
		}
		public void setAlas(int alas) {
			this.alas = alas;
		}
		public float getTinggi() {
			return tinggi;
		}
		public void setTinggi(int tinggi) {
			this.tinggi = tinggi;
		}

		@Override
		public void Bidangruang() {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
		
}

