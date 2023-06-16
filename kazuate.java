import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 75; // プログラマが設定した数
        int maxTries = 5; // ユーザが試行できる最大回数

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < maxTries; i++) {
            System.out.println("2桁の正の整数を予想して入力してください：");

            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                if (userGuess - targetNumber >= 20) {
                    System.out.println("設定された数より20以上大きいです。");
                } else if (targetNumber - userGuess >= 20) {
                    System.out.println("設定された数より20以上小さいです。");
                } else if (userGuess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }
            }
        }
        scanner.close();
    }
}
