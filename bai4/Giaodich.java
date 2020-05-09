package bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Giaodich {
    protected String magd;
    protected Date ngaygd;
    protected double dongia;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyy");

    protected Giaodich() {
    }

    protected Giaodich(String magd, Date ngaygd, double dongia) {
        this.magd = magd;
        this.ngaygd = ngaygd;
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return " magd='" + magd + "'" + ", ngaygd='" + date.format(ngaygd) + "'" + ", dientich='" + dongia + "'";
    }

    protected String getMagd() {
        return this.magd;
    }

    protected void setMagd(String magd) {
        this.magd = magd;
    }

    protected Date getNgaygd() {
        return this.ngaygd;
    }

    protected void setNgaygd(Date ngaygd) {
        this.ngaygd = ngaygd;
    }

    protected double getDongia() {
        return this.dongia;
    }

    protected void setDongia(double dientich) {
        this.dongia = dientich;
    }

    protected void nhap() {
        System.out.println("Ma GD ");
        this.magd = new Scanner(System.in).nextLine();
        System.out.println("Ngay GD ");
        String temp = new Scanner(System.in).nextLine();
        try {
            this.ngaygd = date.parse(temp);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Don gia ");
        this.dongia = new Scanner(System.in).nextDouble();
    }
}