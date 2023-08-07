import java.util.Random;

public class challenge_3 {
    public static void main(String[] args) {

        System.out.println("Roll the die game :D");
        Random random = new Random();
        int leftspaces = 0;
        int die = 0;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            die = random.nextInt(6) + 1;
            System.out.println("die number you got:- " + die);
            total = total + die;
            leftspaces = 20 - total;
            System.out.println("you are on space number " + total + ", " + leftspaces + " more spaces to go to win");
        }
            if(leftspaces != 20){
                System.out.println("you lost the game, try again :( ");
            }

        }


    }