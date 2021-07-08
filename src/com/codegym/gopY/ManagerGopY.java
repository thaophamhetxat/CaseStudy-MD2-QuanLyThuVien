package com.codegym.gopY;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerGopY {
    static ArrayList<HomThu> gopYList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void themMail(String mail) {
        HomThu homThu = createMail(mail);
        gopYList.add(homThu);
    }

    public HomThu createMail(String mail) {
        System.out.println("Tên khách hàng: ");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
        System.out.println("Nội dung: ");
        String noiDung;
        while (true) {
            try {
                noiDung = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Không được để trống");
            }
        }
            return new NguoiDung(name, noiDung);

    }
    public void show(){
        for(HomThu gy:gopYList){
            System.out.println(gy);
        }
    }


    public void writeMail() throws IOException {
        File fileExcelMail = new File("gopY.csv");
        FileWriter fileWriterMail = new FileWriter(fileExcelMail);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriterMail);
        String tieuDe = "tenKhachHang" + "," + "noiDung";
        bufferedWriter.write(tieuDe);
        for (HomThu homThu : gopYList) {
            if(homThu instanceof NguoiDung){
                bufferedWriter.newLine();
                bufferedWriter.write(
                        homThu.getName() + ","
                                + homThu.getNoiDung());
            }
        }
        bufferedWriter.close();
    }


}
