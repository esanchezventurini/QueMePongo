package src.main;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FabricaUniformesSanJuan extends FabricaDeUniformes {

  @Override
  protected Prenda obtenerPrendaSuperior() {
    PrendaBorrador borrador = this.getBorrador(Tipo.CHOMBA);
    borrador.setMaterial(Material.ALGODON);
    borrador.setColorPrimario(Color.GREEN);
    return borrador.obtenerPrenda();
  }

  @Override
  protected Prenda obtenerPrendaInferior() {
    PrendaBorrador borrador = this.getBorrador(Tipo.PANTALON);
    borrador.setMaterial(Material.ACETATO);
    borrador.setColorPrimario(Color.GRAY);
    return borrador.obtenerPrenda();
  }

  @Override
  protected Prenda obtenerCalzado() {
    PrendaBorrador borrador = this.getBorrador(Tipo.ZAPATILLA);
    borrador.setMaterial(Material.GOMA);
    borrador.setColorPrimario(Color.WHITE);
    return borrador.obtenerPrenda();
  }
}