package src.main;

import java.util.List;

public interface IProveedorClima {
  public CondicionClimatica obtenerCondicionClimaticaBuenosAires();
  public List<String> obtenerAlertasMeteorologicasBuenosAires();
  public void actualizarAlertasMeteorologicasBuenosAires();
}
