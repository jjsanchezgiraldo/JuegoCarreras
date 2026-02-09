package datos;

public class Carro {
    // 1. PROPIEDADES PRIVADAS (Encapsulamiento)
    private String piloto;
    private int distanciaRecorrida;

    // 2. CONSTRUCTOR (Nace el auto en la línea de salida)
    public Carro(String piloto) {
        this.piloto = piloto;
        this.distanciaRecorrida = 0; // Arranca en 0 metros
    }

    // 3. MÉTODOS (Lógica del juego: avanzar aleatoriamente)
    public void acelerar() {
        int avance = (int) (Math.random() * 50) + 10; // Avanza entre 10 y 60 metros
        this.distanciaRecorrida += avance;
    }

    // 4. GETTERS (Para consultar el estado)
    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public String getPiloto() {
        return piloto;
    }

    // 5. TO STRING (Reporte de estado)
    @Override
    public String toString() {
        return "🏎️ " + piloto + " va por los " + distanciaRecorrida + " metros.";
    }
}