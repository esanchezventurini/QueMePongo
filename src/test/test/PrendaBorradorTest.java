package src.test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import src.main.Material;
import src.main.Prenda;
import src.main.PrendaBorrador;
import src.main.Tipo;
import src.main.Trama;

public class PrendaBorradorTest {
	static Color azul;
	static Material algodon;
	static Tipo remera;
	static Trama lunares;
	
	@BeforeAll
	public static void initAll() {
		azul = Color.BLUE;
		algodon = Material.ALGODON;
		remera = Tipo.REMERA;
		lunares = Trama.CON_LUNARES;
	}
	
	@Test
	public void prendaSeCreaBienTest() {
		PrendaBorrador borrador = setearValoresCorrectamente();
		borrador.setTrama(lunares);
		borrador.obtenerPrenda();
	}
	
	@Test
	public void laTramaPorDefaultEsLisa() {
		PrendaBorrador borrador = setearValoresCorrectamente();
		Prenda prenda = borrador.obtenerPrenda();
		assertEquals(prenda.getTrama(), Trama.LISA);
	}
	
	private PrendaBorrador setearValoresCorrectamente() {
		PrendaBorrador borrador = new PrendaBorrador(remera);
		borrador.setColorPrimario(azul);
		borrador.setMaterial(algodon);
		return borrador;
	}
}









