package com.codegym;

public class SachTaiLieu extends ThuVien {
    private String tenSach;
    private String soTrang;

    public SachTaiLieu(){}

    public SachTaiLieu(String tenSach, String soTrang) {
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }


    public SachTaiLieu(int maTaiLieu, String tenTacGia, String tenTaiLieu, String ngaySanXuat, String soXuatBan, float giaNhap, String tenSach, String soTrang) {
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
        return "Sách [" +
                ", mã tài liệu=" + maTaiLieu +
                ", tên tác giả=" + tenTacGia +
                ", tên tài liệu=" + tenTaiLieu +
                ", ngày sản xuất=" + ngaySanXuat +
                ", số xuất bản=" + soXuatBan +
                ", giá nhập=" + giaNhap +"]-"+"--{"+
                ",tên sách=" + tenSach +
                ", số trang=" + soTrang + "}";
    }


}
