package bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
    static ArrayList<Giaodichdat> listgiaodichdat = new ArrayList<Giaodichdat>();
    static ArrayList<Giaodichnha> listgiaodichnha = new ArrayList<Giaodichnha>();

    public static void main(String[] args) {

        String x;
        do {
            System.out.println("\n ---------------------------------- ");
            System.out.println("1. Nhap giao dich");
            System.out.println("2. Tong so gia dich");
            System.out.println("3. Tong thanh tien");
            System.out.println("4. Xuat cac giao dich 09/2013");
            System.out.println("Press any key to exit...");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            x = new Scanner(System.in).nextLine();
            System.out.println(" -------------------------------------");
            switch (x) {
                case "1":
                    Nhapgiaodich();
                    break;
                case "2":
                    System.out.println("Tong gia dich dat:" + listgiaodichdat.size());
                    System.out.println("Tong gia dich nha:" + listgiaodichnha.size());
                    break;
                case "3":
                    int sg = listgiaodichdat.size();
                    double sum = 0;
                    for (int i = 0; i < sg; i++) {
                        sum += listgiaodichdat.get(i).getThanhtien();
                    }
                    System.out.println("Trung binh thanh tien giao dich dat:" + (sum / sg));

                    sg = listgiaodichnha.size();
                    sum = 0;
                    for (int i = 0; i < sg; i++) {
                        sum += listgiaodichnha.get(i).getThanhtien();
                    }
                    System.out.println("Trung binh thanh tien giao dich nha:" + (sum / sg));
                    break;
                case "4":
                    System.out.println("Cac gia dich 09/2013 ");
                    for (int i = 0; i < listgiaodichdat.size(); i++) {
                        if (listgiaodichdat.get(i).getNgaygd().getMonth() == 8
                                && listgiaodichdat.get(i).getNgaygd().getYear() == 113) {
                            System.out.println(listgiaodichdat.get(i).toString());
                        }

                    }
                    for (int i = 0; i < listgiaodichnha.size(); i++) {
                        if (listgiaodichnha.get(i).getNgaygd().getMonth() == 9
                                && listgiaodichnha.get(i).getNgaygd().getYear() == 113) {                          
                            System.out.println(listgiaodichnha.get(i).toString());
                        }

                    }
                    break;

            }
        } while (x != "1" && x != "2" && x != "3" && x != "4");
    }

    private static void Nhapgiaodich() {
        String i;
        int check;
        System.out.println("1. Nhap giao dich dat");
        System.out.println("2. Nhap gia dich nha");
        System.out.println("Press any key to exit...");
        i = new Scanner(System.in).nextLine();
        Giaodichdat giaodichdat;
        Giaodichnha giaodichnha;
        switch (i) {
            case "1":
                check = 1;
                System.out.println("Nhap giao dich dat");
                while (check == 1) {
                    giaodichdat = new Giaodichdat();
                    giaodichdat.nhap();
                    listgiaodichdat.add(giaodichdat);
                    System.out.println("Nhap 1 de tiep tuc...");
                    check = new Scanner(System.in).nextInt();
                }
                break;
            case "2":
                check = 1;
                System.out.println("Nhap giao dich nha");
                while (check == 1) {
                    giaodichnha = new Giaodichnha();
                    giaodichnha.nhap();
                    listgiaodichnha.add(giaodichnha);
                    System.out.println("Nhap 1 de tiep tuc...");
                    check = new Scanner(System.in).nextInt();
                }
                break;
        }
        System.out.println("Nhap hoan tat ");
    }

}