import java.util.Scanner;

public class challenge_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = " ";
        System.out.println("what is the season? ");
        season = scanner.next();

        int number = 0;
        System.out.println("how many number of cups you drink ? ");
        number = scanner.nextInt();

        String adjective = " ";
        System.out.println("what will be the adjective? ");
        adjective = scanner.next();

        scanner.close();
        System.out.println("On a "+ adjective +" " + season + " day, " + "I drink a minimum of " + number + " cups of coffee");
    }
}
