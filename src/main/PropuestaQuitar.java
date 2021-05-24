package src.main;

import java.util.List;

public class PropuestaQuitar extends Propuesta{

    public PropuestaQuitar(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void aplicarseSobrePrendas(List<Prenda> prendas) {
        if(!prendas.contains(prenda)){
            throw new RuntimeException("La prenda que se desea quitar no existe");
        }
        prendas.remove(prenda);
    }

    @Override
    public Propuesta propuestaInversa() {
        return new PropuestaAgregar(prenda);
    }
}
