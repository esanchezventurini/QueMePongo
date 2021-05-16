package src.main;

import java.awt.Color;

public class FabricaDeUniformesJohnson extends FabricaDeUniformes{
	@Override
	protected Prenda obtenerPrendaSuperior(){
		PrendaBorrador borrador = this.getBorrador(Tipo.CAMISA);
		borrador.setMaterial(Material.ALGODON);
		borrador.setColorPrimario(Color.WHITE);
		return borrador.obtenerPrenda();
	}

	@Override
	protected Prenda obtenerPrendaInferior(){
		PrendaBorrador borrador = this.getBorrador(Tipo.PANTALON_VESTIR);
		borrador.setMaterial(Material.ACETATO);
		borrador.setColorPrimario(Color.BLACK);
		return borrador.obtenerPrenda();
	}

	@Override
	protected Prenda obtenerCalzado(){
		PrendaBorrador borrador = this.getBorrador(Tipo.ZAPATO);
		borrador.setMaterial(Material.CUERO);
		borrador.setColorPrimario(Color.BLACK);
		return borrador.obtenerPrenda();
	}
	
}

