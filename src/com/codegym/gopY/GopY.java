package com.codegym.gopY;

public class GopY {
    String name;
    String noiDung;
    public GopY(){}

    public GopY(String name, String noiDung) {
        this.name = name;
        this.noiDung = noiDung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    @Override
    public String toString() {
        return "GopY{" +
                "name='" + name + '\'' +
                ", noiDung='" + noiDung + '\'' +
                '}';
    }
}
