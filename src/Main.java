import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1) RESPOSTA = 91

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {

            K = K + 1;

            SOMA = SOMA + K;

        }
        System.out.println(SOMA);

//        2) Sequencia de fibonacci

        int numero1 = 0, numero2 = 1, numero3 = 0, i;
        System.out.println("Digite um número para descobrir se ele faz parte da sequência de Fibonacci: ");
        i = sc.nextInt();

        while (i > numero3) {
            numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;
        }

        if (i == numero3) {
            System.out.println("O número PERTENCE na sequência de Fibonacci");
        } else {
            System.out.println("O número NÃO PERTENCE a sequência de Fibonacci");
        }
//          3) Descubra a lógica e complete o próximo elemento:
//              a) 9 -> Avanço de 2 em 2.
//              b) 128 -> Avanço em dobro.
//              c) 49 -> Vai somando o número com o proximo número ímpar
//              d) 100
//              e) 13 -> Sequencia de Fibonnaci
//              f) Não consegui resolver

//        4)
//        Acenderia o 1 interruptor e deixaria uns 5 minutos ligada, apagaria e acenderia o 2 interruptor.
//        Me deslocaria para uma sala e conferia se a luz estava acesa, SE sim ela corresponderia ao 2 interruptor.
//        Se não, eu sentiria a temperatura da lampada ao tocar, se estivesse quente ela corresponderia ao 1 interruptor.
//        Se não, ao 3 interruptor que não foi usado.
//        Assim repitiria o processo mais uma vez e conseguiria descobrir as 3.

//        5)



    sc.close();
    }

}



