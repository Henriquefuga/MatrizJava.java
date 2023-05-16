
package com.mycompany.principal;
import java.util.Scanner;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tabela[][] = new int [2][3];
        
            for(int linha=0; linha<2; linha++){
                for(int coluna=0; coluna<3; coluna++){

                    System.out.println("Entre com o valor da matriz["+ linha +"] [" + coluna + "]");
                        tabela[linha][coluna] = Integer.parseInt(input.nextLine());
                    System.out.println(" ");//espaçamento
                }
            }

            for (int linha = 0; linha < 2; linha++) {
                for (int coluna = 0; coluna < 3; coluna++) {

                    System.out.print(tabela[linha][coluna] + " ");
                    }
                System.out.println();
                }
        
    }
}
