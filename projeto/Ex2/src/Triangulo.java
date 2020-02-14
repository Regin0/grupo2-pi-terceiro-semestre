public class Retangulo extends Figura{
    protected double baseR;
    protected double altura;

    @Override
    public double calculaArea() {
        return baseR * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "baseR=" + baseR +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                ", expessura=" + expessura +
                '}';
    }
}
