package src.main;

import java.util.List;

public class NotificadorAlertasMeteorologicas {
  IProveedorClima proveedorClima;
  List<ObserverAlertas> observers;

  public NotificadorAlertasMeteorologicas(IProveedorClima proveedorClima, List<ObserverAlertas> observers){
    this.proveedorClima = proveedorClima;
    this.observers = observers;
  }

  public void notificar(){
    List<String> alertas = proveedorClima.obtenerAlertasMeteorologicasBuenosAires();
    observers.forEach(observerAlertas -> observerAlertas.notificarObservadores(alertas));
  }

}
