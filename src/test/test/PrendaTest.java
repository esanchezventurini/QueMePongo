package test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Categoria;
import main.Material;
import main.Prenda;
import main.Tipo;

public class PrendaTest {
	static Color azul;
	static Color negro;
	static Categoria parteSuperior;
	static Material algodon;
	static Tipo remera;
	static Tipo zapatillas;
	Prenda unaPrenda;
	
	@BeforeAll
	public static void init() {
		azul = Color.BLUE;
		negro = Color.BLACK;
		parteSuperior = Categoria.PARTE_SUPERIOR;
		algodon = Material.ALGODON;
		
		remera = new Tipo("Remera", Categoria.PARTE_SUPERIOR);
		zapatillas = new Tipo("Zapatillas", Categoria.CALZADO);
	}
	
	@Test
	public void prendaSeCreaSinColorSecundarioTest() throws Exception{
			unaPrenda = new Prenda(parteSuperior, remera, algodon, negro);
	}
	
	@Test
	public void prendaSeCreaConColorSecundarioTest() throws Exception{
			unaPrenda = new Prenda(parteSuperior, remera, algodon, negro, azul);
	}
	
	@Test
	public void prendaNoSeCreaSinColorPrimarioTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(parteSuperior, remera, algodon ,null, azul);
		});
	}
	
	@Test
	public void prendaNoSeCreaSinCategoriaTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(null, remera, algodon ,negro, azul);
		});
	}
	
	@Test
	public void prendaNoSeCreaSinTipoTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(parteSuperior, null, algodon ,negro, azul);
		});
	}
	
	@Test
	public void prendaNoSeCreaSinMaterialTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(parteSuperior, remera, null ,negro, azul);
		});
	}
	
	@Test
	public void categoriaNoCoincideConTipoTest() {
		assertThrows(Exception.class, ()->{
			unaPrenda = new Prenda(parteSuperior, zapatillas, algodon ,negro, azul);
		});
	}
}






