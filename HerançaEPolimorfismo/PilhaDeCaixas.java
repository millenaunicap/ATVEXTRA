package HerançaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class PilhaDeCaixas {
    private double alturaMaxima;
    private List<Caixa> pilha;

    public PilhaDeCaixas(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima ;
        this.pilha = new ArrayList<>();
    }
    
    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    
    public boolean empilhar(Caixa caixa) {
        double alturaAtual = alturaAtual();
        
        
        if (alturaAtual + caixa.getAltura() <= alturaMaxima) {
            
            if (caixa instanceof CaixaFragil && !pilha.isEmpty()) {
                Caixa caixaAnterior = pilha.get(pilha.size() - 1);
                
                if (caixaAnterior.getPeso() > ((CaixaFragil) caixa).getPesoMaxSuportado()) {
                    return false; 
                }
            }
            
            if (!pilha.isEmpty() && pilha.get(pilha.size() - 1) instanceof CaixaFragil && caixa.getPeso() > pilha.get(pilha.size() - 1).getPeso()) {
                return false;
            }
            pilha.add(caixa);
            
            alturaAtual = alturaAtual();
            return true; 
        }
        return false; 
    }

    public Caixa desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.remove(pilha.size() - 1);
        } else {
            System.out.println("A pilha está vazia.");
            return null;
        }
    }
    
    public double alturaAtual() {
        double altura = 0;
        for (Caixa caixa : pilha) {
            altura += caixa.getAltura();
        }
        return altura;
    }
    
    public double pesoTotal() {
        double peso = 0;
        for (Caixa caixa : pilha) {
            peso += caixa.getPeso();
        }
        return peso;
    }
    
    public void exibirDados() {
        if (!pilha.isEmpty()) {
            for (int i = pilha.size() - 1; i >= 0; i--) {
                pilha.get(i).exibirEtiqueta();
            }
            System.out.println("Altura Atual da Pilha: " + alturaAtual() + " cm");
            System.out.println("Peso Total da Pilha: " + pesoTotal() + " kg");
        } else {
            System.out.println("A pilha está vazia.");
        }
    }
}