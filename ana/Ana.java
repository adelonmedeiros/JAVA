/*Texto nomes[11] = {“Jane”, “Tim”, “Mia”,”Sam", “Leo”, “Ted”, “Bea”, “Lou”, “Ana”, “Max”, "Zoe"}

Para i de 0 até 10, passo 1, faça

se nomes[i] = “Ana" então

escreve i

fim_para

fim_se

Fim_para*/

public class Ana {

    public static void main(String[] args) {

        String nomes[] = { "Jane", "Tim", "Mia", "Sam", "Sam", "Leo", "Tea", "Bea", "Lou", "Ana", "Max", "Zoe" };
        for (int i = 0; i <= 10; i++) {
            if (nomes[i] == "Ana") {
                System.out.println(i);
            }
        }
    }
}
