package bai7;

import java.util.Scanner;

public class Employee extends Person {
    private double heso;
    final double luongcb = 1000000.0;
    private double luong;

    public Employee() {
        super();
    }

    public Employee(String name, String addr, double heso) {
        super(name, addr);
        this.heso = heso;
    }

    public double getLuong() {
        return this.luong;
    }

    public double getHeso() {
        return this.heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public double getLuongcb() {
        return this.luongcb;
    }

    public void tinhluong() {
        this.luong = this.heso * this.luongcb;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap he so: ");
        this.heso = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()+ " heso='" + heso + "'" + ", luongcb='" + luongcb + "'";
    }
}
