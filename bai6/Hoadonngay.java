package bai6;

import java.util.Date;
import java.util.Scanner;

public class Hoadonngay extends Hoadon {
    private int ngaythue;
    private double thanhtien;

    public Hoadonngay() {
        super();
    }

    public Hoadonngay(int mahoadon, Date ngay, String ten, String maphong, double dongia, int giothue,
            double thanhtien) {
        super(mahoadon, ngay, ten, maphong, dongia);
        // this.ngaythue = giothue;
        if (giothue % 24 == 0) {
            this.ngaythue = giothue / 24;
        } else {
            this.ngaythue = giothue / 24 + 1;
        }
        this.thanhtien = thanhtien;
    }

    public int getNgaythue() {
        return this.ngaythue;
    }

    public void setNgaythue(int giothue) {
        this.ngaythue = giothue;
    }

    public double getThanhtien() {
        return this.thanhtien;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap gio thue: ");
        this.ngaythue = new Scanner(System.in).nextInt();
        if (this.ngaythue < 7) {
            this.thanhtien = this.ngaythue * 24 * super.dongia;
        } else {
            this.thanhtien = (this.ngaythue * 24 * super.dongia * 7) + ((this.ngaythue - 7) * 24 * super.dongia) * 0.8;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " giothue='" + ngaythue + "'" + ", thanhtien='" + thanhtien + "'";
    }
}