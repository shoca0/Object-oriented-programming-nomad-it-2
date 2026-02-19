import java.util.Scanner;

public class Main {

    static int size = 10;   // поле 10x10
    static int x = 0;       // позиция черепашки
    static int y = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Управление: up, right, down, left");
        System.out.println("exit — выход");

        while (true) {

            printField();

            System.out.print("Введите команду: ");
            String command = sc.nextLine().toLowerCase();

            if (command.equals("exit")) break;

            move(command);
        }

        sc.close();
    }

    static void move(String cmd) {
        switch (cmd) {
            case "up":
                if (y > 0) y--;
                break;

            case "down":
                if (y < size - 1) y++;
                break;

            case "left":
                if (x > 0) x--;
                break;

            case "right":
                if (x < size - 1) x++;
                break;

            default:
                System.out.println("Неизвестная команда!");
        }
    }

    static void printField() {
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i == y && j == x)
                    System.out.print("T "); // черепашка
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println("Позиция: x=" + x + " y=" + y);
        System.out.println();
    }
}
