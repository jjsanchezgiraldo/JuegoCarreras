package datos;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 🏁 INICIA LA COPA PISTÓN 🏁 ---");

        // 1. INSTANCIAS (Aquí nacen los competidores)
        Carro auto1 = new Carro("Juanjo");
        Carro auto2 = new Carro("Toretto");

        int meta = 1000; // La carrera es a 1000 metros
        boolean hayGanador = false;

        // 2. BUCLE DEL JUEGO (Se repite hasta que alguien gane)
        while (!hayGanador) {

            // Aceleran los dos
            auto1.acelerar();
            auto2.acelerar();

            // Mostramos cómo van (usando el toString)
            System.out.println(auto1.toString());
            System.out.println(auto2.toString());
            System.out.println("---------------------------");

            // Validamos si alguno llegó a la meta
            if (auto1.getDistanciaRecorrida() >= meta || auto2.getDistanciaRecorrida() >= meta) {
                hayGanador = true;
            }

            // Pequeña pausa de medio segundo para darle emoción
            try { Thread.sleep(500); } catch (Exception e) {}
        }

        System.out.println("\n🔥 ¡CARRERA FINALIZADA! 🔥");

        // Decidimos quién ganó
        if (auto1.getDistanciaRecorrida() > auto2.getDistanciaRecorrida()) {
            System.out.println("🏆 EL GANADOR ES: " + auto1.getPiloto());
        } else {
            System.out.println("🏆 EL GANADOR ES: " + auto2.getPiloto());
        }
    }
}