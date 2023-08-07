import java.util.Scanner;

public class challenge_2 {
    public static void main(String[] args){

        System.out.println("Amount game!!!");

        Scanner sc= new Scanner(System.in);
        int note_20 = 0;
        System.out.println("how many 20 rupees notes ?");
        note_20 = sc.nextInt();
        int n1 = 20 * note_20;

        int note_50 = 0;
        System.out.println("how many 50 rupees notes ?");
        note_50 = sc.nextInt();
        int n2 = 50 * note_50;

        int note_100 = 0;
        System.out.println("how many 100 rupees notes ?");
        note_100 = sc.nextInt();
        int n3 = 100 * note_100;

        int note_500 = 0;
        System.out.println("how many 500 rupees notes ?");
        note_500 = sc.nextInt();
        int n4 = 500 * note_500;

        int total = n1 + n2 + n3 + n4;
        int rem = 5000 - total;
        System.out.println("total amount is: "+total);

        if (total >= 5000){
            System.out.println("Congratulations, you won!");
        }
        else System.out.println("Sorry, you lost by " + " " + rem);
    }
}
