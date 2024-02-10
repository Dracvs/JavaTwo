package eafit;

import eafit.models.Carro;

public class Transito {
    public float calcularPrecioCarro(Carro carro){
        return carro.calcularPrecioConIva(0);
    }

    public float calcularPrecioCarro(Carro carro, float impuesto){
        return carro.calcularPrecioConIva(impuesto);
    }

    public int calcularAntiguedadDeportivo(Carro carro){
        return carro.calcularAntiquedad();
    }
}
