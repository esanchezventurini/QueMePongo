package src.main;

import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
    List<Prenda> prendas;
    String criterio;
    List<Propuesta> propuestasPendientes;
    List<Propuesta> propuestasAceptadas;

    public Guardarropas(String criterio){
        Validate.notNull(criterio);
        this.criterio = criterio;
        this.prendas = new ArrayList<>();
        this.propuestasPendientes = new ArrayList<>();
        this.propuestasAceptadas = new ArrayList<>();
    }

    private void chequearPropuestaPendienteExiste(Propuesta unaPropuesta){
        if(!propuestasPendientes.contains(unaPropuesta)){
            throw new RuntimeException("La propuesta no se encuentra entre las sugeridas");
        }
    }

    private void chequearPropuestaAceptadaExiste(Propuesta unaPropuesta){
        if(!propuestasAceptadas.contains(unaPropuesta)){
            throw new RuntimeException("La propuesta no se encuentra entre las aceptadas");
        }
    }

    //De esta forma se rechaza
    public void atenderPropuesta(Propuesta unaPropuesta){
        this.chequearPropuestaPendienteExiste(unaPropuesta);
        propuestasPendientes.remove(unaPropuesta);
    }

    public void aceptarPropuesta(Propuesta unaPropuesta){
        this.atenderPropuesta(unaPropuesta);
        unaPropuesta.aplicarseSobrePrendas(prendas);
        propuestasAceptadas.add(unaPropuesta);
    }

    public void deshacerPropuesta(Propuesta unaPropuesta){
        this.chequearPropuestaAceptadaExiste(unaPropuesta);
        Propuesta propuestaInversa = unaPropuesta.propuestaInversa();
        propuestaInversa.aplicarseSobrePrendas(prendas);
    }

    public void recibirPropuesta(Propuesta unaPropuesta){
        this.propuestasPendientes.add(unaPropuesta);
    }

    public void agregarPrenda(Prenda prenda){
        this.prendas.add(prenda);
    }

    public boolean contienePrenda(Prenda prenda){
        return this.prendas.contains(prenda);
    }

}
