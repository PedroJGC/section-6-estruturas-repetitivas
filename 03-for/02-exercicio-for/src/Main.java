import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         /*
         * Exercício 02
         * Leia um valor inteiro N. Este valor será a quantidade de
         * valores inteiros X que serão lidos em seguida. Mostre quantos
         * destes valores X estão dentro do intervalo [10,20] e quantos
         * estão fora do intervalo, mostrando essas informações conforme
         * exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
         * */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int in= 0;
        int out = 0;

        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + "in");
        System.out.println(out + "out");

        sc.close();
    }
}