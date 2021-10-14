package src.main.Controllers;

import spark.Request;
import spark.Response;

public class EventoController extends Controller{

  //Response code: 200 si lo encuentra y lo puede borrar, 404 si no lo encuentra
  public String getEventos(Request request, Response response) {
    //Devuelve un JSON con la lista de eventos
    return "";
  }

  //Response code: 200 si lo encuentra y lo puede borrar, 404 si no lo encuentra
  public Object getSugerenciasDeEvento(Request request, Response response) {
    //Devuelve un JSON con la lista de sugerencias del evento
    return "";
  }
}
