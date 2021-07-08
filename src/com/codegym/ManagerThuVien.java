package com.codegym;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerThuVien {

    public static ArrayList<ThuVien> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SortTaiLieu sortTaiLieu = new SortTaiLieu();
    static DocVaGhiTaiLieu docVaGhiTaiLieu = new DocVaGhiTaiLieu();
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
            return new Bao(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap, ngayPhatHanh);

        }
        return null;
    }

    public void editTaiLieu() {
        System.out.println("Nhập mã cần sửa");
        String maTaiLieu;
        while (true) {
            maTaiLieu = scanner.nextLine();
            if (maTaiLieu.equals("")) {
                break;
            } else {
                System.out.println("can't blank");
            }
        }
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaTaiLieu().equals(maTaiLieu)) {
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
            Float giaNhap = Float.parseFloat(scanner.nextLine());

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
            }
            if (list.get(check) instanceof SachTaiLieu) {
                System.out.println("Fix tên sách");
                String tenSach = scanner.nextLine();
                System.out.println("Fix số trang");
                String soTrang = scanner.nextLine();
                ((SachTaiLieu) list.get(check)).setTenSach(tenSach);
                ((SachTaiLieu) list.get(check)).setSoTrang(soTrang);
            }
            if (list.get(check) instanceof TapChi) {
                System.out.println("Fix số phát hành");
                String soPhatHanh = scanner.nextLine();
                System.out.println("Fix tháng phát hành");
                String thangPhatHanh = scanner.nextLine();
                ((TapChi) list.get(check)).setSoPhatHanh(soPhatHanh);
                ((TapChi) list.get(check)).setThangPhatHanh(thangPhatHanh);
            }
        }
    }

    public void displayTaiLieu() {
        if(list.isEmpty()){
            System.out.println("Danh sách trống");
        }
        for (ThuVien tv : list) {
                System.out.println(tv);
        }
    }

    public void searchTaiLieu() {
        System.out.println("Nhập tên tài liệu cần tìm: ");
        String tenTL = scanner.nextLine();
        if(tenTL.isEmpty()){
            System.out.println("Mời nhập tên");
        }
        for (ThuVien tv : list) {
            if (tv.getTenTaiLieu().equals(tenTL)) {
                System.out.println(tv);
            }
        }
    }

    public void deleteTaiLieu() {
        System.out.println("Nhập tên tài liệu cần xóa: ");
        String tenTL = scanner.nextLine();
        if(tenTL.isEmpty()){
            System.out.println("Mời nhập tên");
        }
        for (ThuVien tv : list) {
            if (tv.getTenTaiLieu().equals(tenTL)) {
                System.out.println(tv);
            }
        }
    }

    public void sortMaTaiLieu() {
        if(list.isEmpty()){
            System.out.println("Danh sách trống");
        }
        Collections.sort(list, sortTaiLieu);
    }

    public void ghiFile() throws IOException, ClassNotFoundException {
        ManagerThuVien.docVaGhiTaiLieu.ghiFile();
    }

    public void docFile() throws IOException, ClassNotFoundException {
        ManagerThuVien.docVaGhiTaiLieu.docFile();
    }
}
