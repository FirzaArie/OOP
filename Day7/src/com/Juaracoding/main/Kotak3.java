package com.Juaracoding.main;

public class Kotak3 extends Bidangruang implements Ruang2d{
	
	private float NilaiSisi = 0;
	
	public Kotak3() {
		
	}
	
	public Kotak3(float nilai) {
			this.NilaiSisi = nilai;
	}
	
	@Override
		public void gambarruang() {
			for (int i = 0; i <= NilaiSisi; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}


			}
			public float luas() {
				return NilaiSisi*NilaiSisi;
			}

			public float keliling() {
				// TODO Auto-generated method stub
				return 4*NilaiSisi;
			}
			public float getNilaiSisi() {
				return NilaiSisi;
			}
			public void setNilaiSisi(float NilaiSisi) {
				this.NilaiSisi = NilaiSisi;
			}
			@Override
			public void Bidangruang() {
				// TODO Auto-generated method stub
				
			}
}
