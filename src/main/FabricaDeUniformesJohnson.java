package main;

import java.awt.Color;

public class FabricaDeUniformesJohnson implements FabricaDeUniformes{
	
	public Uniforme construirUniforme() {
		Prenda prendaSuperior = new Prenda(Tipo.CAMISA, Material.ALGODON, Color.WHITE, null, Trama.LISA);
		Prenda prendaInferior = new Prenda(Tipo.PANTALON_VESTIR, Material.ACETATO, Color.BLACK, null, Trama.LISA);
		Prenda calzado = new Prenda(Tipo.ZAPATO, Material.CUERO, Color.BLACK, null, Trama.LISA);
		return new Uniforme(prendaSuperior, prendaInferior, calzado);
	}
	
}

