package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach {
    protected int masach;
    protected Date ngaynhap;
    protected int dongia, soluong;
    protected String nhaxuatban;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    protected Sach() {
        this.masach = 0;
    }

    protected Sach(int masach, Date ngaynhap, int dongia, int soluong, String nhaxuatban) {
        this.masach = masach;
        this.ngaynhap = ngaynhap;
        this.dongia = dongia;
        this.soluong = soluong;
        this.nhaxuatban = nhaxuatban;
    }

    protected int getMasach() {
        return this.masach;
    }

    protected void setMasach(int masach) {
        this.masach = masach;
    }

    protected Date getNgaynhap() {
        return this.ngaynhap;
    }

    protected void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    protected int getDongia() {
        return this.dongia;
    }

    protected void setDongia(int dongia) {
        this.dongia = dongia;
    }

    protected int getSoluong() {
        return this.soluong;
    }

    protected void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    protected String getNhaxuatban() {
        return this.nhaxuatban;
    }

    protected void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    protected void nhap() {
        System.out.println("Nhap ma sach: ");
        masach = new Scanner(System.in).nextInt();
        System.out.println("Ngay nhap: ");
        String nn = new Scanner(System.in).nextLine();
        try {
            this.ngaynhap = (Date) date.parse(nn);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Don gia: ");
        this.dongia = new Scanner(System.in).nextInt();
        System.out.println("So luong: ");
        this.soluong = new Scanner(System.in).nextInt();
        System.out.println("Nha xuat ban: ");
        this.nhaxuatban = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return " masach='" + getMasach() + "'" + ", ngaynhap='" + date.format(getNgaynhap()) + "'" + ", dongia='"
                + getDongia() + "'" + ", soluong='" + getSoluong() + "'" + ", nhaxuatban='" + getNhaxuatban() + "'";
    }

}