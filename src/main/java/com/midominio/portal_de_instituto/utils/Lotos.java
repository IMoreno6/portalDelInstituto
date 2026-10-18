package com.midominio.portal_de_instituto.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.midominio.portal_de_instituto.model.Loteria;

public class Lotos {
	
	public static final List<Loteria> LOTERIAS = List.of(
			new Loteria("España", 49, 6),
			new Loteria("Alemania", 49, 6),
			new Loteria("Francia", 90, 6),
			new Loteria("Italia", 49, 5)
			);
	
	private Lotos() {
		
	}
	
	public static List<Integer> dameLoto(int max, int cantidad){
		List<Integer> bombo = new ArrayList<Integer>();
		for (int i = 1; i <= max; i++) {
			bombo.add(i);
		}
		
		Collections.shuffle(bombo);
		List<Integer> sorteo = new ArrayList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			sorteo.add(bombo.get(i));
		}
		Collections.sort(sorteo);
		return sorteo;
	}

}
