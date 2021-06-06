package src.main;

import java.util.List;

public class PropuestaAgregar extends Propuesta {

  public PropuestaAgregar(Prenda prenda) {
    this.prenda = prenda;
  }

  @Override
  public void aplicarseSobrePrendas(List<Prenda> prendas) {
    prendas.add(prenda);
  }

  @Override
  public Propuesta propuestaInversa() {
    return new PropuestaQuitar(prenda);
  }
}
