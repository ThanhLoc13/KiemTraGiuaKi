/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de02;

/**
 *
 * @author ADMIN
 */
public abstract class CauThu {
    public int soAo;
    public String hoTen;
    public int namSinh;
    public int luongCung;
    public int tienThuong;
    public int tienPhat;

    public CauThu(int soAo, String hoTen, int namSinh, int luongCung, int tienThuong, int tienPhat) {
        this.soAo = soAo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    
    void xuat() {
        System.out.println("CauThu[Hoten:" + hoTen + ", soao:" + soAo +
                ", namsinh: " + namSinh + ", luongcung:" + luongCung);
    }
    public double tinhLuongThuc() {
    return luongCung + tienThuong - tienPhat;
    }
}
