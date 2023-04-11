import java.util.Scanner;

public class threeN_add_one {
    public static void main(String[] arge) {
        System.out.println("input number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf("number:%d\n", num);
        while (((num != 1) && (num < 100000))) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 != 0) {
                num = num * 5 - 1;
            }
            System.out.println(num);
        }
    }
}
