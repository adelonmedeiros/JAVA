/*

// Meu exemplo Original
// Programa de adição que insere dois números, então exibe a soma deles

package adicao;

import java.util.Scanner;

public class Adicao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // cria um Scanner obter a entrada do usuário

        int numero1; // primeiro número para a soma
        int numero2; // segundo número para a soma
        int soma; // soma do primeiro número com o segundo

        System.out.print("Insira o primeiro número a ser somado: "); // terminal
        numero1 = entrada.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Insira o segundo número a ser somado: "); // terminal
        numero2 = entrada.nextInt(); // lê o segundo número fornecido pelo usuário

        soma = numero1 + numero2; // soma os dois números e armazena o resultado em "soma"

        System.out.printf("A soma é: " + soma); // exibe a soma

    } // fim do método main

} // fim da classe adicao

*/

// Exemplo Deitel
// Figura 2.7: Addition.java
// Programa de adição que insere dois números, então exibe a soma deles.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Adicao {
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int number1; // primeiro número a somar
        int number2; // segundo número a somar
        int sum; // soma de number1 e number2

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        sum = number1 + number2; // soma os números, depois armazena o total em sum

        System.out.printf("Sum is %d%n", sum); // exibe a soma
    } // fim do método main
} // fim da classe Adicao