package src.main;

import java.util.List;

public class PropuestaQuitar extends Propuesta{

    public PropuestaQuitar(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void aplicarseSobrePrendas(List<Prenda> prendas) {
        prendas.remove(prenda);
    }

    @Override
    public Propuesta propuestaInversa() {
        return new PropuestaAgregar(prenda);
    }
}
