package src.main;

public abstract class FabricaDeUniformes {

  protected PrendaBorrador getBorrador(Tipo tipo) {
    return new PrendaBorrador(tipo);
  }

  protected abstract Prenda obtenerPrendaSuperior();

  protected abstract Prenda obtenerPrendaInferior();

  protected abstract Prenda obtenerCalzado();

  public Uniforme construirUniforme() {
    return new Uniforme(this.obtenerPrendaSuperior(), this.obtenerPrendaInferior(), this.obtenerCalzado());
  }
}
