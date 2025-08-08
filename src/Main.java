import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userTextInput = new Scanner(System.in);

//        System.out.print("Hello word \n");

//        String response = userTextInput.nextLine();
//        System.out.print("User said: " + response + "\n");

//        int inteiro = 1;
        // necessario ter um L maiusculo no final do numero
//        long numerosGrandes = 12321312312312L;

//        double decimal = 1.5;
        // Um tipo decimal com limite menor. É preciso colocar a letra f no final.
//        float decimalMenor = 2.5f;

//        String texto = "texto";
        // Usado para guardar uma única letra ou símbolo. O valor deve estar entre aspas simples (' ').
//        char letra = 'A';

//        boolean booleano = true;
//
//        int soma = 8 + 3;
//        int subtracao = 8 - 3;
//        int multiplicacao = 8 * 3;
//        int divisao = 8 / 3;
//        int resto = 10 % 3;

        // Operadores comparacao
//        System.out.println( 10 == 6);
//        System.out.println( 10 >= 6);
//        System.out.println( 10 <= 6);
//        System.out.println( 10 != 6);
//        System.out.println( 10 > 6);
//        System.out.println( 10 < 6);

        // Operadores logicos
        // && ||

//        final double constante = 1.5;
//        final String constante2 = "texto fixo, nao muda";
//        final int constante3 = 1;

//        if (response.isEmpty()) {
//            System.out.print("preenchido");
//        }


//         Aula 3
//         Condicional
//        Scanner sc = new Scanner(System.in);
//         Realiza a leitura do foi informado
//        String read = sc.nextLine();
//        int idade = Integer.parseInt(read);
//        System.out.println(idade);

//        Aula 4
//        Revisao (if + exercicios)

//        Aula 5
//        while / do while

//        Aula 6
//        For
//        Contagem regressiva, comencando pelo 10
//        for (int i = 10; i != 0; i--) {
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);

//        Tabuada
//        System.out.println("Digite um numero inteiro");
//        int userNumber = sc.nextInt();
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println( i + " X " + userNumber + " = " + userNumber * i);
//        }

//      Calculo Fatorial
//        System.out.println("Digite um numero inteiro maior que 0");
//        int userNumber = sc.nextInt();
//
//        if (userNumber > 0) {
//            int result = 1;
//            for (int i = 1; i <= userNumber; i++) {
//                result *= i;
//            }
//            System.out.println(result);
//        } else {
//            System.out.println("Numero informado tem que ser maior que 0");
//        }


//        Aula 7 - Git + Vetores
//        Precisa definir uma qtd de itens q serao armazenados no array
        int[] idades = new int[5];

//        Uma maneira de adicionar dados no Array
//        Informar a posicao em que o valor estara
        idades [0] = 5;
        idades [1] = 21;
        idades [2] = 15;
        idades [3] = 30;
        idades [4] = 53;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades [i]);
        }


    }
}
