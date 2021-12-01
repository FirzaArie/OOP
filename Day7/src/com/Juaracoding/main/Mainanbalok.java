package com.Juaracoding.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mainanbalok {

		List<IMainan> lstMainan = new ArrayList<IMainan>();
	
		public void add(IMainan mainan) {
			lstMainan.add(mainan);
		}
		
		public void mainkanSemua() {
			for(IMainan mainan : lstMainan) {
				mainan.mainkan();
			}
		}
		
}
