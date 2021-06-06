package src.main;

import org.apache.commons.lang3.Validate;

import java.awt.Color;

public class PrendaBorrador {
  private Tipo tipo;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;

  public PrendaBorrador(Tipo tipo) {
    Validate.notNull(tipo, "El tipo no puede ser null");
    this.tipo = tipo;
    this.trama = Trama.LISA;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda obtenerPrenda() {
    Validate.notNull(trama, "La trama no puede ser null");
    Validate.notNull(material, "El material no puede ser null");
    Validate.notNull(colorPrimario, "El color primario no puede ser null");
    return new Prenda(tipo, material, colorPrimario, colorSecundario, trama);
  }
}












