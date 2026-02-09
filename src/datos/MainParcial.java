package datos;

import java.util.Scanner;

public class MainParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 🎓 SIMULADOR: SALVA EL SEMESTRE 🎓 ---");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        Estudiante player = new Estudiante(nombre);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("\n" + player.toString());
            System.out.println("1. 💻 Escribir código (Seguro)");
            System.out.println("2. ☕ Tomar Tinto (Recuperar)");
            System.out.println("3. 🤖 Usar IA (Riesgoso)");
            System.out.print("Elige: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1": player.tirarCodigo(); break;
                case "2": player.tomarTinto(); break;
                case "3": player.usarIA(); break;
                default: System.out.println("❌ Opción no válida.");
            }

            // Validar si ganó o perdió
            if (player.getNeuronas() <= 0) {
                System.out.println("\n🤯 GAME OVER. Te quemaste (Burnout).");
                juegoTerminado = true;
            } else if (player.getNotaFinal() >= 3.0) {
                System.out.println("\n🏆 ¡FELICIDADES! Pasaste con " + player.getNotaFinal());
                System.out.println("¿Seguir por el 5.0? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("no")) {
                    juegoTerminado = true;
                }
            }
        }
    }
}