package bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Hoadongio> listhoadongio = new ArrayList<Hoadongio>();
    static ArrayList<Hoadonngay> listhoadonngay = new ArrayList<Hoadonngay>();

    public static void main(String[] args) {

        String check;
        do {
            check = "";
            System.out.println("\n ---------------------------------- ");
            System.out.println("1. Nhap danh sach hoa don");
            System.out.println("2. Tong so hoa don tung loai");
            System.out.println("3. trung binh thanh tien hoa don thue phong 9/2013");
            System.out.println("Press any key to exit...");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            check = new Scanner(System.in).nextLine();
            switch (check) {
                case "1":
                    nhaphoadon();
                    break;
                case "2":
                    break;
                case "3":
                    break;

            }
        } while (check != "1" && check != "2" && check != "3");
    }

    public static void nhaphoadon() {
        Hoadongio temp = new Hoadongio();
        Hoadonngay temp2=new Hoadonngay();
        temp.nhap();
        if (temp.getGiothue() < 30) {
            listhoadongio.add(temp);
        }else{

            listhoadonngay.add()
        }
    }
}