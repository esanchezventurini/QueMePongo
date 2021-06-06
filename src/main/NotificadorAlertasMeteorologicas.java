package src.main;

import java.util.List;

public class NotificadorAlertasMeteorologicas {
  AccuWeatherAdapter accuWeatherAdapter;
  List<ObserverAlertas> observers;

  public NotificadorAlertasMeteorologicas(AccuWeatherAdapter accuWeatherAdapter, List<ObserverAlertas> observers){
    this.accuWeatherAdapter = accuWeatherAdapter;
    this.observers = observers;
  }

  public void notificar(){
    List<String> alertas = accuWeatherAdapter.obtenerAlertasMeteorologicasBuenosAires();
    observers.forEach(observerAlertas -> observerAlertas.notificarObservadores(alertas));
  }

}
