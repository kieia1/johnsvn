import java.util.Scanner;

public class NumMesPetitDeCinc {

    public static void main(String... args) {
	// Declaro e inicializo la clase Scanner
        Scanner in = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int aux = in.nextInt();
            min = aux < min ? aux : min;
            max = aux > max ? aux : max;
        }

        System.out.println(min);
    }

}
