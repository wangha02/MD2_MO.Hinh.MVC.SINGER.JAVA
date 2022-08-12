package MVC.View;

import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show List Singer "); //
        System.out.println("2. CREATE Product "); ///
        System.out.println("3. UPDATE Product "); ////
        System.out.println("4. DETAIL SINGER ");
        System.out.println("5. Delete Singer  ");
        System.out.println("6. SORT Singer  ");
        System.out.println("0. EXIT ");

        int choiceMenu = scanner.nextInt();
        switch (choiceMenu) {
            case 1:
                new SingerView().viewSinger();
                break;

            case 2:
                new SingerView().createSinger();
                break;

            case 3:
                new SingerView().updateSinger();
                break;

            case 4:
                new SingerView().showDetailSinger();
                break;

            case 5:
                new SingerView().deleteSinger();
                break;
            case 6:
                new SingerView().sortSinger();
                break;
            case 7:
                System.exit(0);
                break;
            default:
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}