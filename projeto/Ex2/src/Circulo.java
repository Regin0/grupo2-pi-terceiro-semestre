public class Circuito extends Figura{
    protected double raio;

    public Circuito(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                ", expessura=" + expessura +
                '}';
    }
}
