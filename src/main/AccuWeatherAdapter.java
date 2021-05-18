package src.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements IProveedorClima{

    public CondicionClimatica obtenerCondicionClimaticaBuenosAires(){
        return this.obtenerCondicionClimatica("Buenos Aires, Argentina");
    }

    private CondicionClimatica obtenerCondicionClimatica(String ciudad){
        List<Map<String, Object>> informacionClima = this.getInformacionClima(ciudad);
        short temperatura = getTemperaturaEnCelcius(informacionClima);
        short probabilidadPrecipitaciones = getProbabilidadPrecipitacion(informacionClima);
        return new CondicionClimatica(temperatura, probabilidadPrecipitaciones);
    }

    private short getProbabilidadPrecipitacion(List<Map<String, Object>> climaCiudad){
        String probabilidadPrecipitacion = climaCiudad.get(0).get("PrecipitationProbability").toString();
        return Short.parseShort(probabilidadPrecipitacion);
    }

    private short getTemperaturaEnCelcius(List<Map<String, Object>> climaCiudad){
        short temperaturaEnFahrenheit = this.getTemperaturaEnFahrenheit(climaCiudad);
        return this.transformarACelsius(temperaturaEnFahrenheit);
    }

    private short transformarACelsius(short temperaturaEnFahrenheit){
        return (short) ((temperaturaEnFahrenheit - 32) / 1.8);
    }

    private List<Map<String, Object>> getInformacionClima(String ciudad){
        AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();
        return accuWeatherAPI.getWeather(ciudad);
    }

    private short getTemperaturaEnFahrenheit(List<Map<String, Object>> climaCiudad){
        HashMap<String, Object> informacionClima = (HashMap<String, Object>) climaCiudad.get(0).get("Temperature");
        String stringTemperatura = informacionClima.get("Value").toString();
        return Short.parseShort(stringTemperatura);
    }
}
