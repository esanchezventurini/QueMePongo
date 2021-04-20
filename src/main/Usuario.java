package main;

import java.util.List;

public class Usuario {
	List<Prenda> prendas;
	
	public void agregarPrenda(Prenda unaPrenda) {
		prendas.add(unaPrenda);
	}
}
