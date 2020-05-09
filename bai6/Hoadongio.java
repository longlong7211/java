package bai6;

import java.util.Date;
import java.util.Scanner;

public class Hoadongio extends Hoadon {
    private int giothue;
    private double thanhtien;

    public Hoadongio() {
        super();
    }

    public Hoadongio(int mahoadon, Date ngay, String ten, String maphong, double dongia, int giothue,
            double thanhtien) {
        super(mahoadon, ngay, ten, maphong, dongia);
        this.giothue = giothue;
        this.thanhtien = thanhtien;
    }

    public int getGiothue() {
        return this.giothue;
    }

    public void setGiothue(int giothue) {
        this.giothue = giothue;
    }

    public double getThanhtien() {
        return this.thanhtien;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap gio thue: ");
        this.giothue = new Scanner(System.in).nextInt();
        if (this.giothue < 24) {
            this.thanhtien = this.giothue * super.dongia;
        } else {
            if (this.giothue <= 30) {
                this.thanhtien = 24 * super.dongia;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " giothue='" + giothue + "'" + ", thanhtien='" + thanhtien + "'";
    }

}