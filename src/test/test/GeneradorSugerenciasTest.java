package src.test.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorSugerenciasTest {
    static Color azul;
    static Material algodon;
    static Tipo remera, camperon, pantalon, zapatos, anteojos;
    static Trama lunares;
    static Prenda parteSuperiorApta, parteSuperiorNoApta, parteInferior, calzado, accesorio;
    static AccuWeatherAdapter accuWeatherAdapter;
    static GeneradorSugerencias generadorSugerencias;
    static List<Prenda> listaPrendas;

    @BeforeAll
    public static void initAll() {
        azul = java.awt.Color.BLUE;

        algodon = Material.ALGODON;

        lunares = Trama.CON_LUNARES;

        remera = Tipo.REMERA;
        camperon = Tipo.CAMPERON;
        pantalon = Tipo.PANTALON;
        zapatos = Tipo.ZAPATO;
        anteojos = Tipo.ANTEOJOS;

        parteSuperiorApta = new Prenda(remera, algodon ,azul, null, lunares );
        parteSuperiorNoApta = new Prenda(camperon, algodon ,azul, null, lunares );
        parteInferior = new Prenda(pantalon, algodon ,azul, null, lunares );
        calzado = new Prenda(zapatos, algodon ,azul, null, lunares );
        accesorio = new Prenda(anteojos, algodon ,azul, null, lunares );

        accuWeatherAdapter = new AccuWeatherAdapter();

        generadorSugerencias = new GeneradorSugerencias(accuWeatherAdapter);
    }

    @BeforeEach
    public void initEach() {
        listaPrendas = new ArrayList<Prenda>(Arrays.asList(parteInferior, calzado, accesorio));
    }

    @Test
    public void elAtuendoSeGeneraCorrectamente(){
        listaPrendas.add(parteSuperiorApta);
        Atuendo atuendo = generadorSugerencias.obtenerSugerencia(listaPrendas);
        assertNotNull(atuendo);
    }

    @Test
    public void elAtuendoNoSeGeneraPorqueNingunaPrendaSuperiorEsAptaParaLaTemperaturaDeBuenosAires(){
        listaPrendas.add(parteSuperiorNoApta);
        assertThrows(Exception.class, ()->{
            generadorSugerencias.obtenerSugerencia(listaPrendas);
        });
    }

    @Test
    public void elAtuendoNoSeGeneraPorqueNoHayNingunaPrendaDeLaCategoriaPrendaSuperior(){
        assertThrows(Exception.class, ()->{
            generadorSugerencias.obtenerSugerencia(listaPrendas);
        });
    }

}
