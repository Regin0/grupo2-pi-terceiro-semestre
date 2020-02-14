public class Retangulo extends Figura{
    protected double lado;

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", cor='" + cor + '\'' +
                ", expessura=" + expessura +
                '}';
    }
}
