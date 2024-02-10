package eafit.test;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import eafit.Transito;
import eafit.models.Carro;
import eafit.models.TipoDeCombustible;

public class Transitotests {

    private Carro Ferrari_F150;
    private Carro Ford_F_150_Raptor;
    private Carro Porsche_taycan;

    private final Transito transito = new Transito();
    
    public Transitotests(){
        
        // Arrange
        Ferrari_F150 = new Carro(445000, "Rojo", 1200f, "Ferrari", 
            1995, "F-50", UUID.randomUUID().toString(),800_000f, TipoDeCombustible.GASOLINA_CORRIENTE);
        Ford_F_150_Raptor = new Carro(0, "Negra Petróleo", 5000f, "Ford", 
            2025, "F-150 Raptor", UUID.randomUUID().toString(),120_000f, TipoDeCombustible.GASOLINA_EXTRA);
        Porsche_taycan = new Carro(0, "Blanco", 4100f, "Porsche", 
            2022, "Taycan Turbo", UUID.randomUUID().toString(),90_000f, TipoDeCombustible.WATT);

    }

    @Test
    public void calcularPrecio(){
        var precio = transito.calcularPrecioCarro(Ferrari_F150);
        assertEquals(900_000f, precio, 0.0f);
    }

    @Test
    public void calcularPrecioConIVa(){
        var precio = transito.calcularPrecioCarro(Ferrari_F150, 8.2f);
        assertEquals(865_600f, precio, 0.0f);
    }

    @Test
    public void calcularPrecioCamioneta(){
        var precio = transito.calcularPrecioCarro(Ford_F_150_Raptor);
        assertEquals(141_000f,precio, 0.0f);
    }

    @Test
    public void calcularPrecioCamionetaConIVa(){
        var precio = transito.calcularPrecioCarro(Ford_F_150_Raptor, 22f);
        assertEquals(152_400f,precio, 0.0f);
    }

    @Test
    public void calcularElectrico(){
        var precio = transito.calcularPrecioCarro(Porsche_taycan);
        assertEquals(96_750f,precio, 0.0f);
    }

    @Test
    public void calcularElectricoConIVa(){
        var precio = transito.calcularPrecioCarro(Porsche_taycan, 8.2f);
        assertEquals(92_880f,precio, 0.0f);
    }

    @Test
    public void calcularAntiguedadFerrari(){
        var antiguedad = transito.calcularAntiguedadDeportivo(Ferrari_F150);
        assertEquals(29, antiguedad, 0);
    }




    
}