package com.codegym;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerThuVien {

    public static ArrayList<ThuVien> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SortTaiLieu sortTaiLieu = new SortTaiLieu();
    private String nameFile;

    public ManagerThuVien(String nameFile) {
        this.nameFile = nameFile;

    }


    public void themTaiLieu(String taiLieu) {
        ThuVien thuVien = createTaiLieu(taiLieu);
        list.add(thuVien);
    }

    private ThuVien createTaiLieu(String taiLieu) {
        System.out.println("Mã tài liệu: ");
        String maTaiLieu;
        while (true) {
            try {
                maTaiLieu = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Tên tác giả: ");
        String tenTacGia;
        while (true) {
            try {
                tenTacGia = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Tên tài liệu: ");
        String tenTaiLieu;
        while (true) {
            try {
                tenTaiLieu = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Ngày sản xuất: ");
        String ngaySanXuat;
        while (true) {
            try {
                ngaySanXuat = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Số xuất bản: ");
        String soXuatBan;
        while (true) {
            try {
                soXuatBan = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Giá sản phẩm: ");
        float giaNhap;
        while (true) {
            try {
                giaNhap = Float.parseFloat(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        if (taiLieu.equals("SachTaiLieu")) {
            String tenSach;
            System.out.println("Tên sách: ");
            while (true) {
                try {
                    tenSach = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println("Số trang: ");
            String soTrang;
            while (true) {
                try {
                    soTrang = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println(">>>>>>>>>>>>> [ĐÃ LƯU] ");
            return new SachTaiLieu(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap, tenSach, soTrang);
        }
        if (taiLieu.equals("TapChi")) {
            System.out.println("Số phát hành: ");
            String soPhatHanh;
            while (true) {
                try {
                    soPhatHanh = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println("Tháng phát hành: ");
            String thangPhatHanh;
            while (true) {
                try {
                    thangPhatHanh = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println(">>>>>>>>>>>>> [ĐÃ LƯU] ");
            return new TapChi(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap, soPhatHanh, thangPhatHanh);
        }
        if (taiLieu.equals("Bao")) {
            System.out.println("Ngày phát hành");
            String ngayPhatHanh;
            while (true) {
                try {
                    ngayPhatHanh = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println(">>>>>>>>>>>>> [ĐÃ LƯU] ");
            return new Bao(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap, ngayPhatHanh);


        }
        return null;
    }

    public void editTaiLieu() {
        System.out.println("Nhập mã cần sửa");
        String timTL = scanner.nextLine();
        if (timTL.isEmpty()) {
            System.out.println("Mã nhập trống! Mời nhập lại");
        }
        String maTaiLieu;
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaTaiLieu().equals(timTL)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("Sai ten");
        } else {
            System.out.println("Fix mã tài liệu ");
            maTaiLieu = scanner.nextLine();
            System.out.println("Fix tên tác giả");
            String tenTacGia = scanner.nextLine();
            System.out.println("Fix tên tài liệu");
            String tenTaiLieu = scanner.nextLine();
            System.out.println("Fix ngày sản xuất");
            String ngaySanXuat = scanner.nextLine();
            System.out.println("Fix số xuất bản");
            String soXuatBan = scanner.nextLine();
            System.out.println("Fix giá nhập");
            float giaNhap = Float.parseFloat(scanner.nextLine());

            list.get(check).setMaTaiLieu(maTaiLieu);
            list.get(check).setTenTaiLieu(tenTaiLieu);
            list.get(check).setTenTacGia(tenTacGia);
            list.get(check).setNgaySanXuat(ngaySanXuat);
            list.get(check).setSoXuatBan(soXuatBan);
            list.get(check).setGiaNhap(giaNhap);
            if (list.get(check) instanceof Bao) {
                System.out.println("Fix ngày phát hành");
                String ngayPhatHanh = scanner.nextLine();
                ((Bao) list.get(check)).setNgayPhatHanh(ngayPhatHanh);
                System.out.println(">>>>>>>>>>>>> [ĐÃ SỬA] ");
            }
            if (list.get(check) instanceof SachTaiLieu) {
                System.out.println("Fix tên sách");
                String tenSach = scanner.nextLine();
                System.out.println("Fix số trang");
                String soTrang = scanner.nextLine();
                ((SachTaiLieu) list.get(check)).setTenSach(tenSach);
                ((SachTaiLieu) list.get(check)).setSoTrang(soTrang);
                System.out.println(">>>>>>>>>>>>> [ĐÃ SỬA] ");
            }
            if (list.get(check) instanceof TapChi) {
                System.out.println("Fix số phát hành");
                String soPhatHanh = scanner.nextLine();
                System.out.println("Fix tháng phát hành");
                String thangPhatHanh = scanner.nextLine();
                ((TapChi) list.get(check)).setSoPhatHanh(soPhatHanh);
                ((TapChi) list.get(check)).setThangPhatHanh(thangPhatHanh);
                System.out.println(">>>>>>>>>>>>> [ĐÃ SỬA] ");
            }
        }
    }

    public void displayTaiLieu() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống");
        }
        for (ThuVien tv : list) {
            System.out.println("DANH SÁCH THƯ VIỆN:");
            System.out.println(tv);
        }
    }

    public void searchTaiLieu() {
        System.out.println("Nhập tên tài liệu cần tìm: ");
        String tenTL = scanner.nextLine();
        if (tenTL.isEmpty()) {
            System.out.println("Mời nhập tên");
        }
        for (ThuVien tv : list) {
            if (tv.getTenTaiLieu().equals(tenTL)) {
                System.out.println(tv);
            } else {
                System.out.println("Tài liệu không tồn tại");
            }
        }
    }

    public void deleteTaiLieu() {
        System.out.println("Nhập tên tài liệu cần xóa: ");
        String tenTL = scanner.nextLine();
        if (tenTL.isEmpty()) {
            System.out.println("Mời nhập tên");
        }
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaTaiLieu().equals(tenTL)) {
                check = i;
            }
            if (check < 0) {
                System.out.println("không có trong danh sách");
            } else {
                list.remove(check);
                System.out.println("*****************> ĐÃ XÓA <****************");
            }
        }
    }

    public void sortMaTaiLieu() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống");
        }
        list.sort(sortTaiLieu);
        System.out.println(">>>>>>>>>>>>> [ĐÃ XẮP XẾP] ");
    }


    public void writeFile() throws IOException {
        File fileExcel = new File("thuVien.csv");
        FileWriter fileWriter = new FileWriter(fileExcel);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String tieuDe = "Thuvien" + "," + "maTaiLieu" + "," + "tenTacGia" + "," + "tenTaiLieu" + "," + "ngaySanXuat" + "," + "soXuatBan" + "," +
                "giaNhap" + "," + "ngayPhatHanh" + "," + "tenSach" + "," + "soTrang" + "," + "soPhatHanh" + "," + "thangPhatHanh";
        bufferedWriter.write(tieuDe);
        for (ThuVien tv : ManagerThuVien.list) {
            if (tv instanceof Bao) {
                bufferedWriter.newLine();
                bufferedWriter.write("Bao" + ","
                        + tv.getMaTaiLieu() + ","
                        + tv.getTenTacGia() + ","
                        + tv.getTenTaiLieu() + ","
                        + tv.getNgaySanXuat() + ","
                        + tv.getSoXuatBan() + ","
                        + tv.getGiaNhap() + ","
                        + ((Bao) tv).getNgayPhatHanh());

            } else if (tv instanceof SachTaiLieu) {
                bufferedWriter.newLine();
                bufferedWriter.write("SachTaiLieu" + ", "
                        + tv.getMaTaiLieu() + ","
                        + tv.getTenTacGia() + ","
                        + tv.getTenTaiLieu() + ","
                        + tv.getNgaySanXuat() + ","
                        + tv.getSoXuatBan() + ","
                        + tv.getGiaNhap() + "," + ","
                        + ((SachTaiLieu) tv).getTenSach() + ","
                        + ((SachTaiLieu) tv).getSoTrang());

            } else {
                bufferedWriter.newLine();
                bufferedWriter.write("TapChi" + ", "
                        + tv.getMaTaiLieu() + ","
                        + tv.getTenTacGia() + ","
                        + tv.getTenTaiLieu() + ","
                        + tv.getNgaySanXuat() + ","
                        + tv.getSoXuatBan() + ","
                        + tv.getGiaNhap() + "," + "," + "," + ","
                        + ((TapChi) tv).getThangPhatHanh() + ","
                        + ((TapChi) tv).getSoPhatHanh());
            }
        }
        bufferedWriter.close();
        System.out.println(">>>>>>>>>>>>> ĐÃ GHI <<<<<<<<<<<<");

    }

    public void readFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("thuVien.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(", ");
                for (ThuVien tv : ManagerThuVien.list) {
                    if (tv instanceof Bao) {
                        ManagerThuVien.list.add(new Bao(str[0], str[1], str[2], str[3], str[4], Float.parseFloat(str[5]), str[6]));
                    } else if (tv instanceof SachTaiLieu) {
                        ManagerThuVien.list.add(new SachTaiLieu(str[0], str[1], str[2], str[3], str[4], Float.parseFloat(str[5]), str[6], str[7]));
                    } else {
                        ManagerThuVien.list.add(new TapChi(str[0], str[1], str[2], str[3], str[4], Float.parseFloat(str[5]), str[6], str[7]));
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

    }

}


