package Strategy;

public class CalculoHoraValorInicial implements Calculo {

    private int valorInicial;
    private int limiteHorasInicial;
    private int valorHoraExcedente;

    public CalculoHoraValorInicial(int valorInicial, int limiteHorasInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limiteHorasInicial = limiteHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int qtdHoras) {
        if(qtdHoras>limiteHorasInicial)
            return valorInicial+(valorHoraExcedente*(qtdHoras-limiteHorasInicial));
        return valorInicial;
    }
}
