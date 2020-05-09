package bai7;

import java.util.Scanner;

public class Customer extends Person {
    private String tencty;
    private double hoadon;

    public Customer() {
        super();
    }

    public Customer(String name, String addr,String tencty, double hoadon) {
        super(name, addr);
        this.tencty = tencty;
        this.hoadon = hoadon;
    }

    public String getTencty() {
        return this.tencty;
    }

    public void setTencty(String tencty) {
        this.tencty = tencty;
    }

    public double getHoadon() {
        return this.hoadon;
    }

    public void setHoadon(double hoadon) {
        this.hoadon = hoadon;
    }

    public void nhap() {
        System.out.println("ten cty: ");
        this.tencty = new Scanner(System.in).nextLine();
        System.out.println("gia tri hoa don: ");
        this.hoadon = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + " tencty='" + tencty + "'" + ", hoadon='" + hoadon + "'";
    }

}