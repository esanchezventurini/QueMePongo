package test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Material;
import main.Prenda;
import main.Tipo;
import main.Trama;

public class PrendaTest {
	static Color azul;
	static Color negro;
	static Material algodon;
	static Tipo remera;
	static Tipo zapatillas;
	static Trama trama;
	Prenda unaPrenda;
	
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
			unaPrenda = new Prenda(remera, algodon, negro, null, trama);
	}
	
	@Test
	public void prendaSeCreaConColorSecundarioTest() throws Exception{
			unaPrenda = new Prenda(remera, algodon, negro, azul, trama);
	}
	
	@Test
	public void prendaNoSeCreaSinColorPrimarioTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(remera, algodon ,null, azul, trama);
		});
	}
	
	@Test
	public void prendaNoSeCreaSinTipoTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(null, algodon ,negro, azul, trama);
		});
	}
	
	@Test
	public void prendaNoSeCreaSinMaterialTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(remera, null ,negro, azul, trama);
		});
	}
	
}






