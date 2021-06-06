package src.main;

import java.util.ArrayList;
import java.util.List;

public abstract class ObserverAlertas {
  List<Usuario> observadores = new ArrayList<>();

  public void suscribirObservador(Usuario usuario){
    this.observadores.add(usuario);
  }

  public void desuscribirObservador(Usuario usuario) {
    this.observadores.remove(usuario);
  }

  public abstract void notificarObservadores(List<String> alertas);

}
