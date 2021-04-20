package main;

public class Tipo {
	String nombre;
	Categoria categoria;
	
	public Tipo(String nombre, Categoria categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	public boolean esDeCategoria(Categoria categoria) {
		return this.categoria == categoria;
	}
}
