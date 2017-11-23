
package com.rafael.treinojava.teste25;

// Parou na Aula 27
public class TesteCarro {
    public  static void main(String args[]){
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "doblo";
        carro.numPassageiros = 6;
        carro.capCombustivel = 45;
        carro.consumoCombustivel = 74;
        carro.exibirAutonomia();
        
        double autonomia = carro.obterAutonomia();
        System.out.println("Valor da Autonomia do carro: "+autonomia);
        
        double qtdCombustivel10 = carro.calcularCombustivel(10);
        double qtdCombustivel15 = carro.calcularCombustivel(15);
        
        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15 );
        
        // Parou na Aula 27
    }
}
