/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCauThu qlcauthu = new QlCauThu();
        int  chon = 11;
        do {
            menu();
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themCauThu();
                    break;
                case 2:
                    xuatDSCauThu();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5: 
                    tinhTuoi();
                    break;
            }
        } while (chon != 11);
    }

    private static void menu() {
        System.out.println("======= QUAN LY CAU THU ======");
        System.out.println("1. Nhap danh sach cau thu");
        System.out.println("2. Xuat thong tin danh sach cau thu");
        System.out.println("3. Xuat danh sach cau thu luong thap nhat");
        System.out.println("4. Sap xep danh sach cau thu theo luong giam dan");
        System.out.println("5. tuoi trung binh cua cau thu");
        System.out.print("ban chon(1->11): ");
    }

}
