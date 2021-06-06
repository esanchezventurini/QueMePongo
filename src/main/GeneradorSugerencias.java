package src.main;

import org.apache.commons.lang3.Validate;

import java.util.Collections;
import java.util.List;

public class GeneradorSugerencias {
  IProveedorClima proveedorClima;

  public GeneradorSugerencias(IProveedorClima proveedorClima) {
    this.proveedorClima = proveedorClima;
  }

  public void generarSugerencias(List<Usuario> usuarios){
    usuarios.forEach(this::generarSugerenciaDiaria);
  }

  private void generarSugerenciaDiaria(Usuario usuario){
    List<Prenda> prendas = usuario.getPrendasTotales();
    Atuendo atuendo = this.obtenerSugerencia(prendas);
    usuario.setSugerenciaDiaria(atuendo);
  }

  public Atuendo obtenerSugerencia(List<Prenda> prendas) {
    CondicionClimatica condicionClimatica = proveedorClima.obtenerCondicionClimaticaBuenosAires();
    short temperatura = condicionClimatica.temperaturaEnCelsius;
    return new Atuendo(
        obtenerPrendaAptaDeCategoria(Categoria.PARTE_SUPERIOR, prendas, temperatura),
        obtenerPrendaAptaDeCategoria(Categoria.PARTE_INFERIOR, prendas, temperatura),
        obtenerPrendaAptaDeCategoria(Categoria.CALZADO, prendas, temperatura),
        obtenerPrendaAptaDeCategoria(Categoria.ACCESORIO, prendas, temperatura)
    );
  }

  public Prenda obtenerPrendaAptaDeCategoria(Categoria categoria, List<Prenda> prendas, short temperatura) {
    Collections.shuffle(prendas);
    Prenda prendaElegida = prendas.stream().
        filter(prenda -> prenda.esDeCategoria(categoria) && prenda.esAdecuadoParaTemperatura(temperatura)).
        findAny().
        orElse(null);
    Validate.notNull(prendaElegida, "No se tiene ninguna prenda apta de la categoría " + categoria.toString());
    return prendaElegida;
  }
}
