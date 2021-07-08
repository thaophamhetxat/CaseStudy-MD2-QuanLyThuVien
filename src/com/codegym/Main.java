package com.codegym;

import java.io.IOException;

public class Main {
    static MenuThuVien menuThuVien = new MenuThuVien();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        menuThuVien.start();
        menuThuVien.menu();

    }
}
