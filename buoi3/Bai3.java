package buoi3;

class Sinhvien {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String lop;

    public Sinhvien() {
        ten = "";
        ngaySinh = "";
        gioiTinh = "";
        lop = "";
    }

    public void nhapTen(String ten) {
        this.ten = ten;
    };

    public void nhapNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    };

    public void nhapGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    };

    public void nhapLop(String lop) {
        this.lop = lop;
    };

    public String xemTen() {
        return this.ten;
    };

    public String xemNgaySinh() {
        return this.ngaySinh;
    };

    public String xemGioiTinh() {
        return this.gioiTinh;
    };

    public String xemLop() {
        return this.lop;
    };

}

public class Bai3 {
    public static void main(String[] args) {
    }
}
