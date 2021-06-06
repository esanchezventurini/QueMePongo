package src.main;

import java.util.List;

public class TormentaObserver extends ObserverAlertas{

  @Override
  public void notificarObservadores(List<String> alertas) {
    if(alertas.contains("STORM")){
      this.observadores.forEach(usuario -> usuario.notificarTormenta());
    }
  }
}
