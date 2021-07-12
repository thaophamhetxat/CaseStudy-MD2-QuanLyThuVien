package com.codegym;


import java.util.Comparator;

public class SortTaiLieu implements Comparator<ThuVien> {
    @Override
    public int compare(ThuVien o1, ThuVien o2) {
        if(o1.getMaTaiLieu()>o2.getMaTaiLieu()){
            return 1;
        }else if( o1.getMaTaiLieu()==o2.getMaTaiLieu()){
            return 0;
        }else return -1;
    }
}