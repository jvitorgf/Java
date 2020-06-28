/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import java.util.Scanner;

/**
 *
 * @author jvitorgf 
 */

public class CalculadoraImc {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura = 0;
        double peso = 0;
        double imc = 0;
        
        altura = getAltura(altura);
        peso = getPeso(peso);
        imc = imc(altura,peso);
        veredito(imc);
        
  
    }
    
    
    public static int getAltura(int altura){
        System.out.println("Digite sua altura em centímetros.");
        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextInt();
        return altura;
    }
    
    public static double getPeso(double peso){
        System.out.println("Digite seu peso em KG.");
        Scanner entrada = new Scanner(System.in);
        peso = entrada.nextDouble();
      
        return peso;
    }
    
    public static double imc(int altura,double peso){
        return (peso/(altura*altura))*10000;
    }
    
    public static void veredito(double imc){
        if(imc>25.00){
            System.out.println("Você está acima do peso! Seu IMC é de: "+imc);
        } else if(imc<18.50){
            System.out.println("Você está abaixo do peso! Seu IMC é de: "+imc);
        }else{
            System.out.println("Você está em um peso ideal! Seu IMC é de: "+imc);
        }
    }
}
