package eafit.interfaces;

public interface Vehiculo {
    float calcularPrecioConIva(float iva);
    int calcularAntiquedad();
    float calcularKilometrajePorAnio();
    float calcularDepreciacion();
    boolean requiereTecnomecanica();
}
