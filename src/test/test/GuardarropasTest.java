package src.test.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class GuardarropasTest {
    static Color azul;
    static Material algodon;
    static Tipo remera, camperon, pantalon;
    static Trama lunares;
    static Prenda prenda1, prenda2, prenda3;

    static PropuestaAgregar propuestaAgregar;
    static PropuestaQuitar propuestaQuitar;
    static PropuestaQuitar propuestaQuitar2;

    static Guardarropas guardarropas;

    @BeforeAll
    public static void initAll(){
        azul = java.awt.Color.BLUE;

        algodon = Material.ALGODON;

        lunares = Trama.CON_LUNARES;

        remera = Tipo.REMERA;
        camperon = Tipo.CAMPERON;
        pantalon = Tipo.PANTALON;

        prenda1 = new Prenda(remera, algodon ,azul, null, lunares );
        prenda2 = new Prenda(camperon, algodon ,azul, null, lunares );
        prenda3 = new Prenda(pantalon, algodon ,azul, null, lunares );

        propuestaAgregar = new PropuestaAgregar(prenda2);
        propuestaQuitar = new PropuestaQuitar(prenda3);
        propuestaQuitar2 = new PropuestaQuitar(prenda2);
    }

    @BeforeEach
    public void initEach(){
        guardarropas = new Guardarropas("Ropa de viaje");

        guardarropas.agregarPrenda(prenda1);

        guardarropas.recibirPropuesta(propuestaAgregar);
        guardarropas.recibirPropuesta(propuestaQuitar);
    }

    @Test
    public void seAceptaLaPropuestaDeAgregarPrendaCorrectamente(){
        guardarropas.aceptarPropuesta(propuestaAgregar);
        assertTrue(guardarropas.contienePrenda(prenda2));
    }

    @Test
    public void seRechazaUnaPropuestaYElGuadarropasNoCambia(){
        guardarropas.atenderPropuesta(propuestaAgregar);
        assertFalse(guardarropas.contienePrenda(prenda2));
    }

    @Test
    public void seAceptaLaPropuestaDeQuitarPrendaCorrectamente(){
        guardarropas.agregarPrenda(prenda3);
        guardarropas.aceptarPropuesta(propuestaQuitar);
        assertFalse(guardarropas.contienePrenda(prenda3));
    }

    @Test
    public void noSePuedeAcetarPropuestaQuitarPorqueLaPrendaNoEstaEnGuardarropas(){
        assertThrows(Exception.class, ()-> guardarropas.aceptarPropuesta(propuestaQuitar));
    }

    @Test
    public void seDeshaceUnaPropuestaAceptadaAnteriormente(){
        guardarropas.aceptarPropuesta(propuestaAgregar);
        guardarropas.deshacerPropuesta(propuestaAgregar);
        assertFalse(guardarropas.contienePrenda(prenda2));
    }

}
