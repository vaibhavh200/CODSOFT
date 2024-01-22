import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Hello Welcome to my game!");
        System.out.println("\n"+"I guess a number between 1 to 100, " + " you have 5 attemp to guess the correct number");
        System.out.println("\n"+"For every coorect answer you got 10 points");
        System.out.println("\n"+"Are you ready? Yes(1) or No(0)");
        int play = sc.nextInt();
        int point = 0;
        int round = 0;
        while(play==1){
            int computer_guess = r.nextInt(100)+1;
            int attempt = 0;
            int max_attempt = 5;
            while(attempt<max_attempt){
                System.out.print("Please enter your guess: ");
                int user_guess = sc.nextInt();
                attempt++;
                if(user_guess==computer_guess){
                    System.out.println("\n"+"\t"+"Congratulations!! You won");
                    System.out.println("\t"+"You guess the number "+computer_guess+" in- "+attempt+" Attempt");
                    point+=10;
                    break;
                }else if(user_guess<computer_guess){
                    System.out.println("You guess too low!");
                }else{
                    System.out.println("You guess too high!");
                }
            }
            if(attempt>=max_attempt){
                System.out.println("Sorry you lose \t the right answer was : "+computer_guess);
            }
            System.out.println("Do you want to play again(yes/no)");
            int c = sc.nextInt();
            play = c;
            round++;
            if(c==0){
                System.out.println("You got: "+point+" points in "+ round+" rounds");
            }
        }
        sc.close();
    }
}