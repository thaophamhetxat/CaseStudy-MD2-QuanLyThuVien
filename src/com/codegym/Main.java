package com.codegym;

import java.io.IOException;

public class Main {
    static MenuThuVien menuThuVien;

    static {
        try {
            menuThuVien = new MenuThuVien();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        menuThuVien.start();
        menuThuVien.menu();

    }
}
