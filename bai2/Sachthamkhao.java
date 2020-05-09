package bai2;

import java.util.Date;
import java.util.Scanner;

public class Sachthamkhao extends Sach {
    private double thue;
    private double thanhtien;

    public Sachthamkhao() {
        super();
    }

    public Sachthamkhao(int masach, Date ngaynhap, int dongia, int soluong, String nhaxuatban, double thue,
            double thanhtien) {
        super(masach, ngaynhap, dongia, soluong, nhaxuatban);
        this.thue = thue;
        this.thanhtien = thanhtien;
    }

    public double getThue() {
        return this.thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThanhtien() {
        return this.thanhtien;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Thue: ");
        this.thue = new Scanner(System.in).nextDouble();
        this.thanhtien = soluong * dongia * thue / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " thue='" + thue + "'" + ", thanhtien='" + thanhtien + "'" + "}";
    }

}