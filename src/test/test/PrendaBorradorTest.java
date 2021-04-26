package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Material;
import main.Prenda;
import main.PrendaBorrador;
import main.Tipo;
import main.Trama;

public class PrendaBorradorTest {
	static PrendaBorrador borrador;
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
	
	@BeforeEach
	public void initEach() {
		borrador = new PrendaBorrador();
	}
	
	@Test
	public void prendaSeCreaBienTest() {
		setearValoresCorrectamente(borrador);
		borrador.setTrama(lunares);
		borrador.obtenerPrenda();
	}
	
	@Test
	public void noSeSeteaPrimeroElTipo() {
		assertThrows(Exception.class, ()->{
			borrador.setColorPrimario(azul);
		});
	}
	
	@Test
	public void laTramaPorDefaultEsLisa() {
		setearValoresCorrectamente(borrador);
		Prenda prenda = borrador.obtenerPrenda();
		assertEquals(prenda.getTrama(), Trama.LISA);
	}
	
	private void setearValoresCorrectamente(PrendaBorrador borrador) {
		borrador.setTipo(remera);
		borrador.setColorPrimario(azul);
		borrador.setMaterial(algodon);
	}
}









