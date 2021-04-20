package main;

import java.awt.Color;
import org.apache.commons.lang3.Validate;

public class Prenda {
	Categoria categoria;
	Tipo tipo;
	Color colorPrimario;
	Color colorSecundario;
	Material material;
	
	public Prenda(Categoria categoria, Tipo tipo, Material material, Color colorPrimario) throws Exception{
		Validate.notNull(categoria,"La prenda no puede ser null");
		Validate.notNull(tipo,"El tipo no puede ser null");
		Validate.notNull(material,"El material no puede ser null");
		Validate.notNull(colorPrimario,"El color primario no puede ser null");
		
		if(!tipo.esDeCategoria(categoria)) {
			throw new Exception("El tipo no coincide con la categoría");
		}
		
		this.categoria = categoria;
		this.tipo = tipo;
		this.colorPrimario = colorPrimario;
		this.material = material;
	}
	
	public Prenda(Categoria categoria, Tipo tipo, Material material, Color colorPrimario, Color colorSecundario) throws Exception {
		this(categoria, tipo, material, colorPrimario);
		this.colorSecundario = colorSecundario;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
}
