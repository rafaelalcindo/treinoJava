
package com.rafael.treinojava.teste24.licaoCasa;

/**
 *
 * @author aqcez09
 */
public class ExecLampada {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        lampada.cor = "branco";
        lampada.garantia = 5;
        lampada.modelo = "philips";
        lampada.potencia = 34;
        lampada.tensao = "4W";
        lampada.tipoAbajur = true;
        lampada.tipoluz = "Florecente";
        lampada.tipos = new String[5];
        
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeoes";
        
        
        System.out.println(lampada.tipoluz);
    }
}
