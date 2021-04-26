package main;

import java.awt.Color;

public class FabricaUniformesSanJuan implements FabricaDeUniformes{

	public Uniforme construirUniforme() {
		Prenda prendaSuperior = new Prenda(Tipo.CHOMBA, Material.ALGODON, Color.GREEN, null, Trama.LISA);
		Prenda prendaInferior = new Prenda(Tipo.PANTALON, Material.ACETATO, Color.GRAY, null, Trama.LISA);
		Prenda calzado = new Prenda(Tipo.ZAPATILLA, Material.GOMA, Color.WHITE, null, Trama.LISA);
		return new Uniforme(prendaSuperior, prendaInferior, calzado);
	}
	
}