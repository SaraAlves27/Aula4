/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrozero;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class CarroZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float custoFinal;
        float impostos;
        float distribuidor;
        float custoFabrica;
        Scanner Leia = new Scanner(System.in);
        System.out.println("Digite o valor do custo de fábrica do carro: ");
        custoFabrica = Leia.nextInt();
        distribuidor = (custoFabrica *28)/100;
        impostos = (custoFabrica* 45)/100;
        custoFinal = custoFabrica + distribuidor + impostos;
        System.out.println("O valor do custo final do carro é:R$ "+custoFinal);
        
        
        
    }
    
}
