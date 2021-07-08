package com.codegym;


public class Bao extends ThuVien {
    private String ngayPhatHanh;
    public Bao(){}

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTaiLieu, String tenTacGia, String tenTaiLieu, String ngaySanXuat, String soXuatBan, float giaNhap, String ngayPhatHanh) {
        super(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Báo [" +
                ", mã tài liệu='" + maTaiLieu +
                ", tên tác giả=" + tenTacGia +
                ", tên tài liệu=" + tenTaiLieu +
                ", ngày sản xuất=" + ngaySanXuat +
                ", số xuất bản=" + soXuatBan +
                ", giá nhập=" + giaNhap +
                "]-"+"--{"+" ngày phát hành=" + ngayPhatHanh  +" }";
    }

}
