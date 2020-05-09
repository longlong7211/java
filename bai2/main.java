package bai2;

import java.util.Scanner;

public class main {
    static Sachgiaokhoa[] listsachgiaokhoa = new Sachgiaokhoa[100];
    static Sachthamkhao[] listsachthamkhao = new Sachthamkhao[100];

    public static void main(final String[] args) {
        for (int i = 0; i < 100; i++) {
            listsachgiaokhoa[i] = new Sachgiaokhoa();
            listsachgiaokhoa[i] = new Sachgiaokhoa();
        }
        String x;
        do {
            System.out.println("\n\t ---------------------------------- ");
            System.out.println("\t1. Nhap sach");
            System.out.println("\t2. Xuat sach");
            System.out.println("\t3. Tong thanh tien");
            System.out.println("\t4. Xrung binh don gia");
            System.out.println("\t5. Xuat sach theo NXB");
            System.out.println("\tPress any key to exit...");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            x = new Scanner(System.in).nextLine();
            System.out.println(" -------------------------------------");
            switch (x) {
                case "1":
                    nhapsach();
                    break;
                case "2":
                    xuatsach();
                    break;
                case "3":
                    tong();
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        } while (x != "1" && x != "2" && x != "3" && x != "4" && x != "5");

    }

    private static void tong() {
        String i;
        int index = 0;
        double tongtien = 0;
        System.out.println("\t1. Xuat tong tien sach giao khoa");
        System.out.println("\t2. Xuat tong tien sach tham khao");
        System.out.println("\tPress any key to exit...");
        i = new Scanner(System.in).nextLine();
        switch (i) {
            case "1":
                index = 0;
                System.out.print("Tong tien sach giao khoa: ");
                while (listsachgiaokhoa[index].getMasach() != 0) {
                    tongtien += listsachgiaokhoa[index].getThanhtien();
                    index++;
                }
                System.out.println(tongtien);
                break;
            case "2":
                System.out.println("Tong tiensach tham khao ");
                index = 0;
                while (listsachthamkhao[index].getMasach() != 0) {
                    tongtien += listsachthamkhao[index].getThanhtien();
                    index++;
                }
                System.out.println(tongtien);
                break;
        }
    }

    private static void xuatsach() {
        String i;
        int index = 0;
        System.out.println("\t1. Xuat sach giao khoa");
        System.out.println("\t2. Xuat sach tham khao");
        System.out.println("\tPress any key to exit...");
        i = new Scanner(System.in).nextLine();
        switch (i) {
            case "1":
                index = 0;
                System.out.println("Sach giao khoa ");
                while (listsachgiaokhoa[index].getMasach() != 0) {
                    System.out.print(i + ": ");
                    System.out.println(listsachgiaokhoa[index].toString());
                    index++;
                }
                System.out.println("Xuat hoan tat ");
                break;
            case "2":
                index = 0;
                System.out.println("Sach giao khoa ");
                while (listsachthamkhao[index].getMasach() != 0) {
                    System.out.println(listsachthamkhao[index].toString());
                    index++;
                }
                System.out.println("Xuat hoan tat ");
                break;
        }

    }

    private static void nhapsach() {
        String i;
        int soluong;
        System.out.println("\t1. Nhap sach giao khoa");
        System.out.println("\t2. Xuat sach tham khao");
        System.out.println("\tPress any key to exit...");
        i = new Scanner(System.in).nextLine();
        switch (i) {
            case "1":
                System.out.println("Nhap so luong sach: ");
                soluong = new Scanner(System.in).nextInt();
                for (int index = 0; index < soluong; index++) {
                    listsachgiaokhoa[index] = new Sachgiaokhoa();
                    listsachgiaokhoa[index].nhap();
                    // System.out.println(listsachgiaokhoa[index].toString());
                }
                break;
            case "2":
                System.out.println("Nhap so luong sach: ");
                soluong = new Scanner(System.in).nextInt();
                for (int index = 0; index < soluong; index++) {
                    listsachthamkhao[index] = new Sachthamkhao();
                    listsachthamkhao[index].nhap();
                }
                break;
        }
        System.out.println("Nhap hoan tat ");
    }
}