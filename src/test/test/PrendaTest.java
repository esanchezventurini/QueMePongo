package src.test.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;

import src.main.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PrendaTest {
	static Color azul;
	static Color negro;
	static Material algodon;
	static Tipo remera;
	static Tipo zapatillas;
	static Trama trama;
	PrendaBorrador unBorrador;
	
	@BeforeAll
	public static void init() {
		azul = Color.BLUE;
		negro = Color.BLACK;
		algodon = Material.ALGODON;
		trama = Trama.A_CUADROS;
		
		remera = Tipo.REMERA;
		zapatillas = Tipo.ZAPATILLA;
	}
	
	@Test
	public void prendaSeCreaSinColorSecundarioTest() throws Exception{
		unBorrador = new PrendaBorrador(remera);
		unBorrador.setColorPrimario(negro);
		unBorrador.setMaterial(algodon);
		unBorrador.setTrama(trama);
		unBorrador.obtenerPrenda();
	}
	
	@Test
	public void prendaSeCreaConColorSecundarioTest() throws Exception{
		unBorrador = new PrendaBorrador(remera);
		unBorrador.setColorPrimario(negro);
		unBorrador.setColorSecundario(azul);
		unBorrador.setMaterial(algodon);
		unBorrador.obtenerPrenda();
	}
	
	@Test
	public void prendaNoSeCreaSinColorPrimarioTest() {
		unBorrador = new PrendaBorrador(remera);
		unBorrador.setColorSecundario(azul);
		unBorrador.setMaterial(algodon);
		assertThrows(Exception.class, ()->{
			unBorrador.obtenerPrenda();
		});
	}
	
	@Test
	public void prendaNoSeCreaSinTipoTest() {
		assertThrows(Exception.class, ()->{
			unBorrador = new PrendaBorrador(null);
		});
	}
	
	@Test
	public void prendaNoSeCreaSinMaterialTest() {
		unBorrador = new PrendaBorrador(remera);
		unBorrador.setColorPrimario(negro);
		unBorrador.setColorSecundario(azul);
		assertThrows(Exception.class, ()->{
			unBorrador.obtenerPrenda();
		});
	}
	
}






