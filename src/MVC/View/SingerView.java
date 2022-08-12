package MVC.View;

import MVC.Controller.SingerController;
import MVC.Model.Singer;

import java.util.List;
import java.util.Scanner;


public class SingerView {
    Scanner scanner = new Scanner(System.in);

    SingerController singerController = new SingerController();


    public void viewSinger() {
        List<Singer> singerList = singerController.showListSinger();
        System.out.println("===STT=====TEN BAI HAT=====AGE=====");

        for (int i = 0; i < singerList.size(); i++) {
            System.out.println(
                    "=====" + singerList.get(i).getId()
                            + "=====" + singerList.get(i).getName()
                            + "=====" + singerList.get(i).getAge() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void createSinger() {
        System.out.println("NHAP TEN CASI MUON THEM VAO");
        String name = scanner.nextLine();
        System.out.println("NHAP TUOI");
        int age = Integer.parseInt(scanner.nextLine());
        List<Singer> singerList = singerController.createSinger(name, age);
        System.out.println("===STT=====TEN BAI HAT=====AGE=====");

        for (int i = 0; i < singerList.size(); i++) {
            System.out.println(
                    "=====" + singerList.get(i).getId()
                            + "=====" + singerList.get(i).getName()
                            + "=====" + singerList.get(i).getAge() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }


    // Update Thông
    public void updateSinger() {
        System.out.println("NHAP STT MUON SUA");
        int update = Integer.parseInt(scanner.nextLine());
        System.out.println("NHAP TEN CASI MUON SUA");
        String name = scanner.nextLine();
        System.out.println("NHAP AGE MUON SUA");
        int age = Integer.parseInt(scanner.nextLine());
        List<Singer> singerUpdateList = singerController.editSinger(update, name, age);

        for (int i = 0; i < singerUpdateList.size(); i++) {
            System.out.println(
                    "=====" + singerUpdateList.get(i).getId()
                            + "=====" + singerUpdateList.get(i).getName()
                            + "=====" + singerUpdateList.get(i).getAge() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    // SHOW ID
    public void showDetailSinger() {
        System.out.println("Nhap id muon tim");
        int id = Integer.parseInt(scanner.nextLine());
        List<Singer> singerUpdateList = singerController.findSingerById(id);
        for (int i = 0; i < singerUpdateList.size(); i++) {
            System.out.println(
                    "=====" + singerUpdateList.get(i).getId()
                            + "=====" + singerUpdateList.get(i).getName()
                            + "=====" + singerUpdateList.get(i).getAge() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }

    }

    public void sortSinger() {
        List<Singer> singerSort = singerController.sortSinger();
        System.out.println("===STT=====TEN BAI HAT=====AGE=====");
        for (int i = 0; i < singerSort.size(); i++) {
            System.out.println(
                    "=====" + singerSort.get(i).getId()
                            + "=====" + singerSort.get(i).getName()
                            + "=====" + singerSort.get(i).getAge() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }


    }

    public void deleteSinger() {
        System.out.println("Nhap ID MUON XOA ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isValid(id)) {
            System.out.println("Id nam ngoai pham vi");
            return;
        }
        System.out.println("Choose YES or No (Y / N)?");
        String check = scanner.nextLine();
        if (check.equalsIgnoreCase("y")) {
            singerController.deleteSinger(id);
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("Khong Xoa");
        } else {
            System.out.println("Lua chon khong phu hop");
        }

        List<Singer> singerDelete = singerController.sortSinger();

        System.out.println("===STT=====TEN BAI HAT=====AGE=====");
        for (int i = 0; i < singerDelete.size(); i++) {
            System.out.println(
                    "=====" + singerDelete.get(i).getId()
                            + "=====" + singerDelete.get(i).getName()
                            + "=====" + singerDelete.get(i).getAge() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    private boolean isValid(int id) {
        int size = singerController.getSinger().size();
        return id >= 0 && id <size;
    }
}