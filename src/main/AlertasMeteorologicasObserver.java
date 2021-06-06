package src.main;

import java.util.List;

public class AlertasMeteorologicasObserver extends ObserverAlertas {

  @Override
  public void notificarObservadores(List<String> alertas) {
    this.observadores.forEach(usuario -> usuario.notificarAlertaMeteorologica(alertas));
  }

}
