/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    static ArrayList<CauThu> ds = new ArrayList<>();
    
    public QLCauThu() {
    ds = new ArrayList<>();
     
         ds.add(new CauThu(1, "lam thanh tu", 2000, 8000000, 500000, 0) {});
         ds.add(new CauThu(2, "tran anh nguyen", 2001, 7500000, 300000, 50000) {});
         ds.add(new CauThu(3, "duong van lam", 1999, 6000000, 400000, 75000) {});
         ds.add(new CauThu(4, "nguyen thanh ngoc", 1994, 12000000, 350000, 25000) {});
         ds.add(new CauThu(5, "hoang van thanh", 1997, 13000000, 600000, 150000) {});
         ds.add(new CauThu(6, "nuyen quoc chung", 1998, 6000000, 450000, 60000) {});
         ds.add(new CauThu(7, "trinh quang buu", 1998, 10000000, 500000, 40000) {});
         ds.add(new CauThu(8, "tran tan phat", 1994, 11000000, 500000, 20000) {});
         ds.add(new CauThu(9, "nguyen thanh nhut", 1995, 8500000, 550000, 80000) {});
         ds.add(new CauThu(10, "nguyen van hen", 1992, 9000000, 450000, 100000) {});
         ds.add(new CauThu(11, "nguyen phuc hau", 1991, 15000000, 500000, 70000) {});
    }
    private static void themCauThu() {
        CauThu ct=null;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("---------Thuc hien nhap cau thu------------");
        int chon = 0;        
        chon = sc1.nextInt();
        if(chon==1){
            System.out.print("Ho ten: ");
            String hoten = sc2.nextLine();
            System.out.print("So ao: ");
            double soao = sc1.nextDouble();
            System.out.print("Nam Sinh: ");
            double namsinh = sc1.nextDouble();
             System.out.print("Luong: ");
            double luongcung = sc1.nextDouble();
        }
   }         
    private static void xuatDSCauThu() {
        System.out.println("=== DANH SACH CAU THU ===");
        for (CauThu ct : ds) {
            ct.xuat();
            System.out.println("-------------------------");
        }
    }
     private static void sapXep() {
        Comparator<CauThu> cmp = new Comparator<CauThu>() {
            @Override
            public int compare(CauThu ct1, CauThu ct2) {
                return Double.compare(ct2.tinhLuongThuc(), ct1.tinhLuongThuc());

            }
        };  
        Collections.sort(ds,cmp);
        xuatDSCauThu();
    }
}


    
