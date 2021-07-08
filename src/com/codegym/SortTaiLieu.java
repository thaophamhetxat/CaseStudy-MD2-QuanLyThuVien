package com.codegym;


import java.util.Comparator;

public class SortTaiLieu implements Comparator<ThuVien> {
    @Override
    public int compare(ThuVien o1, ThuVien o2) {
        return o1.getMaTaiLieu().compareTo(o2.maTaiLieu);
    }
}
