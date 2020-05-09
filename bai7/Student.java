package bai7;

import java.util.Scanner;

public class Student extends Person {
    private double diem1;
    private double diem2;
    protected double dtb;
    protected String dgia;

    public Student() {
        super();
    }

    public Student(String name, String addr, double diem1, double diem2) {
        super(name, addr);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.tinhdiem();
    }

    public double getDiem1() {
        return this.diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return this.diem2;
    }

    public void setDiem2(final double diem2) {
        this.diem2 = diem2;
    }

    public void tinhdiem() {
        this.dtb = (this.diem1 + this.diem2) / 2;
        if (this.dtb >= 9.0) {
            this.dgia = "Xuat sac";
        } else if (this.dtb >= 8.0) {
            this.dgia = "Gioi";
        } else if (this.dtb >= 6.5) {
            this.dgia = "Kha";
        } else if (this.dtb >= 5.0) {
            this.dgia = "trung binh ";
        }
    }

    public void nhap() {
        super.nhap();
        System.out.println("Diem 1: ");
        this.diem1 = new Scanner(System.in).nextDouble();
        System.out.println("Diem 2: ");
        this.diem2 = new Scanner(System.in).nextDouble();
        this.tinhdiem();
    }

    @Override
    public String toString() {
        return super.toString() + " diem1='" + diem1 + "'" + ", diem2='" + diem2 + "'";
    }

}