package com.Juaracoding.main;

public class Kotak2 extends Kotak implements Ruang3d  {

		public Kotak2(float sisi) {
		this.setNilaiSisi(sisi);	
		}
		public float volume() {
			return getNilaiSisi() * getNilaiSisi() * getNilaiSisi();
		}
}
