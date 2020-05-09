package bai7;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String addr;

    protected Person() {
    }

    protected Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddr() {
        return this.addr;
    }

    protected void setAddr(String addr) {
        this.addr = addr;
    }

    protected void nhap() {
        System.out.println("Ten: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Dia chi: ");
        this.addr = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return " name='" + name + "'" + ", addr='" + addr + "'";
    }
}
