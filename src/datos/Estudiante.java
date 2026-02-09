package datos;

public class Estudiante {
    // 1. ATRIBUTOS PRIVADOS (Encapsulamiento)
    private String nombre;
    private int neuronas;     // Vida (0-100)
    private int cafeina;      // Energía (0-100)
    private double notaFinal; // Puntaje (0.0 - 5.0)

    // 2. CONSTRUCTOR
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.neuronas = 100; // Empieza fresco
        this.cafeina = 50;
        this.notaFinal = 0.0;
    }

    // 3. MÉTODOS (Acciones)
    public void tirarCodigo() {
        if (this.cafeina >= 10) {
            this.cafeina -= 10;
            this.neuronas -= 5;
            double avance = (Math.random() * 0.5) + 0.1; // Sube nota aleatoria
            this.notaFinal += avance;
            System.out.println("💻 " + nombre + " programó una función brutal. ¡Sube la nota!");
        } else {
            System.out.println("😴 Estás dormido. Necesitas tinto.");
        }
        validarLimites();
    }

    public void tomarTinto() {
        this.cafeina += 40;
        this.neuronas += 10;
        System.out.println("☕ ¡Uff, qué buen tinto! Energía restaurada.");
        validarLimites();
    }

    public void usarIA() {
        if (this.neuronas >= 20) {
            // Riesgo del 30% de que te pillen
            if (Math.random() > 0.7) {
                this.notaFinal -= 1.0;
                this.neuronas -= 30;
                System.out.println("🚨 ¡EL PROFE TE PILLÓ! Te anuló el punto.");
            } else {
                this.notaFinal += 1.0;
                this.neuronas -= 20;
                System.out.println("🤖 La IA te salvó el pellejo. ¡Nota arriba!");
            }
        } else {
            System.out.println("🧠 No tienes neuronas para pensar el prompt.");
        }
        validarLimites();
    }

    // Método privado para que los números no se rompan
    private void validarLimites() {
        if (this.notaFinal > 5.0) this.notaFinal = 5.0;
        if (this.notaFinal < 0.0) this.notaFinal = 0.0;
        if (this.neuronas > 100) this.neuronas = 100;
        if (this.cafeina > 100) this.cafeina = 100;
    }

    // 4. GETTERS Y TOSTRING
    public int getNeuronas() { return neuronas; }
    public double getNotaFinal() { return notaFinal; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return String.format("📝 %s | Neuronas: %d%% | Cafeína: %d%% | Nota: %.1f",
                nombre, neuronas, cafeina, notaFinal);
    }
}