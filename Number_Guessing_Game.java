import java.util.Scanner;
public class GUESSING_GAME {

    public static void main(String[] args) {

        int x = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int a, i;
        String p;
        System.out.println("----WELCOME TO NUMBER GUESSING GAME----");
        System.out.println("YOU HAVE 5 TRIES TO GUESS THE NUMBER");
        System.out.println("|=====================================|");
        System.out.println("|      NUMBER OF TRIES      SCORE     |");
        System.out.println("|            1ST             10       |");
        System.out.println("|            2ND              8       |");
        System.out.println("|            3RD              6       |");
        System.out.println("|            4TH              4       |");
        System.out.println("|            5TH              2       |");
        System.out.println("|       FAIL TO GUESS         0       |");
        System.out.println("|=====================================|");

        for (i = 1; i <= 5; i++) {
            System.out.println("Guess the Number: ");
            a = sc.nextInt();
            if (a == x) {
                System.out.println("!!!Congratulation!!! You Guessed Right in " + i + "th Try.");
                  if (i == 5) {
                        System.out.println("Your Score is: 2");
//                break;
                    } else if (i == 4) {
                        System.out.println("Your Score is: 4");
//                break;
                    } else if (i == 3) {
                        System.out.println("Your Score is: 6");
//                break;
                    } else if (i == 2) {
                        System.out.println("Your Score is: 8");
//                break;
                    } else if (i == 1) {
                        System.out.println("Your Score is: 10");
//                break;
                    }

                    break;

            } else if (a < 0) {
                System.out.println("Quit Game?");
                p = sc.next();
                if (p.equals("Y") || p.equals("y") || p.equals("YES") || p.equals("yes") || p.equals("Yes")) {
                    System.out.println("Thank you for playing");
                    System.out.printf("The Number was: " + x);
                    break;

                } else
                    continue;
            } else {while(i<=5){
                System.out.println("Wrong Guess :( " + "You have " + (5 - i) + " try left");
            break;}
                while(i<5){
                if (x - a > 20)
                    System.out.println("Guessed Number is too Small");
                else if (x - a > 5 && x - a < 20)
                    System.out.println(" Guessed Number is Small");
                else if (x - a < 5 && x - a > 0)
                    System.out.println("You are too Close!! Guessed Number is Small");
                else if (a - x < 5 && a - x > 0)
                    System.out.println("You are too Close!! Guessed Number is Big");
                else if (a - x > 5 && a - x < 20)
                    System.out.println("Guessed Number is Big");
                else if (a - x > 20)
                    System.out.println("Guessed Number is too Big");
                    break;}}
        }

            if (i > 5) {
                System.out.println("!!!!!GAME OVER!!!!");
                System.out.println("Your Score is: 0 ");
                System.out.println("BETTER LUCK NEXT TIME");
                System.out.printf("The Number is: " + x);

            }


    }
        }
