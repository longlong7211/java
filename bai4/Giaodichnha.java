package bai4;

import java.util.Date;
import java.util.Scanner;

public class Giaodichnha extends Giaodich {
    private String loainha, diachi;
    private double dientich, thanhtien;

    public Giaodichnha() {
        super();
    }

    public Giaodichnha(String magd, Date ngaygd, double dongia, String loainha, String diachi, double dientich) {
        super(magd, ngaygd, dongia);
        this.loainha = loainha;
        this.diachi = diachi;
        this.dientich = dientich;
    }

    public String getLoainha() {
        return this.loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
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
        System.out.println("Loai nha ");
        this.loainha = new Scanner(System.in).nextLine();
        System.out.println("Dia chi ");
        this.diachi = new Scanner(System.in).nextLine();
        System.out.println("Dien tich ");
        this.dientich = new Scanner(System.in).nextDouble();
        if (this.loainha.equals("cao cap")) {
            this.thanhtien = this.dientich * this.dongia;
        } else {
            this.thanhtien = this.dientich * this.dongia * 0.9;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " loainha='" + loainha + "'" + ", diachi='" + diachi + "'" + ", dientich='" + dientich
                + "'" + ", thanhtien='" + thanhtien + "'";
    }

}