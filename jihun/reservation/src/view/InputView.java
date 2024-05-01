package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    public static int enter() {
        System.out.println("관람객이 입장합니다. 티켓을 판매하세요.");
        System.out.print("티켓 구매 수량을 입력해주세요 : ");
        return scanner.nextInt();
    }
}
