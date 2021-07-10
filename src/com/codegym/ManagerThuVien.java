package com.codegym;


import com.codegym.validate.ValidateDay;
import com.codegym.validate.ValidateDayMonthPH;
import com.codegym.validate.ValidatePage;
import com.codegym.validate.ValidateNoiDung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManagerThuVien {

    public static ArrayList<ThuVien> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SortTaiLieu sortTaiLieu = new SortTaiLieu();
    private String nameFile;
    private static ValidateDay validateDay = new ValidateDay();
    private static ValidateDayMonthPH validateDayMonthPH = new ValidateDayMonthPH();
    private static ValidateNoiDung validateNoiDung = new ValidateNoiDung();
    private static ValidatePage validatePage = new ValidatePage();

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
            maTaiLieu = scanner.nextLine();
            if (!maTaiLieu.isEmpty()) {
                if (!validateNoiDung.noiDung(maTaiLieu)) {
                    break;
                } else {
                    System.out.println(">>>>[CHÚ Ý]: Mã tài liệu gồm các ký tự từ (a-z/A-Z/0-9) [ví dụ: c04]");
                }
            } else {
                System.out.println("Không được để trống hoặc đã tồn tại");
            }
        }
        System.out.println("Tên tác giả: ");
        String tenTacGia;
        while (true) {
            tenTacGia = scanner.nextLine();
            if (!tenTacGia.isEmpty()) {
                if (!validateNoiDung.noiDung(tenTacGia)) {
                    break;
                } else {
                    System.out.println(">>>>[CHÚ Ý]: Tên tác giả gồm các ký tự từ a-z/A-Z/0-9 [ví dụ: nguyen van a]");
                }
            } else {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Tên tài liệu: ");
        String tenTaiLieu;
        while (true) {
            tenTaiLieu = scanner.nextLine();
            if (!tenTaiLieu.isEmpty()) {
                if (!validateNoiDung.noiDung(tenTaiLieu)) {
                    break;
                } else {
                    System.out.println(">>>>[CHÚ Ý]: Tên tài liệu gồm các ký tự từ a-z/A-Z/0-9 [ví dụ: c04]");
                }
            } else {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Ngày sản xuất: (ví dụ: 09/07/2021) ");
        String ngaySanXuat;
        while (true) {
            ngaySanXuat = scanner.nextLine();
            if (!ngaySanXuat.isEmpty()) {
                if (validateDay.validate(ngaySanXuat)) {
                    break;
                } else {
                    System.out.println("Sai định dạng ngày! nhập lại");
                }
            } else {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Số xuất bản: ");
        String soXuatBan;
        while (true) {
            soXuatBan = scanner.nextLine();
            if (!soXuatBan.isEmpty()) {
                if (!validateNoiDung.noiDung(soXuatBan)) {
                    break;
                } else {
                    System.out.println(">>>>[CHÚ Ý]: Số xuất bản gồm các ký tự từ (a-z/A-Z/0-9) [ví dụ: c04]");
                }
            } else {
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
                tenSach = scanner.nextLine();
                if (!tenSach.isEmpty()) {
                    if (!validateNoiDung.noiDung(tenSach)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Tên sách gồm các ký tự từ (a-z/A-Z/0-9) [ví dụ: ngu van]");
                    }
                } else {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println("Số trang: ");
            String soTrang;
            while (true) {
                soTrang = scanner.nextLine();
                if (!soTrang.isEmpty()) {
                    if (validatePage.page(soTrang)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Số trang gồm các ký tự từ [0-9] [ví dụ: 22]");
                    }
                } else {
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
                soPhatHanh = scanner.nextLine();
                if (!soPhatHanh.isEmpty()) {
                    if (!validateNoiDung.noiDung(soPhatHanh)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Số phát hành gồm các ký tự từ (a-z/A-Z/0-9) [ví dụ: 21]");
                    }
                } else {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println("Tháng phát hành: (ví dụ: 09) ");
            String thangPhatHanh;
            while (true) {
                thangPhatHanh = scanner.nextLine();
                if (!thangPhatHanh.isEmpty()) {
                    if (validateDayMonthPH.dayMonthPH(thangPhatHanh)) {
                        break;
                    } else {
                        System.out.println("Sai định dạng tháng phát hành! nhập lại");
                    }

                } else {
                    System.out.println("Không được để trống");
                }
            }
            System.out.println(">>>>>>>>>>>>> [ĐÃ LƯU] ");
            return new TapChi(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap, soPhatHanh, thangPhatHanh);
        }
        if (taiLieu.equals("Bao")) {
            System.out.println("Ngày phát hành: (ví dụ: 09)");
            String ngayPhatHanh;
            while (true) {
                ngayPhatHanh = scanner.nextLine();
                if (!ngayPhatHanh.isEmpty()) {
                    if (validateDayMonthPH.dayMonthPH(ngayPhatHanh)) {
                        break;
                    } else {
                        System.out.println("Sai định dạng ngày phát hành! nhập lại");
                    }
                } else {
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
            System.out.println("Fix mã tài liệu:   [ví dụ: 10k1]");
            while (true) {
                maTaiLieu = scanner.nextLine();
                if (!maTaiLieu.isEmpty()) {
                    if (!validateNoiDung.noiDung(maTaiLieu)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Mã tài liệu gồm các ký tự từ (a-z/A-Z/0-9) ");
                    }
                } else {
                    System.out.println("Thông tin không được để trống");
                }
            }
            System.out.println("Fix tên tác giả:   [ví dụ: nguyen van a]");
            String tenTacGia;
            while (true) {
                tenTacGia = scanner.nextLine();
                if (!tenTacGia.isEmpty()) {
                    if (!validateNoiDung.noiDung(tenTacGia)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Tên tác giả gồm các ký tự từ a-z/A-Z/0-9");
                    }
                } else {
                    System.out.println("Thông tin không được để trống");
                }
            }
            System.out.println("Fix tên tài liệu:  [ví dụ: toan]");
            String tenTaiLieu;
            while (true) {
                tenTaiLieu = scanner.nextLine();
                if (!tenTaiLieu.isEmpty()) {
                    if (!validateNoiDung.noiDung(tenTaiLieu)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Tên tài liệu gồm các ký tự từ a-z/A-Z/0-9");
                    }
                } else {
                    System.out.println("Thông tin không được để trống");
                }
            }

            System.out.println("Fix ngày sản xuất: (ví dụ: 09/07/2021)");
            String ngaySanXuat;
            while (true) {
                ngaySanXuat = scanner.nextLine();
                if (!ngaySanXuat.isEmpty()) {
                    if (validateDay.validate(ngaySanXuat)) {
                        break;
                    } else {
                        System.out.println("Sai định dạng ngày! nhập lại");
                    }
                } else {
                    System.out.println("Thông tin không được để trống");
                }
            }

            System.out.println("Fix số xuất bản:  [ví dụ: 15]");
            String soXuatBan;
            while (true) {
                soXuatBan = scanner.nextLine();
                if (!soXuatBan.isEmpty()) {
                    if (!validateNoiDung.noiDung(soXuatBan)) {
                        break;
                    } else {
                        System.out.println(">>>>[CHÚ Ý]: Số xuất bản gồm các ký tự từ a-z/A-Z/0-9");
                    }
                } else {
                    System.out.println("Thông tin không được để trống");
                }
            }

            System.out.println("Fix giá nhập");
            float giaNhap;
            while (true) {
                try {
                    giaNhap = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Thông tin không được để trống");
                }
            }
            list.get(check).setMaTaiLieu(maTaiLieu);
            list.get(check).setTenTaiLieu(tenTaiLieu);
            list.get(check).setTenTacGia(tenTacGia);
            list.get(check).setNgaySanXuat(ngaySanXuat);
            list.get(check).setSoXuatBan(soXuatBan);
            list.get(check).setGiaNhap(giaNhap);
            if (list.get(check) instanceof Bao) {
                System.out.println("Fix ngày phát hành");
                String ngayPhatHanh;
                while (true) {
                    ngayPhatHanh = scanner.nextLine();
                    if (!ngayPhatHanh.isEmpty()) {
                        if (validateDayMonthPH.dayMonthPH(ngayPhatHanh)) {
                            ((Bao) list.get(check)).setNgayPhatHanh(ngayPhatHanh);
                            System.out.println(">>>>>>>>>>>>> [ĐÃ SỬA] ");
                            break;
                        } else {
                            System.out.println("Sai định dạng ngày phát hành! nhập lại");
                        }
                    } else {
                        System.out.println("Thông tin không được để trống");
                    }
                }

            }
            if (list.get(check) instanceof SachTaiLieu) {
                System.out.println("Fix tên sách");
                String tenSach;
                while (true) {
                    tenSach = scanner.nextLine();
                    if (!tenSach.isEmpty()) {
                        if (validateNoiDung.noiDung(tenSach)) {
                            ((SachTaiLieu) list.get(check)).setTenSach(tenSach);
                            break;
                        } else {
                            System.out.println(">>>>[CHÚ Ý]: Tên sách gồm các ký tự từ a-z/A-Z/0-9");
                        }
                    } else {
                        System.out.println("Thông tin không được để trống");
                    }
                }
                System.out.println("Fix số trang");
                String soTrang;
                while (true) {
                    soTrang = scanner.nextLine();
                    if (!soTrang.isEmpty()) {
                        if (validatePage.page(soTrang)) {
                            ((SachTaiLieu) list.get(check)).setTenSach(soTrang);
                            break;
                        } else {
                            System.out.println(">>>>[CHÚ Ý]: Số trang gồm các ký tự từ [0-9]");
                        }
                    } else {
                        System.out.println("Thông tin không được để trống");
                    }
                }
                System.out.println(">>>>>>>>>>>>> [ĐÃ SỬA] ");
            }
            if (list.get(check) instanceof TapChi) {
                System.out.println("Fix số phát hành:  [ví dụ: 10]");
                String soPhatHanh;
                while (true) {
                    soPhatHanh = scanner.nextLine();
                    if (!soPhatHanh.isEmpty()) {
                        if (validateNoiDung.noiDung(soPhatHanh)) {
                            ((TapChi) list.get(check)).setSoPhatHanh(soPhatHanh);
                            break;
                        } else {
                            System.out.println(">>>>[CHÚ Ý]: Số phát hành gồm các ký tự từ a-z/A-Z/0-9");
                        }
                    } else {
                        System.out.println("Thông tin không được để trống");
                    }
                }


                System.out.println("Fix tháng phát hành: (ví dụ: 09) ");
                String thangPhatHanh;
                while (true) {
                    thangPhatHanh = scanner.nextLine();
                    if (!thangPhatHanh.isEmpty()) {
                        if (validateDayMonthPH.dayMonthPH(thangPhatHanh)) {
                            ((TapChi) list.get(check)).setSoPhatHanh(thangPhatHanh);
                            break;
                        } else {
                            System.out.println(">>>>[CHÚ Ý]: Tháng phát hành gồm 2 ký tự từ [0-9]");
                        }

                    } else {
                        System.out.println("Thông tin không được để trống");
                    }
                }
                System.out.println(">>>>>>>>>>>>> [ĐÃ SỬA] ");
            }
        }
    }

    public void displayTaiLieu() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống");
        }
        for (ThuVien tv : list) {
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

    public void searchNameTL() {

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

    //    public void readFile() throws IOException {
//        BufferedReader bufferedReader = null;
//        try {
//            FileReader fileReader = new FileReader("thuVien.csv");
//            bufferedReader = new BufferedReader(fileReader);
//            String line = " ";
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] str = line.split(", ");
//                for(ThuVien thuVien:list){
//                    if(thuVien instanceof Bao){
//                        ManagerThuVien.list.add(new ThuVien(getMaTaiLieu));
//                    }
//                }
////                if(str.length>8){
////                    ManagerThuVien.list.add(new ThuVien(str[0], str[1], str[2], str[3], str[4], Float.parseFloat(str[5]), str[6], str[7],str[8],str[10],str[11]));
////                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            bufferedReader.close();
//        }
//
//    }


}


