package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompt font size , font type, format
        Scanner scanner = new Scanner(System.in);
        System.out.print("Font Size: ");
        int fontSize = scanner.nextInt();
        System.out.print("Font Type: ");
        String fontType = scanner.next();
        System.out.print("Format [1 - Vertical, 2 - Horizontal]: ");
        int format = scanner.nextInt();
        drawEight(fontSize, fontType, format);
    }
    static void drawEight(int fontSize, String fontType, int format) {
        int row;
        int col;
        if (format == 2) {
            col = (fontSize * 2) + 3;
            row = fontSize + 2;
        } else {
            col = fontSize + 2;
            row = (fontSize * 2) + 3;
        }
        for (int y = 0; y < row; y++) {
            System.out.print(fontType);
            for (int x = 1; x < col; x++) {
                if (y == 0 || (y == (row - 1) / 2 && format == 1) || y == row - 1) {
                    System.out.print(fontType);
                } else if (x == col - 1) {
                    System.out.print(fontType);
                } else if (x == col / 2 && format == 2) {
                    System.out.print(fontType);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
