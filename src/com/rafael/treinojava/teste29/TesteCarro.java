
package com.rafael.treinojava.teste29;


public class TesteCarro {
    public static void main(String args[]){
        Carro van = new Carro();
        van.marca = "Fiat";
        
        System.out.println("Numero de Passageiros: "+van.numPassageiros);
        
        Carro van2 = new Carro("Chevrolet");
        System.out.println("Marca da van2: "+van2.marca);
        
    }
}
