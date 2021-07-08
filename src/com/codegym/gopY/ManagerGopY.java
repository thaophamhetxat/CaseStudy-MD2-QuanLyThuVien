package com.codegym.gopY;

import com.codegym.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerGopY {
    static ArrayList<GopY> gopYList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void themMail(String mail) {
        GopY gopY = createMail(mail);
        gopYList.add(gopY);
    }

    public GopY createMail(String mail) {
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
        for(GopY gy:gopYList){
            System.out.println(gy);
        }
    }


    public void writeMail() throws IOException {
        File fileExcelMail = new File("gopY.csv");
        FileWriter fileWriterMail = new FileWriter(fileExcelMail);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriterMail);
        String tieuDe = "tenKhachHang" + "," + "noiDung";
        bufferedWriter.write(tieuDe);
        for (GopY gy : gopYList) {
            if(gy instanceof NguoiDung){
                bufferedWriter.newLine();
                bufferedWriter.write(
                        gy.getName() + ","
                                + gy.getNoiDung());
            }
        }
        bufferedWriter.close();
    }


}
