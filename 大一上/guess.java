import java.util.Scanner;
public class guess {
    public static void main(String[] arge){
        double randomnum = Math.random();
        randomnum *= 100.0;
        int number = (int)randomnum;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("input you guess number:");
            int guess = scan.nextInt();
            if(guess > number){
                System.out.println("too large");
            }
            else if(guess < number){
                System.out.println("too small");
            }
            else{
                System.out.println("bingo");
                break;
            }
        }
    }
}
