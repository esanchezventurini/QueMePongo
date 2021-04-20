package main;

public class Tipo {
	String nombre;
	Categoria categoria;
	
	public boolean esDeCategoria(Categoria categoria) {
		return this.categoria == categoria;
	}
}
