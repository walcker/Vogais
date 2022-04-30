package br.ufrn.imd;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Vogais<total> {


    public static void main(String[] args) {
        //Declarações
        //String vogais = "aeiou";
        //String consoantes = "bcdfghjklmnpqrstuvwyxz";
        //int dados[] = new int[7];
        Scanner ler = new Scanner(System.in);
        String text;
        int qnt;

        //Instruções
        System.out.print("Digita uma String: ");
        text = ler.nextLine();

        qnt = contarVogais(text);
        System.out.println(text);
        System.out.println(qnt);

        //dados[6] = contarVogais(dados);

        //for(int i:dados)
        // System.out.println(dados[i]);


    }

    /**
     * Método responsável por contar as vogais de um texto
     *
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public static int contarVogais(String text) {
        //Declarações
        int total = 0; //Consoantes = 0, totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
        //int dados[] = new int[6];
        //Instruções
        for (int aux = 0; aux < text.length(); aux++) {
            if (text.charAt(aux) == 'a' || text.charAt(aux) == 'A') {
                total += 1;
                //dados[0] = totalA;
                System.out.println('a');
            } else if (text.charAt(aux) == 'e' || text.charAt(aux) == 'E') {
                total += 1;
                //dados[1] = totalE;
            } else if (text.charAt(aux) == 'i' || text.charAt(aux) == 'I') {
                total += 1;
                //dados[2] = totalI;
            } else if (text.charAt(aux) == 'o' || text.charAt(aux) == 'P') {
                total += 1;
                //dados[3] = totalO;
            } else if (text.charAt(aux) == 'u' || text.charAt(aux) == 'U') {
                total += 1;
                //dados[4] = totalU;
            }


        }
        return total;
    }
}


