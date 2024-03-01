/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacliente;

import java.util.Locale;
import java.util.Scanner;

public class SistemaCliente {
   

    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner teclado = new Scanner(System.in);
      
      String Nome,endereco,cpf;
      double idade;
      char sexo;
      
      
        System.out.println("digite seu nome ");
        Nome = teclado.nextLine();
        System.out.println("digite seu endereço");
        endereco = teclado.nextLine();
        System.out.println("digite seu cpf");
        cpf = teclado.nextLine();
        System.out.println("digite sua idade");
        idade = teclado.nextDouble();
        System.out.println("digite seu sexo");
        sexo = teclado.next().charAt(0);
        
        
    }
}
