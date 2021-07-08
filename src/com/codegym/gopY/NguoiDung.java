package com.codegym.gopY;

public class NguoiDung extends HomThu {
    public NguoiDung() {
    }

    public NguoiDung(String name, String noiDung) {
        super(name, noiDung);
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "name='" + name + '\'' +
                ", noiDung='" + noiDung + '\'' +
                '}';
    }
}
