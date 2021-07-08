package com.codegym;

public class ThuVien {
    public String maTaiLieu;
    String tenTacGia;
    String tenTaiLieu;
    String ngaySanXuat;
    String soXuatBan;
    float giaNhap;

    public ThuVien() {
    }

    public ThuVien(String maTaiLieu, String tenTacGia, String tenTaiLieu, String ngaySanXuat, String soXuatBan, float giaNhap) {
        this.maTaiLieu = maTaiLieu;
        this.tenTacGia = tenTacGia;
        this.tenTaiLieu = tenTaiLieu;
        this.ngaySanXuat = ngaySanXuat;
        this.soXuatBan = soXuatBan;
        this.giaNhap = giaNhap;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getSoXuatBan() {
        return soXuatBan;
    }

    public void setSoXuatBan(String soXuatBan) {
        this.soXuatBan = soXuatBan;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    @Override
    public String toString() {
        return "ThuVien{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", tenTaiLieu='" + tenTaiLieu + '\'' +
                ", ngaySanXuat='" + ngaySanXuat + '\'' +
                ", soXuatBan='" + soXuatBan + '\'' +
                ", giaNhap=" + giaNhap + '}';
    }
}
