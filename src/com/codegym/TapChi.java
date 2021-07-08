package com.codegym;

public class TapChi extends ThuVien {
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi(){}

    public TapChi(String soPhatHanh, String thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenTacGia, String tenTaiLieu, String ngaySanXuat, String soXuatBan, float giaNhap, String soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenTacGia, tenTaiLieu, ngaySanXuat, soXuatBan, giaNhap);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tạp chí [" +
                ", mã tài liệu=" + maTaiLieu +
                ", tên tác giả=" + tenTacGia +
                ", tên tài liệu=" + tenTaiLieu +
                ", ngày sản xuất=" + ngaySanXuat +
                ", số xuất bản=" + soXuatBan +
                ", giá nhập=" + giaNhap +"]-"+"--{"+
                "số phát hành=" + soPhatHanh +
                ", tháng phát hành=" + thangPhatHanh + " }";
    }

}


