package com.codegym;

import java.io.*;
import java.util.ArrayList;

public class DocVaGhiTaiLieu {

    public void ghiFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("taiLieu.csv"));
            String tieuDe = "maTaiLieu" + "," + "tenTacGia" + "," + "tenTaiLieu" + "," + "ngaySanXuat" + "," + "soXuatBan" + "," +
                    "giaNhap" + "," + "ngayPhatHanh" + "," + "tenSach" + "," + "soTrang" + "," + "soPhatHanh" + "," + "thangPhatHanh";
            bufferedWriter.write(tieuDe);
            for (ThuVien tv : ManagerThuVien.list) {
                if (tv instanceof Bao) {
                    bufferedWriter.write(tv.ghi());
                    bufferedWriter.newLine();
                }
            }
            for (ThuVien tv : ManagerThuVien.list) {
                if (tv instanceof SachTaiLieu) {
                    bufferedWriter.write(tv.ghi());
                    bufferedWriter.newLine();
                }
            }
            for (ThuVien tv : ManagerThuVien.list) {
                if (tv instanceof TapChi) {
                    bufferedWriter.write(tv.ghi());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("taiLieu.csv");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        ManagerThuVien.list = (ArrayList<ThuVien>) ois.readObject();

    }
}
