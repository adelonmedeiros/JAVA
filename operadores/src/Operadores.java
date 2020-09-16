/*

// Meu exemplo Original
// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.

package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        // cria um Scanner obter a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Insira o primeiro número: ");
        numero1 = entrada.nextInt(); // lê o número fornecido pelo usuário

        System.out.print("Insira o segundo número: ");
        numero2 = entrada.nextInt(); // lê o número fornecido pelo usuário

        System.out.println("---------------------------------");

        if (numero1 == numero2)
            System.out.println("Primeiro número: " + numero1 + " é igual ao segundo número: " + numero2);
        System.out.println("---------------------------------");

        if (numero1 != numero2)
            System.out.println("Primeiro número: " + numero1 + "  é diferente do segundo número: " + numero2);
        System.out.println("---------------------------------");

        if (numero1 < numero2)
            System.out.println("Primeiro número: " + numero1 + " é menor que o segundo número: " + numero2);
        System.out.println("---------------------------------");

        if (numero1 > numero2)
            System.out.println("Primeiro número: " + numero1 + " é maior que o segundo número: " + numero2);
        System.out.println("---------------------------------");

        if (numero1 <= numero2)
            System.out.println("Primeiro número: " + numero1 + " é menor ou igual que o segundo número: " + numero2);
        System.out.println("---------------------------------");

        if (numero1 >= numero2)
            System.out.println("Primeiro número: " + numero1 + "  é maior ou igual que o segundo número: " + numero2);
        System.out.println("---------------------------------");

    }

}

*/

// Exemplo Deitel
// Figura 2.15: Comparison.java
// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.

import java.util.Scanner; // programa utiliza a classe Scanner

public class Operadores {
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);

        int number1; // primeiro número a comparar
        int number2; // segundo número a comparar

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    } // fim do método main
} // fim da classe Comparison