package HerançaEPolimorfismo;

public class CaixaFragil extends Caixa {
    private double pesoMaxSuportado;

    public CaixaFragil(String identificador, String conteudo, double peso, double altura) {
        super(identificador, conteudo, peso, altura);
        this.pesoMaxSuportado = peso;
    }
    
    public double getPesoMaxSuportado() {
        return pesoMaxSuportado;
    }

    public void setPesoMaxSuportado(double pesoMaxSuportado) {
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    @Override
    public void exibirEtiqueta() {
        super.exibirEtiqueta();
        System.out.println("Peso Máximo Suportado: " + pesoMaxSuportado + " kg");
    }
}
