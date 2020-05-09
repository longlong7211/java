package bai2;

import java.util.Date;
import java.util.Scanner;

public class Sachgiaokhoa extends Sach {
    private String tinhtrang;
    private double thanhtien;

    public Sachgiaokhoa(int masach, Date ngaynhap, int dongia, int soluong, String nhaxuatban, String tinhtrang) {
        super(masach, ngaynhap, dongia, soluong, nhaxuatban);
        this.tinhtrang = tinhtrang;
    }

    public Sachgiaokhoa() {
        super();
    }

    public String getTinhtrang() {
        return this.tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public double getThanhtien() {
        return this.thanhtien;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Tinh trang: ");
        this.tinhtrang = new Scanner(System.in).nextLine();
        if (this.tinhtrang.equals("moi")) {
            thanhtien = soluong * dongia;
        } else {
            thanhtien = soluong * dongia / 2;
        }

    }

    @Override
    public String toString() {
        return super.toString() + " tinhtrang='" + tinhtrang + "'" + ",thanhtien='" + thanhtien + "'";
    }

}