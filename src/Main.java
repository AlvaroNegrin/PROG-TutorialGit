import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        final Scanner SC = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = SC.nextInt();
        System.out.println("Tu número es " + num);

        SC.close();
    }

}