package src.main;

import java.util.List;

public abstract class Propuesta {
  Prenda prenda;

  public abstract void aplicarseSobrePrendas(List<Prenda> prendas);

  public abstract Propuesta propuestaInversa();
}
