package eafit.models;

import java.util.Calendar;

import eafit.interfaces.Vehiculo;

public class Carro implements Vehiculo{
    
    private final float IVA = 12.5f;
    private final float DESCUENTO_ELECTRICO = 10f;
    private final float IMPUESTO_PESADO = 5f;
    private final float DEPRECIACION_ANUAL = 5f;
    private final int REVISION_TECNOMECANICA = 5;


    private float Kilometraje;
    private String Color;
    private float Peso;
    private String Marca;
    private int Anio;
    private String Modelo;
    private String SerialMotor;
    private float Precio;
    private TipoDeCombustible Combustible;

    public Carro() {
    }

    public Carro(float kilometraje, String color, float peso, String marca, int anio, String modelo, String serialMotor,
            float precio, TipoDeCombustible combustible) {
        Kilometraje = kilometraje;
        Color = color;
        Peso = peso;
        Marca = marca;
        Anio = anio;
        Modelo = modelo;
        SerialMotor = serialMotor;
        Precio = precio;
        Combustible = combustible;
    }

    @Override
    public float calcularPrecioConIva(float iva) {
        // Operación Ternaria. Ternary.
        var iva_agregado = iva > 0 ? (iva/100) * Precio : (IVA / 100) * Precio;
        

        if(Peso > 2500)
        {
            iva_agregado += Precio * (IMPUESTO_PESADO / 100);
        }

        if(Combustible == TipoDeCombustible.WATT)
        {
            iva_agregado -= Precio * (DESCUENTO_ELECTRICO / 100);
        }

        return iva_agregado + Precio;
    }

    @Override
    public int calcularAntiquedad() {
        Calendar calendario = Calendar.getInstance();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if(year < 0){
            return 1;
        }
        else {
            return year - Anio;
        }

    }

    @Override
    public float calcularKilometrajePorAnio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularKilometrajePorAnio'");
    }

    @Override
    public float calcularDepreciacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularDepreciacion'");
    }

    @Override
    public boolean requiereTecnomecanica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requiereTecnomecanica'");
    }


    // Getters Setters
    public float getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        Kilometraje = kilometraje;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getSerialMotor() {
        return SerialMotor;
    }

    public void setSerialMotor(String serialMotor) {
        SerialMotor = serialMotor;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public TipoDeCombustible getCombustible() {
        return Combustible;
    }

    public void setCombustible(TipoDeCombustible combustible) {
        Combustible = combustible;
    }

    

}
