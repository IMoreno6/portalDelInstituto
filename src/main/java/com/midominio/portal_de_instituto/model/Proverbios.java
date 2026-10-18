package com.midominio.portal_de_instituto.model;

import java.util.concurrent.ThreadLocalRandom;

public class Proverbios {

	private static final String[] PROVERBIOS = {
			"El viaje de mil millas comienza con un solo paso.",
			"Si caes siete veces, levántate ocho.",
			"No temas avanzar despacio, teme quedarte quieto.",
			"Quien pregunta es tonto un rato; quien no, toda la vida.",
			"El sabio cambia de opinión; el necio, nunca.",
			"La gota de agua horada la piedra por su constancia.",
			"Quien quiere hacer algo encuentra un medio; quien no, una excusa.",
			"Para mover una montaña, empieza por las piedras pequeñas.",
			"El mejor momento para plantar un árbol es hoy.",
			"Enséñale a pescar y comerá toda la vida." };

	private Proverbios() {
	}

	public static String dameUnoAleatorio() {
	    int indice = ThreadLocalRandom.current().nextInt(PROVERBIOS.length);
	    return PROVERBIOS[indice];
	}

}
