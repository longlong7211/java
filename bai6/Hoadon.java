package bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hoadon {
    protected int mahoadon;
    protected Date ngay;
    protected String ten, maphong;
    protected double dongia;

    protected Hoadon() {
    }

    protected Hoadon(int mahoadon, Date ngay, String ten, String maphong, double dongia) {
        this.mahoadon = mahoadon;
        this.ngay = ngay;
        this.ten = ten;
        this.maphong = maphong;
        this.dongia = dongia;
    }

    protected int getMahoadon() {
        return this.mahoadon;
    }

    protected void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    protected Date getNgay() {
        return this.ngay;
    }

    protected void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    protected String getTen() {
        return this.ten;
    }

    protected void setTen(String ten) {
        this.ten = ten;
    }

    protected String getMaphong() {
        return this.maphong;
    }

    protected void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    protected double getDongia() {
        return this.dongia;
    }

    protected void setDongia(double dongia) {
        this.dongia = dongia;
    }

    protected void nhap() {
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String ngaytam;
        System.out.println("Ma hoa don: ");
        this.mahoadon = new Scanner(System.in).nextInt();
        System.out.println("Ngay hoa don: ");
        ngaytam = new Scanner(System.in).nextLine();
        try {
            this.ngay = fm.parse(ngaytam);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Ten khach hang: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("Ma phong: ");
        this.maphong = new Scanner(System.in).nextLine();
        System.out.println("Don gia: ");
        this.dongia = new Scanner(System.in).nextDouble();

    }

    @Override
    public String toString() {
        return " mahoadon='" + mahoadon + "'" + ", ngay='" + ngay + "'" + ", ten='" + ten + "'" + ", maphong='"
                + maphong + "'" + ", dongia='" + dongia + "'";
    }

}