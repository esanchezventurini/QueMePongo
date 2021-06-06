package src.main;

import java.util.List;
import java.util.Locale;

public class Usuario {
  List<Guardarropas> guardarropas;
  List<Prenda> prendasTotales;
  Atuendo sugerenciaDiaria;
  MailSender mailSender;
  NotificationService notificationService;
  String email;

  public Usuario(MailSender mailSender, NotificationService notificationService, String email, List<Prenda> prendasTotales){
    this.mailSender = mailSender;
    this.notificationService = notificationService;
    this.email = email;
    this.prendasTotales = prendasTotales;
  }

  public List<Prenda> getPrendasTotales(){
    return this.prendasTotales;
  }

  public void agregarGuardarropas(Guardarropas guardarropas){
    this.guardarropas.add(guardarropas);
  }

  public void setSugerenciaDiaria(Atuendo sugerencia) {
    this.sugerenciaDiaria = sugerencia;
  }

  public void notificarTormenta(){
    notificationService.notify("Está lloviendo, no te olvides de paraguas!");
  }

  public void notificarGranizo(){
    notificationService.notify("Hay granizo, no salgas con el auto!");
  }

  public void notificarAlertaMeteorologica(List<String> alertas){
    for(String alerta : alertas){
      String mensaje = "Se generó la siguiente alerta meteorológica: " + alerta.toLowerCase(Locale.ROOT);
      mailSender.send(email, mensaje);
    }
  }

}
