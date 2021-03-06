package src.main;

import java.awt.Color;

import org.apache.commons.lang3.Validate;

public class Prenda {
  long id;

  private Tipo tipo;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;

  public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama;
  }

  public Trama getTrama() {
    return this.trama;
  }

  public boolean esAdecuadoParaTemperatura(short temperatura) {
    return this.tipo.esAdecuadoParaTemperatura(temperatura);
  }

  public boolean esDeCategoria(Categoria categoria) {
    return this.tipo.esDeCategoria(categoria);
  }

  public boolean tieneId(int id) {
    return this.id == id;
  }
}
