package main;

import java.awt.Color;

public class PrendaBorrador {
	Tipo tipo;
	Color colorPrimario;
	Color colorSecundario;
	Material material;
	Trama trama;
	
	public PrendaBorrador() {
		this.trama = Trama.LISA;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	private void validarTipoCargado(){
		if(tipo == null) {
			throw new RuntimeException("Primero debe ingresarse el tipo");
		}
	}
	
	public void setColorPrimario(Color colorPrimario) {
		validarTipoCargado();
		this.colorPrimario = colorPrimario;
	}
	
	public void setColorSecundario(Color colorSecundario) {
		validarTipoCargado();
		this.colorSecundario = colorSecundario;
	}
	
	public void setMaterial(Material material) {
		validarTipoCargado();
		this.material = material;
	}
	
	public void setTrama(Trama trama) {
		validarTipoCargado();
		this.trama = trama;
	}
	
	public Prenda obtenerPrenda() {
		return new Prenda(tipo, material, colorPrimario, colorSecundario, trama);
	}
}












