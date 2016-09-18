;
import java.util.Scanner;

public class NumMesPetitDeCinc {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();

        for (int i = 0; i < 4; i++) {
            int aux = in.nextInt();
            min = aux < min ? aux : min;
        }

        System.out.println(min);
    }

}
