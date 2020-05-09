package bai4;

import java.util.Date;
import java.util.Scanner;

public class Giaodichdat extends Giaodich {
    private String loaidat;
    private double dientich, thanhtien;

    public Giaodichdat() {
        super();
    }

    public Giaodichdat(String magd, Date ngaygd, double dongia, String loaidat, double dientich, double thanhtien) {
        super(magd, ngaygd, dongia);
        this.loaidat = loaidat;
        this.dientich = dientich;
        this.thanhtien = thanhtien;
    }

    public String getLoaidat() {
        return this.loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    public double getDientich() {
        return this.dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public double getThanhtien() {
        return this.thanhtien;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Loai dat ");
        this.loaidat = new Scanner(System.in).nextLine();
        System.out.println("Dien tich ");
        this.dientich = new Scanner(System.in).nextDouble();
        if (this.loaidat.equals("A")) {
            this.thanhtien = this.dientich * this.dongia * 1.5;
        } else {
            this.thanhtien = this.dientich * this.dongia;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " loaidat='" + loaidat + "'" + ", dientich='" + dientich + "'" + ", thanhtien='" + thanhtien + "'";
    }

}