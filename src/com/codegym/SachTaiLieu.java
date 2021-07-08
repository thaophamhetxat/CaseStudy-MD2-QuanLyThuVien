package com.codegym;

public class SachTaiLieu extends ThuVien {
    String tenSach;
    String soTrang;

    public SachTaiLieu(){}

    public SachTaiLieu(String tenSach, String soTrang) {
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public SachTaiLieu(String maTaiLieu, String tenTacGia, String tenTaiLieu, String ngaySanXuat, String soXuatBan, float giaNhap, String tenSach, String soTrang) {
        super(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap);
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "SachTaiLieu{" +
                ", maTaiLieu='" + maTaiLieu +
                ", tenTacGia='" + tenTacGia +
                ", tenTaiLieu='" + tenTaiLieu +
                ", ngaySanXuat='" + ngaySanXuat +
                ", soXuatBan='" + soXuatBan +
                ", giaNhap=" + giaNhap +'}'+'{'+
                ",tenSach='" + tenSach +
                ", soTrang='" + soTrang + '}';
    }


}
