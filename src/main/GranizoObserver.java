package src.main;

import java.util.List;

public class GranizoObserver extends ObserverAlertas{

  @Override
  public void notificarObservadores(List<String> alertas) {
    if(alertas.contains("HAIL")){
      this.observadores.forEach(usuario -> usuario.notificarGranizo());
    }
  }

}
