package main;

import java.awt.Color;
import org.apache.commons.lang3.Validate;

public class Prenda {
	Tipo tipo;
	Color colorPrimario;
	Color colorSecundario;
	Material material;
	
	public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario){
		Validate.notNull(tipo,"El tipo no puede ser null");
		Validate.notNull(material,"El material no puede ser null");
		Validate.notNull(colorPrimario,"El color primario no puede ser null");
		
		this.tipo = tipo;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.material = material;
	}

}
