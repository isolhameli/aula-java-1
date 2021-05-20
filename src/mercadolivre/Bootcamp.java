package mercadolivre;

import java.util.Scanner;

public class Bootcamp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de exercicio\n");
        int exercicio = scanner.nextInt();
        if (exercicio < 1 || exercicio > 5) {
            System.out.println("Exercicio invalido");
            return;
        }
        switch (exercicio) {
            case 1:
                exercicio1();
                break;
            case 2:
                exercicio2();
                break;
            case 3:
                exercicio3();
                break;
            case 4:
                exercicio4();
                break;
            case 5:
                exercicio5();
                break;
        }
    }


    public static void exercicio1() {
        System.out.println("Exercicio 1\n");
        int limite;
        System.out.println("Digite um numero limite\n");
        limite = scanner.nextInt();
        if (limite < 0) {
            System.out.println("O numero deve ser positivo");
            return;
        }

        for (int i = 0; i < limite; i++) {
            System.out.println(i * 2);
        }
    }

    public static void exercicio2() {
        System.out.println("Exercicio 2\n");
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para n\n");
        n = scanner.nextInt();
        System.out.println("Digite um valor para m\n");
        m = scanner.nextInt();

        if (n < 0 || m < 0) {
            System.out.println("Os numeros n e m devem ser positivos");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i * m);
        }
    }

    public static void exercicio3() {
        System.out.println("Exercicio 3\n");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero\n");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Os numero deve ser um valor positivo");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Se n nao for divisivel por nenhum numero numero ate sqrt(n), n e primo
            if (n % i == 0) {
                System.out.println(n + " NAO E PRIMO");
                return;
            }
        }
        System.out.println(n + " E PRIMO");
        return;
    }

    public static void exercicio4() {
        System.out.println("Exercicio 4\n");
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero\n");
        n = scanner.nextInt();
        int counter = 0;
        int i = 2;
        boolean found;
        while (counter < n) {
            found = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { // Se n nao for divisivel por nenhum numero numero ate sqrt(n), n e primo
                if (i % j == 0) {
                    i += 1;
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println(i);
                counter += 1;
                i += 1;
            }

        }
    }

    public static void exercicio5() {
        System.out.println("Exercicio 2\n");
        int n;
        int m;
        int d;
        int found = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para n\n");
        n = scanner.nextInt();
        System.out.println("Digite um valor para m\n");
        m = scanner.nextInt();
        System.out.println("Digite um valor para d\n");
        d = scanner.nextInt();

        if (n < 0 || m < 0 || d < 0) {
            System.out.println("Os numeros n, m e d devem ser positivos");
            return;
        }
        int counter = 0;
        String compareChar = Integer.toString(d);
        while (found < n) {
            if (Integer.toString(counter).replaceAll(String.format("[^%s]", compareChar), "").length() >= m) {
                System.out.println(counter);
                found += 1;
            }
            counter += 1;
        }


    }
}
